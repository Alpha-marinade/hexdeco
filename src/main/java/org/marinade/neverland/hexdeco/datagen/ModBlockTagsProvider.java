package org.marinade.neverland.hexdeco.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.marinade.neverland.hexdeco.register.DecoBlockReg;

import java.util.concurrent.CompletableFuture;

import static org.marinade.neverland.hexdeco.Hexdeco.MODID;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.TRANSPARENT_SLATE.get());

        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.OAK_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.OAK_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.OAK_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.WARPED_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.WARPED_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.WARPED_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.SPRUCE_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.SPRUCE_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.SPRUCE_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.MANGROVE_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.MANGROVE_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.MANGROVE_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.JUNGLE_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.JUNGLE_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.JUNGLE_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.DARK_OAK_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.DARK_OAK_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.DARK_OAK_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CRIMSON_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CRIMSON_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CRIMSON_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CHERRY_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CHERRY_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.CHERRY_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BIRCH_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BIRCH_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BIRCH_RUNESHELF.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BAMBOO_LIGATURE.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BAMBOO_RECORD.get());
        tag(BlockTags.MINEABLE_WITH_AXE).add(DecoBlockReg.BAMBOO_RUNESHELF.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_BRICKS_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_MINI_BRICKS_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_TILES_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_BRICKS_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_MINI_BRICKS_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.AMETHYST_TILES_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_TILES_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_BRICKS_MINI_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_BRICKS_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_TILES_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_BRICKS_MINI_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_BRICKS_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_BLOCK.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS_SLAB.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_LAMP.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_AMETHYST_TILES_STAIRS.get());
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(DecoBlockReg.SLATE_AMETHYST_TILES_SLAB.get());


        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_BRICKS_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_MINI_BRICKS_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_TILES_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_BRICKS_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_MINI_BRICKS_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.AMETHYST_TILES_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_TILES_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_BRICKS_MINI_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_BRICKS_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_TILES_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_BRICKS_MINI_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_BRICKS_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_BLOCK.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS_SLAB.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_LAMP.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.CHARGED_AMETHYST_BRICKS_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_AMETHYST_TILES_STAIRS.get());
        tag(BlockTags.NEEDS_IRON_TOOL).add(DecoBlockReg.SLATE_AMETHYST_TILES_SLAB.get());

        tag(BlockTags.WALLS).add(DecoBlockReg.SLATE_TILES_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.SLATE_BRICKS_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.SLATE_BRICKS_SMALL_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.SLATE_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.AMETHYST_BRICKS_SMALL_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.AMETHYST_BRICKS_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.AMETHYST_TILES_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.SLATE_AMETHYST_TILES_WALL.get());
        tag(BlockTags.WALLS).add(DecoBlockReg.CHARGED_WALL.get());
    }
}