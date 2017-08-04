package com.inifire201.MagicWinds.Items;

import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 21-6-2017.
 * Package com.inifire201.MagicWinds.Items.
 */
public class ItemDebug extends ModItem {
    public ItemDebug(String name, CreativeTabs tab) {
        super(name, tab);

        LayeredTexture layeredTexture = new LayeredTexture("shard_green", "red_ring");


    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        playerIn.sendMessage(new TextComponentString("test"));

        return super.onItemRightClick(worldIn, playerIn, handIn);

    }
}
