package com.inifire201.MagicWinds.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.Items.
 */
public class ModItem extends Item{

    public ModItem(String name, CreativeTabs tab){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

    public ModItem(String name, CreativeTabs tab, int stacksize){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setMaxStackSize(stacksize);
    }
}
