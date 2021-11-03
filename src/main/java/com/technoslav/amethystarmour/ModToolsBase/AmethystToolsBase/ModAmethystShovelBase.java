package com.technoslav.amethystarmour.ModToolsBase.AmethystToolsBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ModAmethystShovelBase extends ShovelItem {
    public ModAmethystShovelBase(ToolMaterial material) {
        super(material, 4, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
