package com.inifire201.MagicWinds.World;

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
 * Created by Rob de Witte on 25-5-2017.
 * Package com.inifire201.MagicWinds.World.
 */
public class WorldGenOre implements IWorldGenerator{
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

    /*
           world        World to generate in.
           topy         Highest up to generate
           bottomY      Lowest to generate
           chunkX       loc in chunk
           maxX         max X to generate
           chunkZ       loc in chunk
           maxZ         max Z to generate
           veins        amount of veins in given chunk
           block        block to generate
           maxVeinSize  amount of blocks in veins
           Random       -
     */

    private void genUnderworld(World world, int topY, int bottomY, int chunkX, int maxX, int chunkZ, int maxZ, int veins, Block block, int maxVeinSize, Random random){
        addOreSpawn(world, topY, bottomY, chunkX, maxX, chunkZ, maxZ, veins, block.getDefaultState(),maxVeinSize,random);
    }

    private void genSurface(World world, int topY, int bottomY, int chunkX, int maxX, int chunkZ, int maxZ, int veins, Block block, int maxVeinSize, Random random){
        addOreSpawn(world, topY, bottomY, chunkX, maxX, chunkZ, maxZ, veins, block.getDefaultState(),maxVeinSize,random);
    }

    private void genEnd(World world, int topY, int bottomY, int chunkX, int maxX, int chunkZ, int maxZ, int veins, Block block, int maxVeinSize, Random random){
        addOreSpawn(world, topY, bottomY, chunkX, maxX, chunkZ, maxZ, veins, block.getDefaultState(),maxVeinSize,random);
    }

    private void addOreSpawn(World world,int maxY, int minY, int blockXpos,int maxX, int blockZpos, int maxZ,int veins, IBlockState blockState, int maxVeinSize,Random random){
        int diffMinMaxY = maxY - minY;
        for(int x = 0; x<veins; x++){
            int posX = blockXpos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffMinMaxY);
            int posZ = blockZpos + random.nextInt(maxZ);
            new WorldGenMinable(blockState, maxVeinSize).generate(world, random, new BlockPos(posX,posY,posZ));
        }
    }


}
