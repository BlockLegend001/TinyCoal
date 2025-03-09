package com.blocklegend001.tinycoal;

import com.blocklegend001.tinycoal.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TinyCoal implements ModInitializer {
    public static final String MODID = "tinycoal";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();

        FuelRegistryEvents.BUILD.register(((builder, context) -> {
            builder.add(ModItems.TINY_COAL, 200);
            builder.add(ModItems.TINY_CHAROAL, 200);
        }));
    }
}
