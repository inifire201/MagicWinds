package com.inifire201.MagicWinds.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;

import java.util.Random;

/**
 * Created by Rob de Witte on 25-5-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockShardOre extends ModBlock {

    BlockShardOre(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

    @Override
    public int quantityDropped(IBlockState state, int fortune, @SuppressWarnings("NullableProblems") Random random) {
        return (((random.nextInt(3)+1)*(fortune))+1);
    }

}
