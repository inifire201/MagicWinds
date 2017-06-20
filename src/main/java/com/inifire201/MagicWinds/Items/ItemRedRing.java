package com.inifire201.MagicWinds.Items;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import com.inifire201.MagicWinds.Handlers.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by Rob de Witte on 18-6-2017.
 * Package com.inifire201.MagicWinds.Items.
 */
public class ItemRedRing extends ModItem implements IBauble {
    public ItemRedRing(String name, CreativeTabs tab, int stacksize) {
        super(name, tab, stacksize);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemstack) {
        return BaubleType.RING;
    }


}
