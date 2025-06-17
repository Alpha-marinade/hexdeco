package org.marinade.neverland.hexdeco.register;

import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicBookshelf;
import at.petrak.hexcasting.common.items.storage.ItemSlate;
import at.petrak.hexcasting.common.lib.HexBlocks;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.marinade.neverland.hexdeco.Blocks.Akashic.AbstractLigature;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Birch.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Cherry.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Crimson.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.DarkOak.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Jungle.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Mangrove.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Oak.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Bamboo.*;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Spruce.SpruceAkashiRecord;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Spruce.SpruceAkashicBookshelfBlock;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Warped.WarpedAkashiRecord;
import org.marinade.neverland.hexdeco.Blocks.Akashic.Warped.WarpedAkashicBookshelfBlock;
import org.marinade.neverland.hexdeco.Blocks.HexParticle.HexLampBlock;
import org.marinade.neverland.hexdeco.Blocks.HexParticle.HexParticleBlock;
import org.marinade.neverland.hexdeco.Blocks.HexParticle.HexParticleSlab;
import org.marinade.neverland.hexdeco.Blocks.HexParticle.HexParticleStairs;
import org.marinade.neverland.hexdeco.Blocks.TransparentSlate;


import static org.marinade.neverland.hexdeco.Hexdeco.MODID;

