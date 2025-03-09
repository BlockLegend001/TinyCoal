package com.blocklegend001.tinycoal.datagen;

import com.blocklegend001.tinycoal.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeGenerator;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.MISC, ModItems.TINY_COAL, 8)
                        .input(Items.COAL)
                        .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                        .offerTo(recipeExporter);

                createShapeless(RecipeCategory.MISC, ModItems.TINY_CHAROAL, 8)
                        .input(Items.CHARCOAL)
                        .criterion(hasItem(Items.CHARCOAL), conditionsFromItem(Items.CHARCOAL))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, Items.COAL)
                        .pattern("CCC")
                        .pattern("C C")
                        .pattern("CCC")
                        .input('C', ModItems.TINY_COAL)
                        .criterion(hasItem(ModItems.TINY_COAL), conditionsFromItem(ModItems.TINY_COAL))
                        .offerTo(recipeExporter);

                createShaped(RecipeCategory.MISC, Items.CHARCOAL)
                        .pattern("CCC")
                        .pattern("C C")
                        .pattern("CCC")
                        .input('C', ModItems.TINY_CHAROAL)
                        .criterion(hasItem(ModItems.TINY_CHAROAL), conditionsFromItem(ModItems.TINY_CHAROAL))
                        .offerTo(recipeExporter);
            }
        };
    }

    @Override
    public String getName() {
        return "TinyCoal Recipes";
    }
}
