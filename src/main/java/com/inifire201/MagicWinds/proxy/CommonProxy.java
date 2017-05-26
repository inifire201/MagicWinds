package com.inifire201.MagicWinds.proxy;


import com.inifire201.MagicWinds.Handlers.*;

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
        WorldGenHandler.register();
    }

    @Override
    public void postInit() {
        CraftingHandler.init();
    }
}
