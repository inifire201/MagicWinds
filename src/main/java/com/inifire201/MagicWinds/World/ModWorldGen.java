package com.inifire201.MagicWinds.World;

import com.inifire201.MagicWinds.Handlers.BlockHandler;
import net.minecraft.util.math.BlockPos;
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
                this.runGenerator(this.gen_green_shard_ore, world, random, chunkX, chunkZ, 20,0, 60);
                break;
            case 1:
                this.runGenerator(this.gen_white_shard_ore, world, random, chunkX, chunkZ, 20,0, 60);
                break;
            case 1:
                this.runGenerator(this.gen_orange_shard_ore, world, random, chunkX, chunkZ, 20,0, 60);
                break;
            case 1:
                this.runGenerator(this.gen_purple_shard_ore, world, random, chunkX, chunkZ, 20,0, 60);
                break;
            case 1:
                break;
        }
    }

    private WorldGenerator gen_green_shard_ore;
    private WorldGenerator gen_white_shard_ore;
    private WorldGenerator gen_orange_shard_ore;
    private WorldGenerator gen_purple_shard_ore;

    public ModWorldGen() {
        this.gen_green_shard_ore = new WorldGenMinable(BlockHandler.shard_ore_green.getDefaultState(), 4);
        this.gen_orange_shard_ore = new WorldGenMinable(BlockHandler.shard_ore_orange.getDefaultState(), 4);
        this.gen_white_shard_ore = new WorldGenMinable(BlockHandler.shard_ore_white.getDefaultState(), 4);
        this.gen_purple_shard_ore = new WorldGenMinable(BlockHandler.shard_ore_purple.getDefaultState(), 4);
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int Veins, int minY, int maxY){
        int diffY = maxY - minY + 1;
            for(int i=0; i<Veins; i++){
                int x = chunkX*16 + random.nextInt(16);
                int y = minY +random.nextInt(diffY);
                int z = chunkZ*16 + random.nextInt(16);
                generator.generate(world, random, new BlockPos(x,y,z));
            }
    }
}
