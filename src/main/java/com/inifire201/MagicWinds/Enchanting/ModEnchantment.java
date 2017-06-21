package com.inifire201.MagicWinds.Enchanting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;

/**
 * Created by Rob de Witte on 21-6-2017.
 * Package com.inifire201.MagicWinds.Enchanting.
 */
public class ModEnchantment extends Enchantment {

    public ModEnchantment(String name, Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) {
        super(rarityIn, typeIn, slots);
        setRegistryName(name);
    }

}
