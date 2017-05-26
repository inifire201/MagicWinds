package com.inifire201.MagicWinds.proxy;

import com.inifire201.MagicWinds.Handlers.BlockHandler;
import com.inifire201.MagicWinds.Handlers.ItemHandler;
import com.inifire201.MagicWinds.Handlers.ToolHandler;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.proxy.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
        super.preInit();
    }

    public void init(){
        super.init();
        System.out.println("mw:ClientProxy init()");
        ItemHandler.registerRenders();
        BlockHandler.registerRenders();
        ToolHandler.registerRenders();
    }

    @Override
    public void postInit() {
        super.postInit();
    }



}
