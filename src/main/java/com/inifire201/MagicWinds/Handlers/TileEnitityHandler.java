package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.TileEntities.TestTileEntity;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 26-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class TileEnitityHandler{

    public static void register(){
        GameRegistry.registerTileEntity(TestTileEntity.class, "test_tile_entity");
    }
}
