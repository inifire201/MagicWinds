package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class ItemHandler {

    public static Item testItem;
    public static Item orangeShard;
    public static Item greenShard;
    public static Item whiteShard;
    public static Item purpleShard;

    public static Item testRing;

    public static void init(){
        testItem = new ItemTestItem("test_item", CreativeTabHandler.tabMW);

        orangeShard = new ItemShardOrange("orange_shard", CreativeTabHandler.tabMW, 16);
        greenShard = new ItemShardGreen("green_shard", CreativeTabHandler.tabMW, 16);
        whiteShard = new ItemShardWhite("white_shard", CreativeTabHandler.tabMW, 16);
        purpleShard = new ItemShardPurple("purple_shard", CreativeTabHandler.tabMW, 16);

        testRing = new ItemTestRing("test_ring", CreativeTabHandler.tabMW, 1);

    }

    public static void register(){
        GameRegistry.register(testItem);

        GameRegistry.register(orangeShard);
        GameRegistry.register(greenShard);
        GameRegistry.register(whiteShard);
        GameRegistry.register(purpleShard);

        GameRegistry.register(testRing);

    }

    public static void registerRenders(){
        registerRender(testItem);

        registerRender(orangeShard);
        registerRender(greenShard);
        registerRender(whiteShard);
        registerRender(purpleShard);

        registerRender(testRing);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
