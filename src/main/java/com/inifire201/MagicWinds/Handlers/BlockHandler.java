package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Blocks.BlockShardOreGreen;
import com.inifire201.MagicWinds.Blocks.BlockShardOreOrange;
import com.inifire201.MagicWinds.Blocks.BlockTestBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 23-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class BlockHandler {


    public static Block test_block;
    public static ItemBlock ibTest_Block;
    public static Block shard_ore_orange;
    public static ItemBlock ibshard_ore_orange;
    public static Block shard_ore_green;
    public static ItemBlock ibshard_ore_green;

    public static void init(){
        test_block = new BlockTestBlock(Material.ROCK, "test_block", CreativeTabHandler.tabMW, 5f, 15f, 3, "pickaxe");
        ibTest_Block =  new ItemBlock(test_block);
        shard_ore_orange = new BlockShardOreOrange(Material.ROCK, "shard_ore_orange", CreativeTabHandler.tabMW, 4f, 10f, 2,"pickaxe");
        ibshard_ore_orange = new ItemBlock(shard_ore_orange);
        shard_ore_green = new BlockShardOreGreen(Material.WOOD, "shard_ore_green", CreativeTabHandler.tabMW, 4f, 10f, 2, "axe");
        ibshard_ore_green = new ItemBlock(shard_ore_green);
    }

    public static void register(){
        GameRegistry.register(test_block);
        GameRegistry.register(ibTest_Block, test_block.getRegistryName());
        GameRegistry.register(shard_ore_orange);
        GameRegistry.register(ibshard_ore_orange, shard_ore_orange.getRegistryName());
        GameRegistry.register(shard_ore_green);
        GameRegistry.register(ibshard_ore_green,shard_ore_green.getRegistryName());
    }

    public static void registerRenders(){
        registerRender(test_block);
        registerRender(shard_ore_orange);
        registerRender(shard_ore_green);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
}
