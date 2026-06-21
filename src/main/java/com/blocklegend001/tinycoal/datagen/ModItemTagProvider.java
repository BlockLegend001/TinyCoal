package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaItemTagsProvider;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends VanillaItemTagsProvider {
    public ModItemTagProvider(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_) {
        super(p_275343_, p_275729_);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.COALS)
                .add(ModItem.TINY_COAL.get(),
                        ModItem.TINY_CHARCOAL.get());

        this.tag(ItemTags.FURNACE_MINECART_FUEL)
                .add(ModItem.TINY_COAL.get(),
                        ModItem.TINY_CHARCOAL.get());
    }
}