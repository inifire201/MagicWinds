package com.inifire201.MagicWinds.TileEntities;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 27-5-2017.
 * Package com.inifire201.MagicWinds.TileEntities.
 */
public class BlockTrinketMaker extends ModBlockTileEntity{


//    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    public BlockTrinketMaker(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, boolean isContainer) {
        super(mat, name, tab, hardness, resistance, harvest, tool, isContainer);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityTrinketMaker();
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
 //       worldIn.setBlockState(pos, state.withProperty(FACING, EnumFacing.getDirectionFromEntityLiving(pos, placer)), 2);
        if (stack.hasDisplayName()){
            ((TileEntityTrinketMaker)worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
        }
    }

    @Override
    public void breakBlock(World world, BlockPos pos, IBlockState state) {
        TileEntityTrinketMaker te = (TileEntityTrinketMaker) world.getTileEntity(pos);
        super.breakBlock(world, pos, state);
    }
}
