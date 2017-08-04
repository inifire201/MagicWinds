package com.inifire201.MagicWinds.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Rob de Witte on 1-8-2017.
 * Package com.inifire201.MagicWinds.Blocks.
 */
public class BlockExtractorWind extends ModBlock{

    public BlockExtractorWind(Material mat, String name, CreativeTabs tab, float hardness, float resistance, int harvest, String tool) {
        super(mat, name, tab, hardness, resistance, harvest, tool);
    }

}
