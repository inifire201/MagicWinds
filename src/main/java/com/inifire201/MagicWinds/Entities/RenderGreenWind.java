package com.inifire201.MagicWinds.Entities;

import com.inifire201.MagicWinds.Ref;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Rob de Witte on 20-7-2017.
 * Package com.inifire201.MagicWinds.Entities.
 */
public class RenderGreenWind extends RenderLiving {

    protected ResourceLocation greenWindTexture;

    @Override
    protected void preRenderCallback(EntityLivingBase entitylivingbaseIn, float partialTickTime) {
        //Ghelemaal niks nog
    }



    public RenderGreenWind(RenderManager rendermanagerIn, ModelBase modelbaseIn, float shadowsizeIn) {
        super(rendermanagerIn, modelbaseIn, shadowsizeIn);
        setEntityTexture();
    }

    private void setEntityTexture(){
        greenWindTexture = new ResourceLocation(Ref.MODID+":textures/entity/winds/greenwind.png");
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return greenWindTexture;
    }

}
