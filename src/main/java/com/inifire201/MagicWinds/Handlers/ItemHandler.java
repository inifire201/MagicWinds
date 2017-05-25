package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Items.ItemShardOrange;
import com.inifire201.MagicWinds.Items.ItemTestItem;
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

    public static void init(){
        testItem = new ItemTestItem("test_item", CreativeTabHandler.tabMW);
        orangeShard = new ItemShardOrange("orange_shard", CreativeTabHandler.tabMW);
    }

    public static void register(){
        GameRegistry.register(testItem);
        GameRegistry.register(orangeShard);
    }

    public static void registerRenders(){
        registerRender(testItem);
        registerRender(orangeShard);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
