package net.wolfieboy09.theworldofmagic.datagen;

import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.block.ModBlocks;
import net.wolfieboy09.theworldofmagic.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> CLOUDIUM_SMELTABLES = List.of(ModItems.RAW_CLOUDIUM.get(),
            ModBlocks.CLOUDIUM_ORE.get());

    private static final List<ItemLike> WITHERITE_SMELTABLES = List.of(ModItems.RAW_WITHERITE.get(),
            ModBlocks.WITHERITE_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) { super(pOutput); }


    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        oreSmelting(recipeOutput, CLOUDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CLOUDIUM.get(), 0.25f, 200, "cloudium");
        oreBlasting(recipeOutput, CLOUDIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CLOUDIUM.get(), 0.25f, 100, "cloudium");

        oreSmelting(recipeOutput, WITHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.WITHERITE_INGOT.get(), 0.25f, 200, "witherite");
        oreBlasting(recipeOutput, WITHERITE_SMELTABLES, RecipeCategory.MISC, ModItems.WITHERITE_INGOT.get(), 0.25f, 100, "witherite");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLOUDIUM_BLOCK.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', ModItems.CLOUDIUM.get())
                .unlockedBy(getHasName(ModItems.CLOUDIUM.get()), has(ModItems.CLOUDIUM.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WITHERITE_BLOCK.get())
                .pattern("WWW")
                .pattern("WWW")
                .pattern("WWW")
                .define('W', ModItems.WITHERITE_INGOT.get())
                .unlockedBy(getHasName(ModItems.WITHERITE_INGOT.get()), has(ModItems.WITHERITE_INGOT.get()))
                .save(recipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CLOUDIUM.get(), 9)
                .requires(ModBlocks.CLOUDIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CLOUDIUM_BLOCK.get()), has(ModBlocks.CLOUDIUM_BLOCK.get()))
                .save(recipeOutput);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,@NotNull List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save((RecipeOutput) pFinishedRecipeConsumer,  TheWorldOfMagic.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}