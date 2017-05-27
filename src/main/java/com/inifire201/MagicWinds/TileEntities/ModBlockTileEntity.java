package com.inifire201.MagicWinds.TileEntities;

import com.inifire201.MagicWinds.Blocks.ModBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 26-5-2017.
 * Package com.inifire201.MagicWinds.TileEntities.
 */
public class ModBlockTileEntity extends ModBlock implements ITileEntityProvider{

    public ModBlockTileEntity(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, boolean isContainer) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
        isBlockContainer = isContainer;
    }



    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        super.breakBlock(world, pos, state);
        world.removeTileEntity(pos);
    }



}
