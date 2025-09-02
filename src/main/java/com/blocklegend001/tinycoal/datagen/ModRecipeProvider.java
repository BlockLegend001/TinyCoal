package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    protected ModRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        super(provider, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
            super(packOutput, provider);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "My Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shapeless(RecipeCategory.MISC, ModItem.TINY_COAL.get(), 8)
                .requires(Items.COAL)
                .unlockedBy("has_coal", has(Items.COAL))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "tiny_coal_from_coal")));

        shapeless(RecipeCategory.MISC, ModItem.TINY_CHARCOAL.get(), 8)
                .requires(Items.CHARCOAL)
                .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "tiny_charcoal_from_charcoal")));

        shaped(RecipeCategory.MISC, Items.COAL)
                .define('C', ModItem.TINY_COAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_coal", has(ModItem.TINY_COAL.get()))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "coal_from_tiny_coal")));

        shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .define('C', ModItem.TINY_CHARCOAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_tiny_charcoal", has(ModItem.TINY_CHARCOAL.get()))
                .save(this.output, String.valueOf(ResourceLocation.fromNamespaceAndPath("tinycoal", "charcoal_from_tiny_charcoal")));
    }

}
