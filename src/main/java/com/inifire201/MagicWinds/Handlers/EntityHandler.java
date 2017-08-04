package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Entities.EntityGreenWind;
import com.inifire201.MagicWinds.Ref;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.EntityEntry;

/**
 * Created by Rob de Witte on 20-7-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
@Mod.EventBusSubscriber(modid = Ref.MODID)
public class EntityHandler {
    //Rendering
    public static void regiserRendering(){

    }


    //Entities
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event){
        event.getRegistry().register(new EntityEntry(EntityGreenWind.class, "green_wind"));
    }

}
