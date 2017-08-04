package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.MultiBlocks.MultiBlockWindCatcher;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.List;

/**
 * Created by Rob de Witte on 1-8-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class MultiBlockHandler {
    public static List WindCatchers;

    public static void register(){
        GameRegistry.registerTileEntity(MultiBlockWindCatcher.class, "wind_catcher");
    }

}
