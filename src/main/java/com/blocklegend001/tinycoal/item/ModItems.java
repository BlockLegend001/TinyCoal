package com.blocklegend001.tinycoal.item;

import com.blocklegend001.tinycoal.TinyCoal;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TINY_COAL = registerItem("tiny_coal",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TinyCoal.MODID, "tiny_coal")))));

    public static final Item TINY_CHAROAL = registerItem("tiny_charcoal",
            new Item(new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TinyCoal.MODID, "tiny_charcoal")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TinyCoal.MODID, name), item);
    }

    public static void registerModItems() {
        TinyCoal.LOGGER.info("Registering Mod Items for " + TinyCoal.MODID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.TINY_COAL);
            entries.add(ModItems.TINY_CHAROAL);
        });
    }
}