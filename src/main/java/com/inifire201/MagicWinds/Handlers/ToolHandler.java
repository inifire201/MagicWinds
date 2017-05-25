package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Tools.ToolTestSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 24-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class ToolHandler {

    public static Item testSword;

    public static void init(){

        testSword = new ToolTestSword("test_sword", MaterialHandler.TEST, CreativeTabHandler.tabMW);

    }

    public static void register(){

        GameRegistry.register(testSword);

    }

    public static void registerRenders(){
        registerRender(testSword);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }



}
