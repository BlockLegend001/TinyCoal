package com.blocklegend001.tinycoal.item;

import com.blocklegend001.tinycoal.TinyCoal;
import com.blocklegend001.tinycoal.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TinyCoal.MODID);

    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}