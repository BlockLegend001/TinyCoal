package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.COALS)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);

        getOrCreateTagBuilder(ItemTags.FURNACE_MINECART_FUEL)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);

        getOrCreateTagBuilder(ConventionalItemTags.COAL)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);
    }
}
