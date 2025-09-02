package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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
                .save(recipeOutput, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "tiny_coal_from_coal")));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItem.TINY_CHARCOAL.get(), 8)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                .save(recipeOutput, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "tiny_charcoal_from_charcoal")));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.COAL)
                .define('C', ModItem.TINY_COAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_coal", has(ModItem.TINY_COAL.get()))
                .save(recipeOutput, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "coal_from_tiny_coal")));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .define('C', ModItem.TINY_CHARCOAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_charcoal", has(ModItem.TINY_CHARCOAL.get()))
                .save(recipeOutput, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "charcoal_from_tiny_charcoal")));
    }
}