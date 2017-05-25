package com.inifire201.MagicWinds.Blocks;

import com.inifire201.MagicWinds.Handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Rob de Witte on 23-5-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockTestBlock extends ModBlock{
    public BlockTestBlock(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemHandler.testItem;
    }

    public int quantityDropped(IBlockState state, int fortune, Random random) {
        return random.nextInt(2)+1;
    }
}
