package com.blocklegend001.tinycoal.item;

import com.blocklegend001.tinycoal.TinyCoal;
import com.blocklegend001.tinycoal.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItem {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TinyCoal.MODID);

    public static final DeferredItem<Item> TINY_COAL = ITEMS.register("tiny_coal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static final DeferredItem<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal",
            () -> new FuelItem(new Item.Properties(), 200));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
