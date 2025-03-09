package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    protected ModRecipeProvider(HolderLookup.Provider p_361709_, RecipeOutput p_365321_) {
        super(p_361709_, p_365321_);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput output, CompletableFuture<HolderLookup.Provider> providerCompletableFuture) {
            super(output, providerCompletableFuture);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shapeless(RecipeCategory.MISC, ModItems.TINY_COAL.get(), 8)
                .requires(Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(this.output);

        shapeless(RecipeCategory.MISC, ModItems.TINY_CHARCOAL.get(), 8)
                .requires(Items.CHARCOAL)
                .unlockedBy(getHasName(Items.CHARCOAL), has(Items.CHARCOAL))
                .save(this.output);

        shaped(RecipeCategory.MISC, Items.COAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .define('C', ModItems.TINY_COAL.get())
                .unlockedBy(getHasName(ModItems.TINY_COAL.get()), has(ModItems.TINY_COAL.get()))
                .save(this.output);

        shaped(RecipeCategory.MISC, Items.CHARCOAL)
                .pattern("CCC")
                .pattern("C C")
                .pattern("CCC")
                .define('C', ModItems.TINY_CHARCOAL.get())
                .unlockedBy(getHasName(ModItems.TINY_CHARCOAL.get()), has(ModItems.TINY_CHARCOAL.get()))
                .save(this.output);
    }
}
