package org.marinade.neverland.hexdeco.register;

import net.minecraftforge.client.event.EntityRenderersEvent;
import org.marinade.neverland.hexdeco.Client.Akashic.*;
import static org.marinade.neverland.hexdeco.register.DecoEntityReg.*;

public class BlockEntityRendererReg {
    public static void reg(EntityRenderersEvent.RegisterRenderers evt) {
        evt.registerBlockEntityRenderer(
                OAK_RUNESHELF_TILE.get(),
                OakAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                DARK_OAK_RUNESHELF_TILE.get(),
                DarkOakAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                BAMBOO_RUNESHELF_TILE.get(),
                BambooAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                BIRCH_RUNESHELF_TILE.get(),
                BirchAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                CHERRY_RUNESHELF_TILE.get(),
                CherryAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                CRIMSON_RUNESHELF_TILE.get(),
                CrimsonAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                JUNGLE_RUNESHELF_TILE.get(),
                JungleAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                MANGROVE_RUNESHELF_TILE.get(),
                MangroveAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                SPRUCE_RUNESHELF_TILE.get(),
                SpruceAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                WARPED_RUNESHELF_TILE.get(),
                WarpedAkashicBookshelfRenderer::new
        );
        evt.registerBlockEntityRenderer(
                TRANSPARENT_SLATE_TILE.get(),
                TransparentSlateRenderer::new
        );
    }
}
