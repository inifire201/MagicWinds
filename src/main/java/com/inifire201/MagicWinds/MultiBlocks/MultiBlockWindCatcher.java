package com.inifire201.MagicWinds.MultiBlocks;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 2-8-2017.
 * Package com.inifire201.MagicWinds.MultiBlocks.
 */
public class MultiBlockWindCatcher extends TileEntity{
    private static BlockPos MBlockPos;
    private static boolean IsMultiBlock = false;

    public static boolean getisIsMultiBlock() {
        return IsMultiBlock;
    }
    public static void setIsMultiBlock(boolean isMultiBlock) {
        IsMultiBlock = isMultiBlock;
    }
    public static BlockPos getMBlockPos() {
        return MBlockPos;
    }
    public static void setMBlockPos(BlockPos MBlockPos) {
        MultiBlockWindCatcher.MBlockPos = MBlockPos;
    }




    public MultiBlockWindCatcher() {
        int x = getPos().getX() - 3;
        int y = getPos().getY() - 8;
        int z = getPos().getZ() - 3;
        setMBlockPos(new BlockPos(x,y,z));

        super.onLoad();
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        int x = compound.getInteger("mbx");
        int y = compound.getInteger("mby");
        int z = compound.getInteger("mbz");

        setIsMultiBlock(compound.getBoolean("ismb"));
        setMBlockPos(new BlockPos(x,y,z));
        super.readFromNBT(compound);
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("mbx", getMBlockPos().getX());
        compound.setInteger("mby", getMBlockPos().getY());
        compound.setInteger("mbz", getMBlockPos().getZ());
        compound.setBoolean("ismb", getisIsMultiBlock());

        return super.writeToNBT(compound);
    }

    @Override
    public World getWorld() {
        return super.getWorld();
    }

    @Override
    public void setWorld(World worldIn) {
        super.setWorld(worldIn);
    }


    @Override
    protected void setWorldCreate(World worldIn) {
        super.setWorldCreate(worldIn);
    }

    @Override
    public BlockPos getPos() {
        return super.getPos();
    }




}
