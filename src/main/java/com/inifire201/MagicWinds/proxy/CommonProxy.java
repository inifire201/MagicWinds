package com.inifire201.MagicWinds.proxy;


import com.inifire201.MagicWinds.Handlers.*;
import com.inifire201.MagicWinds.World.ModWorldGen;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rob de Witte on 22-5-2017.
 * Package com.inifire201.MagicWinds.proxy.
 */
public class CommonProxy implements IProxy {
    @Override
    public void preInit() {
        ItemHandler.init();
        ItemHandler.register();
        BlockHandler.init();
        BlockHandler.register();
        ToolHandler.init();
        ToolHandler.register();
        TileEnitityHandler.register();
        EnchantingHandler.init();
        EnchantingHandler.register();
    }

    @Override
    public void init() {
        GameRegistry.registerWorldGenerator( new ModWorldGen(),0);
    }

    @Override
    public void postInit() {
        CraftingHandler.init();
    }
}
