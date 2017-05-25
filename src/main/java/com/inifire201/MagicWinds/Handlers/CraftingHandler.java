package com.inifire201.MagicWinds.Handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 24-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class CraftingHandler {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ToolHandler.testSword, 1), " X ", " X ", " C ", 'X', ItemHandler.testItem, 'C', Items.STICK);
    }
}
