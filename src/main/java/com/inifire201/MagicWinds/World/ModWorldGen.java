package com.inifire201.MagicWinds.World;

import com.inifire201.MagicWinds.Handlers.BlockHandler;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Rob de Witte on 26-5-2017.
 * Package com.inifire201.MagicWinds.World.
 */
public class ModWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case -1:
                break;
            case 0:
                break;
            case 1:
                break;
        }
    }

    public ModWorldGen() {
        this.gen_green_shard_ore = new WorldGenMinable(BlockHandler.shard_ore_green.getDefaultState(), 4);
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX)
}
