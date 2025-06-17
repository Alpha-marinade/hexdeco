package org.marinade.neverland.hexdeco.register;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.marinade.neverland.hexdeco.Entity.Akashic.*;
import org.marinade.neverland.hexdeco.Entity.TransparentSlateEntity;

import static org.marinade.neverland.hexdeco.Hexdeco.MODID;
import static org.marinade.neverland.hexdeco.register.DecoBlockReg.*;

public class DecoEntityReg {
    public static final DeferredRegister<BlockEntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MODID);

    public static final RegistryObject<BlockEntityType<OakAkashicBookshelfEntity>> OAK_RUNESHELF_TILE =
            ENTITIES.register(
                    "oak_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            OakAkashicBookshelfEntity::new,
                            OAK_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<DarkOakAkashicBookshelfEntity>> DARK_OAK_RUNESHELF_TILE =
            ENTITIES.register(
                    "dark_oak_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            DarkOakAkashicBookshelfEntity::new,
                            DARK_OAK_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<BambooAkashicBookshelfEntity>> BAMBOO_RUNESHELF_TILE =
            ENTITIES.register(
                    "bamboo_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            BambooAkashicBookshelfEntity::new,
                            BAMBOO_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<BirchAkashicBookshelfEntity>> BIRCH_RUNESHELF_TILE =
            ENTITIES.register(
                    "birch_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            BirchAkashicBookshelfEntity::new,
                            BIRCH_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<CherryAkashicBookshelfEntity>> CHERRY_RUNESHELF_TILE =
            ENTITIES.register(
                    "cherry_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            CherryAkashicBookshelfEntity::new,
                            CHERRY_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<CrimsonAkashicBookshelfEntity>> CRIMSON_RUNESHELF_TILE =
            ENTITIES.register(
                    "crimson_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            CrimsonAkashicBookshelfEntity::new,
                            CRIMSON_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<JungleAkashicBookshelfEntity>> JUNGLE_RUNESHELF_TILE =
            ENTITIES.register(
                    "jungle_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            JungleAkashicBookshelfEntity::new,
                            JUNGLE_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<MangroveAkashicBookshelfEntity>> MANGROVE_RUNESHELF_TILE =
            ENTITIES.register(
                    "mangrove_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            MangroveAkashicBookshelfEntity::new,
                            MANGROVE_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<SpruceAkashicBookshelfEntity>> SPRUCE_RUNESHELF_TILE =
            ENTITIES.register(
                    "spruce_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            SpruceAkashicBookshelfEntity::new,
                            SPRUCE_RUNESHELF.get()
                    ).build(null)
            );
    public static final RegistryObject<BlockEntityType<WarpedAkashicBookshelfEntity>> WARPED_RUNESHELF_TILE =
            ENTITIES.register(
                    "warped_akashic_bookshelf",
                    () -> BlockEntityType.Builder.of(
                            WarpedAkashicBookshelfEntity::new,
                            WARPED_RUNESHELF.get()
                    ).build(null)
            );

    public static final RegistryObject<BlockEntityType<TransparentSlateEntity>> TRANSPARENT_SLATE_TILE =
            ENTITIES.register(
                    "transparent_slate",
                    () -> BlockEntityType.Builder.of(
                            TransparentSlateEntity::new,
                            TRANSPARENT_SLATE.get()
                    ).build(null)
            );
}
