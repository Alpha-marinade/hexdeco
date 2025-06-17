package org.marinade.neverland.hexdeco.Client.Akashic;


import at.petrak.hexcasting.api.casting.math.HexPattern;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import org.marinade.neverland.hexdeco.Client.BookshelfPatternRenderer;
import org.marinade.neverland.hexdeco.Entity.Akashic.BirchAkashicBookshelfEntity;


public class BirchAkashicBookshelfRenderer implements BlockEntityRenderer<BirchAkashicBookshelfEntity> {
        public BirchAkashicBookshelfRenderer(BlockEntityRendererProvider.Context ctx) {
        }
        @Override
        public void render(BirchAkashicBookshelfEntity tile, float pPartialTick, PoseStack ps, MultiBufferSource buffer, int light, int overlay) {

            HexPattern pattern = tile.getPattern();
            if (pattern == null) {
                return;
            }
            var bs = tile.getBlockState();
            BookshelfPatternRenderer.renderPatternForAkashicBookshelf(tile, pattern, ps, buffer, light, bs);

        }

    }

