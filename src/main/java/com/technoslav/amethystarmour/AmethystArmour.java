package com.technoslav.amethystarmour;

import com.technoslav.amethystarmour.ModArmourMaterials.AmethystArmourMaterial;
import com.technoslav.amethystarmour.ModArmourMaterials.BaseArmour;
import com.technoslav.amethystarmour.ModToolMaterials.AmethystToolMaterial;
import com.technoslav.amethystarmour.ModToolsBase.AmethystToolsBase.*;
import com.technoslav.amethystarmour.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AmethystArmour implements ModInitializer {

    public static final String MOD_ID = "amarm";

    public static final ArmorMaterial AMETHYST_ARMOUR = new AmethystArmourMaterial();

    @Override
    public void onInitialize() {
        ModItems.registerItems();

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_pickaxe"), new ModAmethystPickaxeBase(new AmethystToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_axe"), new ModAmethystAxeBase(new AmethystToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_hoe"), new ModAmethystHoeBase(new AmethystToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_sword"), new ModAmethystSwordBase(new AmethystToolMaterial()));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_shovel"), new ModAmethystShovelBase(new AmethystToolMaterial()));

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_helmet"), new BaseArmour(AMETHYST_ARMOUR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_chestplate"), new BaseArmour(AMETHYST_ARMOUR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_leggings"), new BaseArmour(AMETHYST_ARMOUR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "amethyst_boots"), new BaseArmour(AMETHYST_ARMOUR, EquipmentSlot.FEET));
    }
}
