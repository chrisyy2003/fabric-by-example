package net.fabricmc.example.item;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item terra_blade = registerItem("terra_blade",
            new SwordItem(ToolMaterials.DIAMOND, 100, 3,
                    new FabricItemSettings()
                            .group(ModItemGroup.my_item_tab)
                            .maxCount(1)
            ));

    public static final Item demonite_ore = registerItem("demonite_ore",
            new Item(new FabricItemSettings().group(ModItemGroup.my_item_tab)));

    public static final Item demonite_bar = registerItem("demonite_bar",
            new Item(new FabricItemSettings().group(ModItemGroup.my_item_tab)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerMyItems() {
        ExampleMod.LOGGER.info("register my items");
    }
}
