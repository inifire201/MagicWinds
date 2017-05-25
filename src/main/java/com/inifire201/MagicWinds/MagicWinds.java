package com.inifire201.MagicWinds;

import com.inifire201.MagicWinds.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.
 */
@Mod(modid = Ref.MODID, version = Ref.VERSION, name = Ref.NAME )
public class MagicWinds {

    @SidedProxy(clientSide = Ref.CLIENT_PROXY, serverSide = Ref.SERVER_PROXY,modId = Ref.MODID)
    public static IProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        proxy.preInit();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event){
        proxy.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
    }
}
