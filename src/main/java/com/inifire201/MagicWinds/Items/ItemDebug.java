package com.inifire201.MagicWinds.Items;

import baubles.api.BaublesApi;
import com.inifire201.MagicWinds.Handlers.EnchantingHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

/**
 * Created by Rob de Witte on 21-6-2017.
 * Package com.inifire201.MagicWinds.Items.
 */
public class ItemDebug extends ModItem {
    public ItemDebug(String name, CreativeTabs tab) {
        super(name, tab);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        try {
            System.out.println(BaublesApi.getBaublesHandler(playerIn).getStackInSlot(1).getEnchantmentTagList().getStringTagAt(1).toString());
        }
        catch(Exception e){
            System.out.println("fout: "+e);
        }
        System.out.println(EnchantingHandler.XPBONUS);

        return super.onItemRightClick(worldIn, playerIn, handIn);

    }
}