public class DecoBlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Block> OAK_LIGATURE= BLOCKS.register("oak_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Block> OAK_RUNESHELF = BLOCKS.register("oak_akashic_bookshelf", () -> new OakAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Block> OAK_RECORD = BLOCKS.register("oak_akashic_record",()->new OakAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> OAK_LIGATURE_ITEM = ITEMS.register("oak_akashic_ligature", () -> new BlockItem(OAK_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_RECORD_ITEM = ITEMS.register("oak_akashic_record", () -> new BlockItem(OAK_RECORD.get(), new Item.Properties()));
    public static final RegistryObject<Item> OAK_RUNESHELF_ITEM = ITEMS.register("oak_akashic_bookshelf", () -> new BlockItem(OAK_RUNESHELF.get(), new Item.Properties()));

    public static final RegistryObject<Block> DARK_OAK_LIGATURE= BLOCKS.register("dark_oak_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> DARK_OAK_LIGATURE_ITEM = ITEMS.register("dark_oak_akashic_ligature", () -> new BlockItem(DARK_OAK_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> DARK_OAK_RUNESHELF = BLOCKS.register("dark_oak_akashic_bookshelf", () -> new DarkOakAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> DARK_OAK_RUNESHELF_ITEM = ITEMS.register("dark_oak_akashic_bookshelf", () -> new BlockItem(DARK_OAK_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> DARK_OAK_RECORD = BLOCKS.register("dark_oak_akashic_record",()->new DarkOakAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> DARK_OAK_RECORD_ITEM = ITEMS.register("dark_oak_akashic_record", () -> new BlockItem(DARK_OAK_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> BAMBOO_LIGATURE= BLOCKS.register("bamboo_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> BAMBOO_LIGATURE_ITEM = ITEMS.register("bamboo_akashic_ligature", () -> new BlockItem(BAMBOO_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> BAMBOO_RUNESHELF = BLOCKS.register("bamboo_akashic_bookshelf", () -> new BambooAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> BAMBOO_RUNESHELF_ITEM = ITEMS.register("bamboo_akashic_bookshelf", () -> new BlockItem(BAMBOO_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> BAMBOO_RECORD = BLOCKS.register("bamboo_akashic_record",()->new BambooAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> BAMBOO_RECORD_ITEM = ITEMS.register("bamboo_akashic_record", () -> new BlockItem(BAMBOO_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> BIRCH_LIGATURE= BLOCKS.register("birch_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> BIRCH_LIGATURE_ITEM = ITEMS.register("birch_akashic_ligature", () -> new BlockItem(BIRCH_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> BIRCH_RUNESHELF = BLOCKS.register("birch_akashic_bookshelf", () -> new BirchAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> BIRCH_RUNESHELF_ITEM = ITEMS.register("birch_akashic_bookshelf", () -> new BlockItem(BIRCH_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> BIRCH_RECORD = BLOCKS.register("birch_akashic_record",()->new BirchAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> BIRCH_RECORD_ITEM = ITEMS.register("birch_akashic_record", () -> new BlockItem(BIRCH_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHERRY_LIGATURE= BLOCKS.register("cherry_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> CHERRY_LIGATURE_ITEM = ITEMS.register("cherry_akashic_ligature", () -> new BlockItem(CHERRY_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> CHERRY_RUNESHELF = BLOCKS.register("cherry_akashic_bookshelf", () -> new CherryAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> CHERRY_RUNESHELF_ITEM = ITEMS.register("cherry_akashic_bookshelf", () -> new BlockItem(CHERRY_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> CHERRY_RECORD = BLOCKS.register("cherry_akashic_record",()->new CherryAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> CHERRY_RECORD_ITEM = ITEMS.register("cherry_akashic_record", () -> new BlockItem(CHERRY_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> CRIMSON_LIGATURE= BLOCKS.register("crimson_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> CRIMSON_LIGATURE_ITEM = ITEMS.register("crimson_akashic_ligature", () -> new BlockItem(CRIMSON_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> CRIMSON_RUNESHELF = BLOCKS.register("crimson_akashic_bookshelf", () -> new CrimsonAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> CRIMSON_RUNESHELF_ITEM = ITEMS.register("crimson_akashic_bookshelf", () -> new BlockItem(CRIMSON_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> CRIMSON_RECORD = BLOCKS.register("crimson_akashic_record",()->new CrimsonAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> CRIMSON_RECORD_ITEM = ITEMS.register("crimson_akashic_record", () -> new BlockItem(CRIMSON_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> JUNGLE_LIGATURE= BLOCKS.register("jungle_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> JUNGLE_LIGATURE_ITEM = ITEMS.register("jungle_akashic_ligature", () -> new BlockItem(JUNGLE_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> JUNGLE_RUNESHELF = BLOCKS.register("jungle_akashic_bookshelf", () -> new JungleAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> JUNGLE_RUNESHELF_ITEM = ITEMS.register("jungle_akashic_bookshelf", () -> new BlockItem(JUNGLE_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> JUNGLE_RECORD = BLOCKS.register("jungle_akashic_record",()->new JungleAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> JUNGLE_RECORD_ITEM = ITEMS.register("jungle_akashic_record", () -> new BlockItem(JUNGLE_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> MANGROVE_LIGATURE= BLOCKS.register("mangrove_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> MANGROVE_LIGATURE_ITEM = ITEMS.register("mangrove_akashic_ligature", () -> new BlockItem(MANGROVE_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> MANGROVE_RUNESHELF = BLOCKS.register("mangrove_akashic_bookshelf", () -> new MangroveAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> MANGROVE_RUNESHELF_ITEM = ITEMS.register("mangrove_akashic_bookshelf", () -> new BlockItem(MANGROVE_RUNESHELF.get(), new Item.Properties()));
    public static final RegistryObject<Block> MANGROVE_RECORD = BLOCKS.register("mangrove_akashic_record",()->new MangroveAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> MANGROVE_RECORD_ITEM = ITEMS.register("mangrove_akashic_record", () -> new BlockItem(MANGROVE_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> SPRUCE_LIGATURE= BLOCKS.register("spruce_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> SPRUCE_LIGATURE_ITEM = ITEMS.register("spruce_akashic_ligature", () -> new BlockItem(SPRUCE_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> SPRUCE_RUNESHELF = BLOCKS.register("spruce_akashic_bookshelf", () -> new SpruceAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> SPRUCE_RUNESHELF_ITEM = ITEMS.register("spruce_akashic_bookshelf", () -> new BlockItem((SPRUCE_RUNESHELF.get()), new Item.Properties()));
    public static final RegistryObject<Block> SPRUCE_RECORD = BLOCKS.register("spruce_akashic_record",()->new SpruceAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> SPRUCE_RECORD_ITEM = ITEMS.register("spruce_akashic_record", () -> new BlockItem(SPRUCE_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> WARPED_LIGATURE= BLOCKS.register("warped_akashic_ligature",()->new AbstractLigature(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 4)));
    public static final RegistryObject<Item> WARPED_LIGATURE_ITEM = ITEMS.register("warped_akashic_ligature", () -> new BlockItem(WARPED_LIGATURE.get(), new Item.Properties()));
    public static final RegistryObject<Block> WARPED_RUNESHELF = BLOCKS.register("warped_akashic_bookshelf", () -> new WarpedAkashicBookshelfBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel((bs) -> (Boolean)bs.getValue(BlockAkashicBookshelf.HAS_BOOKS) ? 4 : 0)));
    public static final RegistryObject<Item> WARPED_RUNESHELF_ITEM = ITEMS.register("warped_akashic_bookshelf", () -> new BlockItem((WARPED_RUNESHELF.get()), new Item.Properties()));
    public static final RegistryObject<Block> WARPED_RECORD = BLOCKS.register("warped_akashic_record",()->new WarpedAkashiRecord(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.WOOD).strength(3.0F, 4.0F).lightLevel(bs -> 15)));
    public static final RegistryObject<Item> WARPED_RECORD_ITEM = ITEMS.register("warped_akashic_record", () -> new BlockItem(WARPED_RECORD.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_MINI_BRICKS_SLAB =BLOCKS.register("amethyst_bricks_mini_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_MINI_BRICKS_SLAB_ITEM = ITEMS.register("amethyst_bricks_mini_slab", () -> new BlockItem(AMETHYST_MINI_BRICKS_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_BRICKS_SLAB =BLOCKS.register("amethyst_bricks_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_BRICKS_SLAB_ITEM = ITEMS.register("amethyst_bricks_slab", () -> new BlockItem(AMETHYST_BRICKS_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_TILES_SLAB =BLOCKS.register("amethyst_tiles_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_TILES_SLAB_ITEM = ITEMS.register("amethyst_tiles_slab", () -> new BlockItem(AMETHYST_TILES_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_BRICKS_MINI_SLAB =BLOCKS.register("slate_bricks_mini_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_BRICKS_MINI_SLAB_ITEM = ITEMS.register("slate_bricks_mini_slab", () -> new BlockItem(SLATE_BRICKS_MINI_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_BRICKS_SLAB =BLOCKS.register("slate_bricks_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_BRICKS_SLAB_ITEM = ITEMS.register("slate_bricks_slab", () -> new BlockItem(SLATE_BRICKS_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_SLAB =BLOCKS.register("slate_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_SLAB_ITEM = ITEMS.register("slate_slab", () -> new BlockItem(SLATE_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_TILES_SLAB =BLOCKS.register("slate_tiles_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_TILES_SLAB_ITEM = ITEMS.register("slate_tiles_slab", () -> new BlockItem(SLATE_TILES_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> TRANSPARENT_SLATE=BLOCKS.register ("transparent_slate",()-> new TransparentSlate(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).pushReaction(PushReaction.DESTROY).noCollission().noOcclusion()));
    public static final RegistryObject<Item> TRANSPARENT_SLATE_ITEM = ITEMS.register("transparent_slate", () -> new ItemSlate(TRANSPARENT_SLATE.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_MINI_BRICKS_STAIRS =BLOCKS.register("amethyst_bricks_mini_stairs",()-> new StairBlock(HexBlocks.AMETHYST_BRICKS_SMALL.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_MINI_BRICKS_STAIRS_ITEM = ITEMS.register("amethyst_bricks_mini_stairs", () -> new BlockItem(AMETHYST_MINI_BRICKS_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_BRICKS_STAIRS =BLOCKS.register("amethyst_bricks_stairs",()-> new StairBlock(HexBlocks.AMETHYST_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_BRICKS_STAIRS_ITEM = ITEMS.register("amethyst_bricks_stairs", () -> new BlockItem(AMETHYST_BRICKS_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> AMETHYST_TILES_STAIRS =BLOCKS.register("amethyst_tiles_stairs",()-> new StairBlock(HexBlocks.AMETHYST_TILES.defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Item> AMETHYST_TILES_STAIRS_ITEM = ITEMS.register("amethyst_tiles_stairs", () -> new BlockItem(AMETHYST_TILES_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_BRICKS_MINI_STAIRS =BLOCKS.register("slate_bricks_mini_stairs",()-> new StairBlock(HexBlocks.SLATE_BRICKS_SMALL.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_BRICKS_MINI_STAIRS_ITEM = ITEMS.register("slate_bricks_mini_stairs", () -> new BlockItem(SLATE_BRICKS_MINI_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_BRICKS_STAIRS =BLOCKS.register("slate_bricks_stairs",()-> new StairBlock(HexBlocks.SLATE_BRICKS.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_BRICKS_STAIRS_ITEM = ITEMS.register("slate_bricks_stairs", () -> new BlockItem(SLATE_BRICKS_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_STAIRS =BLOCKS.register("slate_stairs",()-> new StairBlock(HexBlocks.SLATE_BLOCK.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_STAIRS_ITEM = ITEMS.register("slate_stairs", () -> new BlockItem(SLATE_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_TILES_STAIRS =BLOCKS.register("slate_tiles_stairs",()-> new StairBlock(HexBlocks.SLATE_TILES.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(2.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_TILES_STAIRS_ITEM = ITEMS.register("slate_tiles_stairs", () -> new BlockItem(SLATE_TILES_STAIRS.get(), new Item.Properties()));


    public static final RegistryObject<Block> CHARGED_AMETHYST_BLOCK =BLOCKS.register("charged_amethyst_block",()-> new HexParticleBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_BLOCK_ITEM = ITEMS.register("charged_amethyst_block", () -> new BlockItem(CHARGED_AMETHYST_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_BRICKS =BLOCKS.register("charged_amethyst_bricks",()-> new HexParticleBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_BRICKS_ITEM = ITEMS.register("charged_amethyst_bricks", () -> new BlockItem(CHARGED_AMETHYST_BRICKS.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_LAMP =BLOCKS.register("charged_amethyst_lamp",()-> new HexLampBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),15));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_LAMP_ITEM = ITEMS.register("charged_amethyst_lamp", () -> new BlockItem(CHARGED_AMETHYST_LAMP.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_SLAB =BLOCKS.register("charged_amethyst_slab",()-> new HexParticleSlab(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_SLAB_ITEM = ITEMS.register("charged_amethyst_slab", () -> new BlockItem(CHARGED_AMETHYST_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_BRICKS_SLAB =BLOCKS.register("charged_amethyst_bricks_slab",()-> new HexParticleSlab(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_BRICKS_SLAB_ITEM = ITEMS.register("charged_amethyst_bricks_slab", () -> new BlockItem(CHARGED_AMETHYST_BRICKS_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_STAIRS =BLOCKS.register("charged_amethyst_stairs",()-> new HexParticleStairs( CHARGED_AMETHYST_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_STAIRS_ITEM = ITEMS.register("charged_amethyst_stairs", () -> new BlockItem(CHARGED_AMETHYST_STAIRS.get(), new Item.Properties()));

    public static final RegistryObject<Block> CHARGED_AMETHYST_BRICKS_STAIRS =BLOCKS.register("charged_amethyst_bricks_stairs",()-> new HexParticleStairs(CHARGED_AMETHYST_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK),5));
    public static final RegistryObject<Item>  CHARGED_AMETHYST_BRICKS_STAIRS_ITEM = ITEMS.register("charged_amethyst_bricks_stairs", () -> new BlockItem(CHARGED_AMETHYST_BRICKS_STAIRS.get(), new Item.Properties()));


    public static final RegistryObject<Block> SLATE_AMETHYST_TILES_SLAB =BLOCKS.register("slate_amethyst_tiles_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_TILES_SLAB_ITEM = ITEMS.register("slate_amethyst_tiles_slab", () -> new BlockItem(SLATE_AMETHYST_TILES_SLAB.get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_AMETHYST_TILES_STAIRS =BLOCKS.register("slate_amethyst_tiles_stairs",()-> new StairBlock(HexBlocks.SLATE_AMETHYST_TILES.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_TILES_STAIRS_ITEM = ITEMS.register("slate_amethyst_tiles_stairs", () -> new BlockItem(SLATE_AMETHYST_TILES_STAIRS.get(), new Item.Properties()));


/*

    public static final RegistryObject<Block> SLATE_AMETHYST_BRICKS_STAIRS =BLOCKS.register("slate_amethyst_bricks_stairs",()-> new StairBlock(HexBlocks.SLATE_AMETHYST_BRICKS.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_BRICKS_STAIRS_ITEM = ITEMS.register("slate_amethyst_bricks_stairs", () -> new BlockItem(SLATE_AMETHYST_BRICKS_STAIRS.get(), new Item.Properties()));

   public static final RegistryObject<Block> SLATE_AMETHYST_MINI_BRICKS_STAIRS =BLOCKS.register("slate_amethyst_mini_bricks_stairs",()-> new StairBlock(HexBlocks.SLATE_AMETHYST_BRICKS_SMALL.defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_MINI_BRICKS_STAIRS_ITEM = ITEMS.register("slate_amethyst_mini_bricks_stairs", () -> new BlockItem(SLATE_AMETHYST_MINI_BRICKS_STAIRS.get(), new Item.Properties()));


    public static final RegistryObject<Block> SLATE_AMETHYST_BRICKS_SLAB =BLOCKS.register("slate_amethyst_bricks_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_BRICKS_SLAB_ITEM = ITEMS.register("slate_amethyst_bricks_slab", () -> new BlockItem(SLATE_AMETHYST_BRICKS_SLAB .get(), new Item.Properties()));

    public static final RegistryObject<Block> SLATE_AMETHYST_MINI_BRICKS_SLAB =BLOCKS.register("slate_amethyst_mini_bricks_slab",()-> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).strength(4.0F, 4.0F).requiresCorrectToolForDrops()));
    public static final RegistryObject<Item> SLATE_AMETHYST_MINI_BRICKS_SLAB_ITEM = ITEMS.register("slate_amethyst_mini_bricks_slab", () -> new BlockItem(SLATE_AMETHYST_MINI_BRICKS_SLAB.get(), new Item.Properties()));


 */


}
