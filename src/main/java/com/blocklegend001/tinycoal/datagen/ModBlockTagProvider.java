package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.TinyCoal;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvied) {
        super(packOutput, lookupProvied, TinyCoal.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

    }
}