package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(PackOutput p_248933_, CompletableFuture<HolderLookup.Provider> p_323846_) {
        super(p_248933_, p_323846_);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItem.TINY_COAL.get(), 8)
                .requires(Items.COAL)
                .unlockedBy("has_coal", has(Items.COAL))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItem.TINY_CHARCOAL.get(), 8)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .define('C', ModItem.TINY_COAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_coal", has(ModItem.TINY_COAL.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .define('C', ModItem.TINY_CHARCOAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_charcoal", has(ModItem.TINY_CHARCOAL.get()))
                .save(recipeOutput);
    }
}
