package org.marinade.neverland.hexdeco.Blocks.Akashic.Warped;

import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicBookshelf;
import at.petrak.hexcasting.common.lib.HexBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.marinade.neverland.hexdeco.Entity.Akashic.WarpedAkashicBookshelfEntity;

public class WarpedAkashicBookshelfBlock extends BlockAkashicBookshelf {
    public WarpedAkashicBookshelfBlock(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new WarpedAkashicBookshelfEntity(pPos,pState);
    }
    @Override
    public String getDescriptionId() {
        return HexBlocks.AKASHIC_BOOKSHELF.getDescriptionId();
    }
}
