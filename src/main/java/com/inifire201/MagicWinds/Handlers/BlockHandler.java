package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Blocks.*;
import com.inifire201.MagicWinds.TileEntities.BlockTrinketMaker;
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
    public static Block shard_ore_white;
    public static ItemBlock ibshard_ore_white;
    public static Block shard_ore_purple;
    public static ItemBlock ibshard_ore_purple;

    public static Block trinket_maker;
    public static ItemBlock ibtrinket_maker;

    public static void init(){
        test_block = new BlockTestBlock(Material.ROCK, "test_block", CreativeTabHandler.tabMW, 5f, 15f, 3, "pickaxe");
        ibTest_Block =  new ItemBlock(test_block);

        shard_ore_orange = new BlockShardOre(Material.ROCK, "shard_ore_orange", CreativeTabHandler.tabMW, 4f, 10f, 2,"pickaxe", ItemHandler.orangeShard, "orange");
        ibshard_ore_orange = new ItemBlock(shard_ore_orange);
        shard_ore_green = new BlockShardOre(Material.WOOD, "shard_ore_green", CreativeTabHandler.tabMW, 4f, 10f, 2, "axe", ItemHandler.greenShard, "green");
        ibshard_ore_green = new ItemBlock(shard_ore_green);
        shard_ore_white = new BlockShardOre(Material.ROCK, "shard_ore_white", CreativeTabHandler.tabMW, 4f, 10f, 2, "pickaxe" ,ItemHandler.whiteShard, "white");
        ibshard_ore_white = new ItemBlock(shard_ore_white);
        shard_ore_purple = new BlockShardOre(Material.ROCK, "shard_ore_purple", CreativeTabHandler.tabMW, 4f, 10f, 2, "pickaxe" , ItemHandler.purpleShard, "purple");
        ibshard_ore_purple = new ItemBlock(shard_ore_purple);


        trinket_maker = new BlockTrinketMaker(Material.WOOD, "trinket_maker", CreativeTabHandler.tabMW, 4f, 10f, 3,"axe", true);
        ibtrinket_maker = new ItemBlock(trinket_maker);
    }

    public static void register(){
        GameRegistry.register(test_block);
        GameRegistry.register(ibTest_Block, test_block.getRegistryName());

        GameRegistry.register(shard_ore_orange);
        GameRegistry.register(ibshard_ore_orange, shard_ore_orange.getRegistryName());
        GameRegistry.register(shard_ore_green);
        GameRegistry.register(ibshard_ore_green, shard_ore_green.getRegistryName());
        GameRegistry.register(shard_ore_white);
        GameRegistry.register(ibshard_ore_white, shard_ore_white.getRegistryName());
        GameRegistry.register(shard_ore_purple);
        GameRegistry.register(ibshard_ore_purple, shard_ore_purple.getRegistryName());


        GameRegistry.register(trinket_maker);
        GameRegistry.register(ibtrinket_maker, trinket_maker.getRegistryName());
    }

    public static void registerRenders(){
        registerRender(test_block);
        registerRender(shard_ore_orange);
        registerRender(shard_ore_green);
        registerRender(shard_ore_white);
        registerRender(shard_ore_purple);
        registerRender(trinket_maker);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
}
