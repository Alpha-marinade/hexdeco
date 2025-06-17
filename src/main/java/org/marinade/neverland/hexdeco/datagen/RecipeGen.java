package org.marinade.neverland.hexdeco.datagen;

import at.petrak.hexcasting.common.lib.HexBlocks;
import at.petrak.hexcasting.common.lib.HexItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import org.marinade.neverland.hexdeco.register.DecoBlockReg;

import java.util.function.Consumer;

import static org.marinade.neverland.hexdeco.Hexdeco.MODID;

public class RecipeGen extends RecipeProvider {
    public RecipeGen(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        addShapelessBlockRecipe(consumer, DecoBlockReg.BAMBOO_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.BAMBOO_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.BIRCH_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.BIRCH_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CHERRY_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.CHERRY_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CRIMSON_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.CRIMSON_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.DARK_OAK_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.DARK_OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.JUNGLE_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.JUNGLE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.MANGROVE_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.MANGROVE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.OAK_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.SPRUCE_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.SPRUCE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.WARPED_LIGATURE.get(),
                HexBlocks.AKASHIC_LIGATURE, Blocks.WARPED_PLANKS);

        addShapelessBlockRecipe(consumer, DecoBlockReg.BAMBOO_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.BAMBOO_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.BIRCH_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.BIRCH_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CHERRY_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.CHERRY_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CRIMSON_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.CRIMSON_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.DARK_OAK_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.DARK_OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.JUNGLE_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.JUNGLE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.MANGROVE_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.MANGROVE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.OAK_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.SPRUCE_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.SPRUCE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.WARPED_RECORD.get(),
                HexBlocks.AKASHIC_RECORD, Blocks.WARPED_PLANKS);

        addShapelessBlockRecipe(consumer, DecoBlockReg.BAMBOO_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.BAMBOO_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.BIRCH_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.BIRCH_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CHERRY_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.CHERRY_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.CRIMSON_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.CRIMSON_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.DARK_OAK_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.JUNGLE_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.JUNGLE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.MANGROVE_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.MANGROVE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.OAK_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.OAK_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.SPRUCE_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.SPRUCE_PLANKS);
        addShapelessBlockRecipe(consumer, DecoBlockReg.WARPED_RUNESHELF.get(),
                HexBlocks.AKASHIC_BOOKSHELF, Blocks.WARPED_PLANKS);


        addShapelessBlockRecipe(consumer,HexBlocks.SLATE_AMETHYST_BRICKS_SMALL,2,
                HexBlocks.SLATE_BRICKS_SMALL, HexBlocks.AMETHYST_BRICKS_SMALL);

        addShapelessBlockRecipe(consumer,HexBlocks.SLATE_AMETHYST_PILLAR,2,
                HexBlocks.SLATE_PILLAR, HexBlocks.AMETHYST_PILLAR);

        addShapelessBlockRecipe(consumer,HexBlocks.SLATE_AMETHYST_TILES,2,
                HexBlocks.SLATE_TILES, HexBlocks.AMETHYST_TILES);


        addSlabRecipe(consumer,DecoBlockReg.SLATE_SLAB.get(),HexBlocks.SLATE_BLOCK);
        addSlabRecipe(consumer,DecoBlockReg.SLATE_BRICKS_SLAB.get(),HexBlocks.SLATE_BRICKS);
        addSlabRecipe(consumer,DecoBlockReg.SLATE_BRICKS_MINI_SLAB.get(),HexBlocks.SLATE_BRICKS_SMALL);
        addSlabRecipe(consumer,DecoBlockReg.SLATE_TILES_SLAB.get(),HexBlocks.SLATE_TILES);

        addSlabRecipe(consumer,DecoBlockReg.AMETHYST_BRICKS_SLAB.get(),HexBlocks.AMETHYST_BRICKS);
        addSlabRecipe(consumer,DecoBlockReg.AMETHYST_MINI_BRICKS_SLAB.get(),HexBlocks.AMETHYST_BRICKS_SMALL);
        addSlabRecipe(consumer,DecoBlockReg.AMETHYST_TILES_SLAB.get(),HexBlocks.AMETHYST_TILES);

        addSlabRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_SLAB.get(),DecoBlockReg.CHARGED_AMETHYST_BLOCK.get());
        addSlabRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_BRICKS_SLAB.get(),DecoBlockReg.CHARGED_AMETHYST_BRICKS.get());

        addSlabRecipe(consumer,DecoBlockReg.SLATE_AMETHYST_TILES_SLAB.get(),HexBlocks.SLATE_AMETHYST_TILES);


        addStairsRecipe(consumer,DecoBlockReg.SLATE_STAIRS.get(),HexBlocks.SLATE_BLOCK);
        addStairsRecipe(consumer,DecoBlockReg.SLATE_BRICKS_STAIRS.get(),HexBlocks.SLATE_BRICKS);
        addStairsRecipe(consumer,DecoBlockReg.SLATE_BRICKS_MINI_STAIRS.get(),HexBlocks.SLATE_BRICKS_SMALL);
        addStairsRecipe(consumer,DecoBlockReg.SLATE_TILES_STAIRS.get(),HexBlocks.SLATE_TILES);

        addStairsRecipe(consumer,DecoBlockReg.SLATE_AMETHYST_TILES_STAIRS.get(),HexBlocks.SLATE_AMETHYST_TILES);

        addStairsRecipe(consumer,DecoBlockReg.AMETHYST_BRICKS_STAIRS.get(),HexBlocks.AMETHYST_BRICKS);
        addStairsRecipe(consumer,DecoBlockReg.AMETHYST_MINI_BRICKS_STAIRS.get(),HexBlocks.AMETHYST_BRICKS_SMALL);
        addStairsRecipe(consumer,DecoBlockReg.AMETHYST_TILES_STAIRS.get(),HexBlocks.AMETHYST_TILES);

        addStairsRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_STAIRS.get(),DecoBlockReg.CHARGED_AMETHYST_BLOCK.get());
        addStairsRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_BRICKS_STAIRS.get(),DecoBlockReg.CHARGED_AMETHYST_BRICKS.get());


        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_BRICKS_STAIRS.get(),HexBlocks.AMETHYST_BRICKS,1);
        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_BRICKS_SLAB.get(),HexBlocks.AMETHYST_BRICKS,2);

        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_MINI_BRICKS_STAIRS.get(),HexBlocks.AMETHYST_BRICKS_SMALL,1);
        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_MINI_BRICKS_SLAB.get(),HexBlocks.AMETHYST_BRICKS_SMALL,2);

        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_TILES_STAIRS.get(),HexBlocks.AMETHYST_TILES,1);
        addStonecutterRecipe(consumer,DecoBlockReg.AMETHYST_TILES_SLAB.get(),HexBlocks.AMETHYST_TILES,2);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_BRICKS_STAIRS.get(),HexBlocks.SLATE_BRICKS,1);
        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_BRICKS_SLAB.get(),HexBlocks.SLATE_BRICKS,2);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_BRICKS_MINI_STAIRS.get(),HexBlocks.SLATE_BRICKS_SMALL,1);
        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_BRICKS_MINI_SLAB.get(),HexBlocks.SLATE_BRICKS_SMALL,2);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_TILES_STAIRS.get(),HexBlocks.SLATE_TILES,1);
        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_TILES_SLAB.get(),HexBlocks.SLATE_TILES,2);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_STAIRS.get(),HexBlocks.SLATE_BLOCK,1);
        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_SLAB.get(),HexBlocks.SLATE_BLOCK,2);

        addStonecutterRecipe(consumer,HexBlocks.SLATE_TILES,HexBlocks.SLATE_BLOCK,1);
        addStonecutterRecipe(consumer,HexBlocks.SLATE_BRICKS,HexBlocks.SLATE_BLOCK,1);
        addStonecutterRecipe(consumer,HexBlocks.SLATE_BRICKS_SMALL,HexBlocks.SLATE_BLOCK,1);
        addStonecutterRecipe(consumer,HexBlocks.SLATE_PILLAR,HexBlocks.SLATE_BLOCK,1);

        addStonecutterRecipe(consumer,HexBlocks.AMETHYST_BRICKS,Blocks.AMETHYST_BLOCK,1);
        addStonecutterRecipe(consumer,HexBlocks.AMETHYST_PILLAR,Blocks.AMETHYST_BLOCK,1);
        addStonecutterRecipe(consumer,HexBlocks.AMETHYST_BRICKS_SMALL,Blocks.AMETHYST_BLOCK,1);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_AMETHYST_TILES_SLAB.get(),HexBlocks.SLATE_AMETHYST_TILES,2);

        addStonecutterRecipe(consumer,DecoBlockReg.SLATE_AMETHYST_TILES_STAIRS.get(),HexBlocks.SLATE_AMETHYST_TILES,1);


        addStonecutterRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_BRICKS_ITEM.get(),DecoBlockReg.CHARGED_AMETHYST_BLOCK_ITEM.get(),1);
        addStonecutterRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_SLAB_ITEM.get(),DecoBlockReg.CHARGED_AMETHYST_BLOCK_ITEM.get(),2);
        addStonecutterRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_BRICKS_SLAB_ITEM.get(),DecoBlockReg.CHARGED_AMETHYST_BRICKS_ITEM.get(),2);
        addStonecutterRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_STAIRS.get(),DecoBlockReg.CHARGED_AMETHYST_BLOCK_ITEM.get(),1);
        addStonecutterRecipe(consumer,DecoBlockReg.CHARGED_AMETHYST_BRICKS_STAIRS.get(),DecoBlockReg.CHARGED_AMETHYST_BRICKS.get(),1);


        addShapedRecipe(DecoBlockReg.TRANSPARENT_SLATE_ITEM.get(),
                "GDG",
                "DSD",
                "GDG",
                'G', Items.GLOWSTONE_DUST,
                'D', HexItems.AMETHYST_DUST,'S',HexBlocks.SLATE).save(consumer,new ResourceLocation(MODID,"transparent_slate"));
        addShapedRecipe(DecoBlockReg.CHARGED_AMETHYST_BLOCK_ITEM.get(),
                "ADA",
                "DCD",
                "ADA",
                'A', Items.AMETHYST_SHARD,
                'D', HexItems.AMETHYST_DUST,'C',HexItems.CHARGED_AMETHYST).save(consumer,new ResourceLocation(MODID,"charged_amethyst_block"));

        addShapedRecipe(DecoBlockReg.CHARGED_AMETHYST_LAMP_ITEM.get(),
                "ADA",
                "DCD",
                "ADA",
                'A', Items.IRON_NUGGET,
                'D', HexItems.AMETHYST_DUST,'C',DecoBlockReg.CHARGED_AMETHYST_BLOCK_ITEM.get()).save(consumer,new ResourceLocation(MODID,"charged_amethyst_lamp"));

    }


    private static void addShapelessBlockRecipe(Consumer<FinishedRecipe> consumer,
                                                ItemLike result,
                                                int count,
                                                ItemLike firstIngredient,
                                                ItemLike secondIngredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result, count)
                .requires(secondIngredient)
                .requires(firstIngredient)
                .unlockedBy(getHasName(firstIngredient), has(firstIngredient))
                .unlockedBy(getHasName(secondIngredient), has(secondIngredient))
                .save(consumer, new ResourceLocation(
                        MODID,
                        "shapeless_" + getItemName(result) + "_x" + count + "_from_" +
                                getItemName(firstIngredient) + "_and_" +
                                getItemName(secondIngredient)
                ));
    }

    private static void addShapelessBlockRecipe(Consumer<FinishedRecipe> consumer,
                                                ItemLike result,
                                                ItemLike firstIngredient,
                                                ItemLike secondIngredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, result)
                .requires(firstIngredient)
                .requires(secondIngredient)
                .unlockedBy(getHasName(firstIngredient), has(firstIngredient))
                .unlockedBy(getHasName(secondIngredient), has(secondIngredient))
                .save(consumer, new ResourceLocation(
                        MODID,
                        "shapeless_" + getItemName(result) + "_from_" +
                                getItemName(firstIngredient) + "_and_" +
                                getItemName(secondIngredient)
                ));
    }
    private static void addSlabRecipe(Consumer<FinishedRecipe> consumer,
                                      ItemLike slabResult,
                                      ItemLike ingredientBlock) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, slabResult, 6)
                .pattern("###")
                .define('#', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(consumer, new ResourceLocation(
                        MODID,
                        "slab_from_" + getItemName(ingredientBlock) + "_to_" + getItemName(slabResult)
                ));
    }
    private static void addStairsRecipe(Consumer<FinishedRecipe> consumer,
                                        ItemLike stairsResult,
                                        ItemLike ingredientBlock) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, stairsResult, 4)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .define('#', ingredientBlock)
                .unlockedBy(getHasName(ingredientBlock), has(ingredientBlock))
                .save(consumer, new ResourceLocation(
                        MODID,
                        "stairs_from_" + getItemName(ingredientBlock) + "_to_" + getItemName(stairsResult)
                ));
    }
    private static ShapedRecipeBuilder addShapedRecipe(
                                                       ItemLike result,
                                                       String row1,
                                                       String row2,
                                                       String row3,
                                                       Object... keys) {
        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .pattern(row1)
                .pattern(row2)
                .pattern(row3);


        for(int i = 0; i < keys.length; i += 2) {
            char symbol = (Character) keys[i];
            Ingredient ingredient = Ingredient.of((ItemLike) keys[i + 1]);
            builder.define(symbol, ingredient);
        }

        return builder.unlockedBy("has_item", has((ItemLike) keys[1]));
    }
    private static void addStonecutterRecipe(Consumer<FinishedRecipe> consumer,
                                             ItemLike result,
                                             ItemLike ingredient,
                                             int resultCount) {
        SingleItemRecipeBuilder.stonecutting(
                        Ingredient.of(ingredient),
                        RecipeCategory.BUILDING_BLOCKS,
                        result,
                        resultCount
                )
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer, new ResourceLocation(
                        MODID,
                        "stonecutting/" + getItemName(result) + "_from_" + getItemName(ingredient)
                ));
    }

    public static String getItemName(ItemLike item) {
        return ForgeRegistries.ITEMS.getKey(item.asItem()).getPath();
    }

    public static String getHasName(ItemLike item) {
        return "has_" + getItemName(item);
    }
}
