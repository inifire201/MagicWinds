package com.inifire201.MagicWinds.TileEntities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

import javax.annotation.Nullable;

/**
 * Created by Rob de Witte on 27-5-2017.
 * Package com.inifire201.MagicWinds.TileEntities.
 */
public class TileEntityTrinketMaker extends TileEntity implements IInventory{
    private ItemStack[] inventory;
    private String customName;

    public TileEntityTrinketMaker() {
        inventory = new ItemStack[getSizeInventory()];
    }

    public String getCustomName(){
        return this.customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    @Override
    public String getName(){
        return this.hasCustomName() ? this.customName : "container.trinket_maker";
    }

    @Override
    public boolean hasCustomName() {
        return this.customName != null && !this.customName.equals("");
    }

    @Override
    public ITextComponent getDisplayName() {
        return this.hasCustomName() ? new TextComponentString(this.getName()): new TextComponentTranslation(this.getName());
    }

    @Override
    public int getSizeInventory() {
        return 9;
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        if (index <0 || index >= this.getSizeInventory())
            return null;
        return this.inventory[index];
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        if(this.getStackInSlot(index)!= null){
            ItemStack itemstack;
            if(getStackInSlot(index).getCount()<=count){
                itemstack = this.getStackInSlot(index);
                this.setInventorySlotContents(index, null);
                this.markDirty();
                return itemstack;
            }
            else {
                itemstack = this.getStackInSlot(index).splitStack(count);

                if(this.getStackInSlot(index).getCount() <=0){
                    this.setInventorySlotContents(index ,null);
                }
                else{
                    this.setInventorySlotContents(index, this.getStackInSlot(index));
                }
                this.markDirty();
                return itemstack;
            }
        }
        else {
            return null;
        }
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        ItemStack stack = getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return stack;
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        if (index < 0 || index >= this.getSizeInventory())
            return;

        if (stack != null && stack.getCount() > this.getInventoryStackLimit())
            stack.setCount(this.getInventoryStackLimit());

        if (stack != null && stack.getCount() == 0)
            stack = null;

        this.inventory[index] = stack;
        this.markDirty();
    }

    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return this.world.getTileEntity(this.getPos()) == this && player.getDistanceSq(this.pos.add(0.5,0.5,0.5)) <= 64;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {
        for(int i=0; i <getSizeInventory(); i++){
            setInventorySlotContents(i, null);
        }
    }

    @Override
    public boolean isEmpty() {
        return this.isInventoryEmpty();
    }

    private boolean isInventoryEmpty() {
        for (ItemStack itemstack : this.inventory)
        {
            if (!itemstack.isEmpty())
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);

        NBTTagList list = new NBTTagList();
        for(int i = 0; i<this.getSizeInventory(); i++){
            if(this.getStackInSlot(i) != null){
                NBTTagCompound stackTag = new NBTTagCompound();
                stackTag.setByte("Slot", (byte) i);
                getStackInSlot(i).writeToNBT(stackTag);
                list.appendTag(stackTag);
            }
        }
        compound.setTag("Items", list);

        if(hasCustomName()){
            compound.setString("customName", getCustomName());
        }
        return compound;
    }


    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList list = compound.getTagList("Items", 10);
        for (int i = 0; i < list.tagCount(); ++i) {
            NBTTagCompound stackTag = list.getCompoundTagAt(i);
            int slot = stackTag.getByte("Slot") & 255;
            this.setInventorySlotContents(slot, new ItemStack(compound));
        }

        if (compound.hasKey("CustomName", 8)) {
            this.setCustomName(compound.getString("CustomName"));
        }
    }
}
