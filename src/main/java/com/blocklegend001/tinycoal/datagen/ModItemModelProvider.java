package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;


public class ModItemModelProvider extends ModelProvider {
    public ModItemModelProvider(PackOutput output, String modid) {
        super(output, modid);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModel(itemModels, ModItem.TINY_COAL.get());
        itemModel(itemModels, ModItem.TINY_CHARCOAL.get());
    }

    public void itemModel(ItemModelGenerators itemModels, Item item)
    {
        itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
    }
}
