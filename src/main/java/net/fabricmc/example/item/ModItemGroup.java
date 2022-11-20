package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup my_item_tab = FabricItemGroupBuilder.build(
            new Identifier(ExampleMod.MOD_ID, "my_item_tab"),
            // 指定分类图标
            () -> new ItemStack(ModItems.terra_blade));
}
