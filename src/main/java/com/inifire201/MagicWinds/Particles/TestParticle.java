package com.inifire201.MagicWinds.Particles;

import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 20-7-2017.
 * Package com.inifire201.MagicWinds.Particles.
 */
public class TestParticle extends Particle {
    public TestParticle(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
    }
}
