package org.marinade.neverland.hexdeco.Blocks.Akashic.Birch;

import at.petrak.hexcasting.api.casting.iota.Iota;
import at.petrak.hexcasting.api.casting.iota.IotaType;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import at.petrak.hexcasting.common.blocks.akashic.AkashicFloodfiller;
import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicRecord;
import at.petrak.hexcasting.common.lib.HexBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import org.jetbrains.annotations.Nullable;
import org.marinade.neverland.hexdeco.Entity.Akashic.BirchAkashicBookshelfEntity;


public class BirchAkashiRecord extends BlockAkashicRecord {
    public BirchAkashiRecord(Properties p_49795_) {
        super(p_49795_);
    }
    public @Nullable BlockPos addNewDatum(BlockPos herePos, Level level, HexPattern key, Iota datum) {
        BlockPos clobbereePos = AkashicFloodfiller.floodFillFor(herePos, level, (pos, bs, world) -> {
            BlockEntity patt975$temp = world.getBlockEntity(pos);
            boolean var10000;
            if (patt975$temp instanceof BirchAkashicBookshelfEntity tile) {
                if (tile.getPattern() != null && tile.getPattern().sigsEqual(key)) {
                    var10000 = true;
                    return var10000;
                }
            }

            var10000 = false;
            return var10000;
        });
        if (clobbereePos != null) {
            return null;
        } else {
            BlockPos openPos = AkashicFloodfiller.floodFillFor(herePos, level, 0.9F, (pos, bs, world) -> {
                BlockEntity patt1329$temp = world.getBlockEntity(pos);
                boolean var10000;
                if (patt1329$temp instanceof BirchAkashicBookshelfEntity tile) {
                    if (tile.getPattern() == null) {
                        var10000 = true;
                        return var10000;
                    }
                }

                var10000 = false;
                return var10000;
            }, 128);
            if (openPos != null) {
                BirchAkashicBookshelfEntity tile = (BirchAkashicBookshelfEntity)level.getBlockEntity(openPos);
                tile.setNewMapping(key, datum);
                return openPos;
            } else {
                return null;
            }
        }
    }

    public @Nullable Iota lookupPattern(BlockPos herePos, HexPattern key, ServerLevel slevel) {
        BlockPos foundPos = AkashicFloodfiller.floodFillFor(herePos, slevel, (pos, bs, world) -> {
            BlockEntity patt1922$temp = world.getBlockEntity(pos);
            boolean var10000;
            if (patt1922$temp instanceof BirchAkashicBookshelfEntity tile) {
                if (tile.getPattern() != null && tile.getPattern().sigsEqual(key)) {
                    var10000 = true;
                    return var10000;
                }
            }

            var10000 = false;
            return var10000;
        });
        if (foundPos == null) {
            return null;
        } else {
            BirchAkashicBookshelfEntity tile = (BirchAkashicBookshelfEntity)slevel.getBlockEntity(foundPos);
            CompoundTag tag = tile.getIotaTag();
            return tag == null ? null : IotaType.deserialize(tag, slevel);
        }
    }
    @Override
    public String getDescriptionId() {
        return HexBlocks.AKASHIC_RECORD.getDescriptionId();
    }
}
