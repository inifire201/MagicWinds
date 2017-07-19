package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Items.*;
import com.inifire201.MagicWinds.Ref;
import com.inifire201.MagicWinds.Tools.ToolTestSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob de Witte on 19-7-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
@Mod.EventBusSubscriber(modid = Ref.MODID)
public class ItemHandler {
    public static List<Item> ITEMS = new ArrayList<Item>();

    public static Item debugItem = new ItemDebug("debug", CreativeTabHandler.tabMW);
    public static Item testItem = new ItemTestItem("test_item", CreativeTabHandler.tabMW);
    public static Item orangeShard = new ItemShardOrange("orange_shard", CreativeTabHandler.tabMW, 16);
    public static Item greenShard = new ItemShardGreen("green_shard", CreativeTabHandler.tabMW, 16);
    public static Item whiteShard = new ItemShardWhite("white_shard", CreativeTabHandler.tabMW, 16);
    public static Item purpleShard = new ItemShardPurple("purple_shard", CreativeTabHandler.tabMW, 16);

    public static Item testRing = new ItemTestRing("test_ring", CreativeTabHandler.tabMW, 1);
    public static Item redRing = new ItemRedRing("red_ring", CreativeTabHandler.tabMW, 4);


    //Tools
    public static Item testSword = new ToolTestSword("test_sword", MaterialHandler.TEST, CreativeTabHandler.tabMW);


    //Register the items ingame
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        ITEMS.add(testItem);
        ITEMS.add(debugItem);

        ITEMS.add(orangeShard);
        ITEMS.add(greenShard);
        ITEMS.add(whiteShard);
        ITEMS.add(purpleShard);

        ITEMS.add(testRing);
        ITEMS.add(redRing);

        //tools
        ITEMS.add(testSword);

        for(Item item : ITEMS){
            event.getRegistry().register(item);
        }
    }

    //This registers the models
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for(Item item: ITEMS){
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
