package com.technoslav.amethystarmour.ModToolsBase.AmethystToolsBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModAmethystSwordBase extends SwordItem {
    public ModAmethystSwordBase(ToolMaterial toolMaterial) {
        super(toolMaterial, 6, -2.4f, new Item.Settings().group(ItemGroup.COMBAT));
    }
}
