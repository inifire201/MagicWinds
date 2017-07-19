package com.inifire201.MagicWinds.Handlers;

import com.inifire201.MagicWinds.Enchanting.EnchantmentXPBonus;
import com.inifire201.MagicWinds.Items.ItemRedRing;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

/**
 * Created by Rob de Witte on 20-6-2017.
 * Package com.inifire201.MagicWinds.Handlers.
 */
public class EnchantingHandler {
    public static List<Enchantment> ENCHANTMENTS;


    public static final EnumEnchantmentType MINE = EnumHelper.addEnchantmentType("MINE", (item) -> item instanceof ItemRedRing);

    public static Enchantment XPBONUS;

    public static void init(){
        XPBONUS = new EnchantmentXPBonus("xpbonus", Enchantment.Rarity.RARE, MINE, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
    }

    public static void register(){
        ENCHANTMENTS.add(XPBONUS);
    }

}
