package com.inifire201.MagicWinds.Enchanting;

import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by Rob de Witte on 20-6-2017.
 * Package com.inifire201.MagicWinds.Enchanting.
 */
public class EnchantmentXPBonus extends ModEnchantment{
    //TODO perfect code

    public EnchantmentXPBonus(String name, Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) {
        super(name, rarityIn, typeIn, slots);
    }

    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 1;
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return this.getMinEnchantability(enchantmentLevel)+20;
    }



}
