package com.inifire201.MagicWinds.MultiBlocks;

import com.inifire201.MagicWinds.Blocks.ModBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by Rob de Witte on 31-7-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockWindCatcher extends ModBlock implements ITileEntityProvider{


    public BlockWindCatcher(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        worldIn.removeTileEntity(pos);
        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public void onBlockDestroyedByPlayer(World worldIn, BlockPos pos, IBlockState state) {
        System.out.println("DESTROYED!");
        super.onBlockDestroyedByPlayer(worldIn, pos, state);
    }


    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new MultiBlockWindCatcher();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        TileEntity tileEntity = worldIn.getTileEntity(pos);
        checkMultiBlock(tileEntity, playerIn, worldIn);

        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, facing, hitX, hitY, hitZ);
    }

    public boolean checkMultiBlock(TileEntity tileEntity, EntityPlayer player, World world){
        NBTTagCompound compound = tileEntity.getTileData();
        int x = compound.getInteger("mbx");
        int y = compound.getInteger("mby");
        int z = compound.getInteger("mbz");

        BlockPos pos = new BlockPos(x,y,z);

        if(
                world.getBlockState(pos).getBlock() == Blocks.LOG &&
                world.getBlockState(pos.add(1,0,0)).getBlock() == Blocks.OAK_STAIRS
                //TODO add in the other blocks
                ){

            player.sendMessage(new TextComponentString(TextFormatting.RED + "true"));
            return true;
        }

        else {
            player.sendMessage(new TextComponentString(TextFormatting.RED + "false"));
            return false;
        }
    }



}