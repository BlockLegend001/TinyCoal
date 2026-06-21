package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public ModItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }


    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.COALS)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);

        valueLookupBuilder(ItemTags.FURNACE_MINECART_FUEL)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);

        valueLookupBuilder(ConventionalItemTags.COAL_ORES)
                .add(ModItems.TINY_COAL,
                        ModItems.TINY_CHAROAL);
    }
}
