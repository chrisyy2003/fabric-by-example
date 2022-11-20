package net.fabricmc.example.block;

import net.fabricmc.example.ExampleMod;
import net.fabricmc.example.block.advance.Lamp;
import net.fabricmc.example.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static Block demonite_block = registerBlock("demonite_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()));

    public static Block demonite_block_ore = registerBlock("demonite_block_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()));

    public static final Block TANZANITE_LAMP = registerBlock("lamp",
            new Lamp(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()
                    .luminance(state -> state.get(Lamp.LightOn) ? 50 : 0)));


    public static Block registerBlock(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(ExampleMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.my_item_tab)));

        return Registry.register(Registry.BLOCK, new Identifier(ExampleMod.MOD_ID, name), block);
    }

    public static void registerMyBlocks() {

    }
}
