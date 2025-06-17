package org.marinade.neverland.hexdeco.Client.Akashic;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.state.BlockState;
import org.marinade.neverland.hexdeco.Entity.TransparentSlateEntity;

import static org.marinade.neverland.hexdeco.Client.BookshelfPatternRenderer.renderPatternForSlate;

public class TransparentSlateRenderer implements BlockEntityRenderer<TransparentSlateEntity> {
    public TransparentSlateRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    public void render(TransparentSlateEntity tile, float pPartialTick, PoseStack ps, MultiBufferSource buffer, int light, int overlay) {
        if (tile.pattern != null) {
            BlockState bs = tile.getBlockState();
            renderPatternForSlate(tile, tile.pattern, ps, buffer, light, bs);
        }
    }
}
