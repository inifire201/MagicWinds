package com.inifire201.MagicWinds.Handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Rob de Witte on 23-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class CreativeTabHandler {
    public static CreativeTabs tabMW = new CreativeTabs("mw") {

        public ItemStack getTabIconItem() {
            return new ItemStack(Item.getItemFromBlock(BlockHandler.test_block));
        }
    };
}
