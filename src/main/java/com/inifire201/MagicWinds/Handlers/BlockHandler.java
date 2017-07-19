package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Blocks.BlockShardOre;
import com.inifire201.MagicWinds.Blocks.BlockTestBlock;
import com.inifire201.MagicWinds.Ref;
import com.inifire201.MagicWinds.TileEntities.BlockTrinketMaker;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rob de Witte on 19-7-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
@Mod.EventBusSubscriber(modid = Ref.MODID)
public class BlockHandler {
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static Block test_block = new BlockTestBlock(Material.ROCK, "test_block", CreativeTabHandler.tabMW, 5f, 15f, 3, "pickaxe");

    public static Block shard_ore_orange = new BlockShardOre(Material.ROCK, "shard_ore_orange", CreativeTabHandler.tabMW, 4f, 10f, 2,"pickaxe", ItemHandler.orangeShard, "orange");
    public static Block shard_ore_green = new BlockShardOre(Material.WOOD, "shard_ore_green", CreativeTabHandler.tabMW, 4f, 10f, 2, "axe", ItemHandler.greenShard, "green");
    public static Block shard_ore_white = new BlockShardOre(Material.ROCK, "shard_ore_white", CreativeTabHandler.tabMW, 4f, 10f, 2, "pickaxe" ,ItemHandler.whiteShard, "white");
    public static Block shard_ore_purple = new BlockShardOre(Material.ROCK, "shard_ore_purple", CreativeTabHandler.tabMW, 4f, 10f, 2, "pickaxe" , ItemHandler.purpleShard, "purple");

    public static Block trinket_maker = new BlockTrinketMaker(Material.WOOD, "trinket_maker", CreativeTabHandler.tabMW, 4f, 10f, 3,"axe", true);

    //-------------------

    //TODO Fix this, error: nullpointer exeption. added blocks are null
/*
    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<Item> event){
        BLOCKS.add(test_block);

        BLOCKS.add(shard_ore_green);
        BLOCKS.add(shard_ore_orange);
        BLOCKS.add(shard_ore_purple);
        BLOCKS.add(shard_ore_white);

        BLOCKS.add(trinket_maker);

        for(Block block: BLOCKS){
            event.getRegistry().register(new ItemBlock(block));
        }
    }
*/

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for(Block block: BLOCKS){
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }
}
