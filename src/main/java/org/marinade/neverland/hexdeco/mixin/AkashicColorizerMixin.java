package org.marinade.neverland.hexdeco.mixin;

import at.petrak.hexcasting.client.RegisterClientStuff;
import at.petrak.hexcasting.common.lib.HexBlocks;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.function.BiConsumer;

@Mixin(RegisterClientStuff.class)
public class AkashicColorizerMixin {
    @Redirect(
            method = "registerColorProviders",
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/util/function/BiConsumer;accept(Ljava/lang/Object;Ljava/lang/Object;)V"
            ),
            remap = false
    )
    private static void skipAkashicBookshelfColor(BiConsumer<Object, Object> consumer, Object color, Object block) {
        if (!(block instanceof Block) || block != HexBlocks.AKASHIC_BOOKSHELF) {
            consumer.accept(color, block);
        }

    }
}
