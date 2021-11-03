package com.technoslav.amethystarmour.ModToolsBase.AmethystToolsBase;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ModAmethystAxeBase extends AxeItem {
    public ModAmethystAxeBase(ToolMaterial material) {
        super(material, 8, -3f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
