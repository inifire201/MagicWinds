package com.inifire201.MagicWinds.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

/**
 * Created by Rob de Witte on 24-5-2017.
 * Package com.inifire201.MagicWinds.Tools.
 */
public class ToolTestSword extends ModToolSword{
    public ToolTestSword(String name, Item.ToolMaterial material, CreativeTabs tab) {
        super(name, material, tab);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
            player.addPotionEffect(new PotionEffect(Potion.getPotionById(15), 100, 2));
            EntityLightningBolt lightningBolt = new EntityLightningBolt(player.world, 5, 5 ,5,false);
            lightningBolt.setPosition(player.posX, player.posY, player.posZ);
            player.world.spawnEntity(lightningBolt);
        return super.onDroppedByPlayer(item, player);
    }


}
