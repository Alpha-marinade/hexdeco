package org.marinade.neverland.hexdeco.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static org.marinade.neverland.hexdeco.Hexdeco.MODID;
import static org.marinade.neverland.hexdeco.register.DecoBlockReg.*;

public class DecoTabReg {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> HEXDECO_TAB = CREATIVE_MODE_TABS.register("hexdeco", () -> CreativeModeTab.builder().withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> CHARGED_AMETHYST_LAMP_ITEM.get().getDefaultInstance()).title(Component.literal("HexDeco")).displayItems((parameters, output) -> {
        output.accept(OAK_RUNESHELF_ITEM.get());

        output.accept(OAK_RECORD_ITEM.get());
        output.accept(OAK_LIGATURE_ITEM.get());

        output.accept(DARK_OAK_RUNESHELF_ITEM.get());
        output.accept(DARK_OAK_RECORD_ITEM.get());
        output.accept(DARK_OAK_LIGATURE_ITEM.get());

        output.accept(BAMBOO_RUNESHELF_ITEM.get());
        output.accept(BAMBOO_RECORD_ITEM.get());
        output.accept(BAMBOO_LIGATURE_ITEM.get());

        output.accept(BIRCH_RUNESHELF_ITEM.get());
        output.accept(BIRCH_RECORD_ITEM.get());
        output.accept(BIRCH_LIGATURE_ITEM.get());

        output.accept(CHERRY_RUNESHELF_ITEM.get());
        output.accept(CHERRY_RECORD_ITEM.get());
        output.accept(CHERRY_LIGATURE_ITEM.get());

        output.accept(CRIMSON_RUNESHELF_ITEM.get());
        output.accept(CRIMSON_RECORD_ITEM.get());
        output.accept(CRIMSON_LIGATURE_ITEM.get());

        output.accept(JUNGLE_RUNESHELF_ITEM.get());
        output.accept(JUNGLE_RECORD_ITEM.get());
        output.accept(JUNGLE_LIGATURE_ITEM.get());

        output.accept(MANGROVE_RUNESHELF_ITEM.get());
        output.accept(MANGROVE_RECORD_ITEM.get());
        output.accept(MANGROVE_LIGATURE_ITEM.get());

        output.accept(SPRUCE_RUNESHELF_ITEM.get());
        output.accept(SPRUCE_RECORD_ITEM.get());
        output.accept(SPRUCE_LIGATURE_ITEM.get());

        output.accept(WARPED_RUNESHELF_ITEM.get());
        output.accept(WARPED_RECORD_ITEM.get());
        output.accept(WARPED_LIGATURE_ITEM.get());

        output.accept(AMETHYST_MINI_BRICKS_SLAB_ITEM.get());
        output.accept(AMETHYST_BRICKS_SLAB_ITEM.get());
        output.accept(AMETHYST_TILES_SLAB_ITEM.get());
        output.accept(SLATE_BRICKS_MINI_SLAB_ITEM.get());
        output.accept( SLATE_BRICKS_SLAB_ITEM.get());
        output.accept(SLATE_SLAB_ITEM.get());
        output.accept(SLATE_TILES_SLAB_ITEM.get());

        output.accept(TRANSPARENT_SLATE_ITEM.get());

        output.accept(AMETHYST_MINI_BRICKS_STAIRS_ITEM.get());
        output.accept(AMETHYST_BRICKS_STAIRS_ITEM.get());
        output.accept(AMETHYST_TILES_STAIRS_ITEM.get());
        output.accept(SLATE_BRICKS_MINI_STAIRS_ITEM.get());
        output.accept(SLATE_BRICKS_STAIRS_ITEM.get());
        output.accept(SLATE_STAIRS_ITEM.get());
        output.accept(SLATE_TILES_STAIRS_ITEM.get());

        output.accept(SLATE_AMETHYST_TILES_SLAB_ITEM.get());
        output.accept(SLATE_AMETHYST_TILES_STAIRS_ITEM.get());


        output.accept(CHARGED_AMETHYST_BLOCK_ITEM.get());
        output.accept(CHARGED_AMETHYST_BRICKS_ITEM.get());
        output.accept(CHARGED_AMETHYST_LAMP_ITEM.get());

        output.accept(CHARGED_AMETHYST_SLAB_ITEM.get());
        output.accept(CHARGED_AMETHYST_BRICKS_SLAB_ITEM.get());

        output.accept(CHARGED_AMETHYST_STAIRS_ITEM.get());
        output.accept(CHARGED_AMETHYST_BRICKS_STAIRS_ITEM.get());


        /*
        output.accept(SLATE_AMETHYST_TILES_STAIRS_ITEM.get());
        output.accept(SLATE_AMETHYST_BRICKS_STAIRS_ITEM.get());
        output.accept(SLATE_AMETHYST_MINI_BRICKS_STAIRS_ITEM.get());
        output.accept(SLATE_AMETHYST_TILES_SLAB_ITEM.get());
        output.accept(SLATE_AMETHYST_BRICKS_SLAB_ITEM.get());
        output.accept(SLATE_AMETHYST_MINI_BRICKS_SLAB_ITEM.get());

         */
    }).build());
}
