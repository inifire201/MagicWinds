package com.inifire201.MagicWinds.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Rob de Witte on 25-5-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockShardOre extends ModBlock {

    private static Item itemdropped;

    public static Item getItemdropped() {
        return itemdropped;
    }

    public static void setItemdropped(Item itemdropped) {
        BlockShardOre.itemdropped = itemdropped;
    }

    public static String getAspect() {
        return aspect;
    }

    public static void setAspect(String aspect) {
        BlockShardOre.aspect = aspect;
    }

    private static String aspect;

    public BlockShardOre(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool, Item itemdropped, String aspect) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
        setItemdropped(itemdropped);
        setAspect(aspect);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, @SuppressWarnings("NullableProblems") Random random) {
        return (((random.nextInt(3)+1)*(fortune))+1);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return getItemdropped();
    }
}
