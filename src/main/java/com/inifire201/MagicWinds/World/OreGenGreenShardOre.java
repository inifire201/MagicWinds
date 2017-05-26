package com.inifire201.MagicWinds.World;

import com.inifire201.MagicWinds.Handlers.BlockHandler;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Rob de Witte on 26-5-2017.
 * Package com.inifire201.MagicWinds.World.
 */
public class OreGenGreenShardOre implements IWorldGenerator {

    private static int topY = 60;
    private static int bottomY =10;
    private static int maxX = 3;
    private static int maxZ = 3;
    private static int veins = 25;
    private static Block block = BlockHandler.shard_ore_green;
    private static int maxVeinSize = 3;


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension()){
            case -1:
                break;
            case 0:genSurface(world, chunkX, chunkZ, random);
                break;
            case 1:
                break;
        }

    }

    private void genSurface(World world, int chunkX, int chunkZ, Random random){
        addOreSpawn(world, topY, bottomY, chunkX, maxX, chunkZ, maxZ, veins, block.getDefaultState(),maxVeinSize,random);
    }

    private void addOreSpawn(World world, int maxY, int minY, int blockXpos, int maxX, int blockZpos, int maxZ, int veins, IBlockState blockState, int maxVeinSize, Random random){
        int diffMinMaxY = maxY - minY;
        for(int x = 0; x<veins; x++){
            int posX = blockXpos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffMinMaxY);
            int posZ = blockZpos + random.nextInt(maxZ);
            new WorldGenMinable(blockState, maxVeinSize).generate(world, random, new BlockPos(posX,posY,posZ));
        }
    }
}
