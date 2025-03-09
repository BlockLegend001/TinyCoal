package com.blocklegend001.tinycoal;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(TinyCoal.MODID)
public class TinyCoal {
    public static final String MODID = "tinycoal";

    public TinyCoal(IEventBus modEventBus) {
        ModItem.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItem.TINY_COAL.get());
            event.accept(ModItem.TINY_CHARCOAL.get());
        }
    }
}
