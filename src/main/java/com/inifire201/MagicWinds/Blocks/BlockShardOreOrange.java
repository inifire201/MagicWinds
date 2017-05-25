package com.inifire201.MagicWinds.Blocks;

import com.inifire201.MagicWinds.Handlers.ItemHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Rob de Witte on 25-5-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockShardOreOrange extends BlockShardOre{
    public BlockShardOreOrange(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

    @SuppressWarnings("NullableProblems")
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ItemHandler.orangeShard;
    }


}
