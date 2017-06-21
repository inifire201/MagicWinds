package com.inifire201.MagicWinds.Handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by Rob de Witte on 24-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class CraftingHandler {
    public static void init(){
        GameRegistry.addRecipe(new ItemStack(ToolHandler.testSword, 1), " X ", " X ", " C ", 'X', ItemHandler.testItem, 'C', Items.STICK);
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(BlockHandler.trinket_maker, 1), "FSI", "LBL", "LEL", 'F', Items.FLINT, 'S', Items.STICK, 'I', Items.IRON_INGOT, 'L',"logWood", 'B', Blocks.IRON_BLOCK, 'E', Items.EMERALD));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemHandler.redRing, 1), " S ", "SBS", " S ", 'S', ItemHandler.orangeShard, 'B', Items.BLAZE_POWDER));

    }
}
