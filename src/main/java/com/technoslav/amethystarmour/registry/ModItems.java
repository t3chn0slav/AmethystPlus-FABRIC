package com.technoslav.amethystarmour.registry;

import com.technoslav.amethystarmour.AmethystArmour;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item AMETHYST_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(AmethystArmour.MOD_ID, "amethyst_ingot"), AMETHYST_INGOT);
    }
}
