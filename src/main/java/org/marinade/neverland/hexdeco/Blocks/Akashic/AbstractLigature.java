package org.marinade.neverland.hexdeco.Blocks.Akashic;

import at.petrak.hexcasting.common.blocks.akashic.AkashicFloodfiller;
import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicLigature;
import at.petrak.hexcasting.common.lib.HexBlocks;

public class AbstractLigature extends BlockAkashicLigature implements AkashicFloodfiller {
    public AbstractLigature(Properties properties) {
        super(properties);
    }

    @Override
    public String getDescriptionId() {
        return HexBlocks.AKASHIC_LIGATURE.getDescriptionId();
    }
}
