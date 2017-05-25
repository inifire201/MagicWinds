package com.inifire201.MagicWinds.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Rob de Witte on 24-5-2017.
 * Package com.inifire201.MagicWinds.Tools.
 */
public class ModToolSword extends ItemSword {
    public ModToolSword(String name, ToolMaterial material, CreativeTabs tab) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
