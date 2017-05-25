package com.inifire201.MagicWinds.proxy;


import com.inifire201.MagicWinds.Handlers.BlockHandler;
import com.inifire201.MagicWinds.Handlers.CraftingHandler;
import com.inifire201.MagicWinds.Handlers.ItemHandler;
import com.inifire201.MagicWinds.Handlers.ToolHandler;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.proxy.
 */
public class CommonProxy implements IProxy {

    public void preInit() {
        ItemHandler.init();
        ItemHandler.register();
        BlockHandler.init();
        BlockHandler.register();
        ToolHandler.init();
        ToolHandler.register();
    }

    public void init() {
    }

    @Override
    public void postInit() {
        CraftingHandler.init();
    }
}
