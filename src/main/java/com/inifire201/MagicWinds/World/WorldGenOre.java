package com.inifire201.MagicWinds.World;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
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

        }
    }
    void genSurface(){
        return;
    }
}
