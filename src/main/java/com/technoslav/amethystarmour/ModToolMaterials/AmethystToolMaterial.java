package com.technoslav.amethystarmour.ModToolMaterials;

import com.technoslav.amethystarmour.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystToolMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 2500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7;
    }

    @Override
    public float getAttackDamage() {
        return 2f;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.AMETHYST_INGOT);
    }
}
