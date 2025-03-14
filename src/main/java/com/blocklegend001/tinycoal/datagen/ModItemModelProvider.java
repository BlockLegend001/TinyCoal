package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.TinyCoal;
import com.blocklegend001.tinycoal.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TinyCoal.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.TINY_COAL.get());
        basicItem(ModItems.TINY_CHARCOAL.get());
    }
}