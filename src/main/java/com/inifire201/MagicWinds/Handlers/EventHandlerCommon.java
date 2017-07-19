package com.inifire201.MagicWinds.Handlers;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerPickupXpEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Rob de Witte on 21-6-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class EventHandlerCommon {

    @SubscribeEvent
    public void onPlayerPickupEvent(PlayerPickupXpEvent event){
        //TODO Xpbonus achievement
    }


    private boolean itemHasEnchantment(ItemStack itemStack, Enchantment enchantment){
        for(int i = 0; i == itemStack.getEnchantmentTagList().tagCount(); i++){
            if(itemStack.getEnchantmentTagList().get(i).toString() == EnchantingHandler.XPBONUS.toString()){
                return true;
            }
        }
        return false;
    }

}
