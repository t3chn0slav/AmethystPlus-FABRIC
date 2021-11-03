package com.technoslav.amethystarmour.ModToolsBase.AmethystToolsBase;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ModAmethystHoeBase extends HoeItem {
    public ModAmethystHoeBase(ToolMaterial material) {
        super(material, -2, 0, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
