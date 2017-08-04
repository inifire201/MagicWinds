package com.inifire201.MagicWinds.Entities.Models;

import com.inifire201.MagicWinds.Entities.EntityGreenWind;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Rob de Witte on 3-8-2017.
 * Package com.inifire201.MagicWinds.Entities.Models.
 */
public class ModelGreenWind extends ModelBase{
    public ModelRenderer base;
    public ModelRenderer base2;
    public ModelRenderer tail1;
    public ModelRenderer tail12;
    public ModelRenderer tail2;
    public ModelRenderer tail22;

    public ModelGreenWind() {

        //Base
        base = new ModelRenderer(this, 0,0);
        base.addBox(-3f,-3f,-3f, 6,6,6);
        base.setRotationPoint(0f,0f,0f);
        base.setTextureSize(textureWidth,textureHeight);
        base.addChild(base2);
        base.addChild(tail1);
        setRotation(base,0f,0f,0f);

        //base2
        base2 = new ModelRenderer(this,0,0);
        base2.addBox(-2.5f,-2.5f,-2.5f,5,5,5);
        base2.setRotationPoint(0f,0f,0f);
        base2.setTextureSize(textureWidth,textureHeight);
            setRotation(base2,0f,0f,0f);

        //tail1
        tail1 = new ModelRenderer(this, 0,0);
        tail1.addBox(-2f,-2f,2f,4,4,4);
        tail1.setRotationPoint(0f,0f,0f);
        tail1.setTextureSize(textureWidth,textureHeight);
        tail1.addChild(tail2);
        setRotation(tail1, 0f,0f,0f);

        //tail12
        tail12 = new ModelRenderer(this,0,0);
        tail12.addBox(-1.5f,-1.5f,-1.5f,3,3,3);
        tail12.setRotationPoint(0f,0f,0f);
        tail12.setTextureSize(textureWidth,textureHeight);
        setRotation(tail12, 0f,0f,0f);

        //tail2
        tail2 = new ModelRenderer(this, 0,0);
        tail2.addBox(-1f,-1f,-1f,2,2,2);
        tail2.setRotationPoint(0f,0f,0f);
        tail2.setTextureSize(textureWidth,textureHeight);
        tail2.addChild(tail22);
        setRotation(tail2,0f,0f,0f);

        //tail22
        tail22 = new ModelRenderer(this, 0,0);
        tail22.addBox(-0.5f,-0.5f,-0.5f,1,1,1);
        tail22.setRotationPoint(0f,0f,0f);
        tail22.setTextureSize(textureWidth,textureHeight);
        setRotation(tail22,0f,0f,0f);

    }

    @Override
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        renderWind((EntityGreenWind) entityIn, limbSwing,limbSwingAmount, ageInTicks,netHeadYaw,headPitch,scale);
    }

    public void renderWind(EntityGreenWind entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale){

        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

        GL11.glPushMatrix();


    }


    protected void setRotation(ModelRenderer model, Float x, Float y, Float z){
        model.rotateAngleX = degToRad(x);
        model.rotateAngleY = degToRad(y);
        model.rotateAngleZ = degToRad(z);

    }

    protected float degToRad(float degrees) {
        return degrees * (float)Math.PI / 180 ;
    }

}
