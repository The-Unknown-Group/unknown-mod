package com.thegremlinx.item;

import com.thegremlinx.NewTestingMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BITCHES = FabricItemGroupBuilder.build(
            new Identifier(NewTestingMod.MOD_ID, "bitches"), () -> new ItemStack(ModItems.BITCHES_ITEM));
}
