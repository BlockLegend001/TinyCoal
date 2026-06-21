package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                shapeless(RecipeCategory.MISC, ModItems.TINY_COAL, 8)
                        .requires(Items.COAL)
                        .unlockedBy("has_coal", has(Items.COAL))
                        .save(output);

                shapeless(RecipeCategory.MISC, ModItems.TINY_CHAROAL, 8)
                        .requires(Items.CHARCOAL)
                        .unlockedBy("has_charcoal", has(Items.CHARCOAL))
                        .save(output);

                shaped(RecipeCategory.MISC, Items.COAL)
                        .pattern("CCC")
                        .pattern("C C")
                        .pattern("CCC")
                        .define('C', ModItems.TINY_COAL)
                        .unlockedBy("has_tiny_coal", has(ModItems.TINY_COAL))
                        .save(output);

                shaped(RecipeCategory.MISC, Items.CHARCOAL)
                        .pattern("CCC")
                        .pattern("C C")
                        .pattern("CCC")
                        .define('C', ModItems.TINY_CHAROAL)
                        .unlockedBy("has_tiny_charcoal", has(ModItems.TINY_CHAROAL))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "TinyCoal Recipes";
    }
}
