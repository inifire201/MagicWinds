package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.World.OreGenGreenShardOre;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 26-5-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class WorldGenHandler {
    public static void register(){
        GameRegistry.registerWorldGenerator(new OreGenGreenShardOre(), 0);
    }
}
