package org.marinade.neverland.hexdeco.Entity.Akashic;

import at.petrak.hexcasting.api.block.HexBlockEntity;
import at.petrak.hexcasting.api.casting.iota.Iota;
import at.petrak.hexcasting.api.casting.iota.IotaType;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import at.petrak.hexcasting.client.render.HexPatternPoints;
import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicBookshelf;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import static org.marinade.neverland.hexdeco.register.DecoEntityReg.*;

public class CherryAkashicBookshelfEntity extends HexBlockEntity {
    public static final String TAG_PATTERN = "pattern";
    private HexPattern pattern = null;
    private CompoundTag iotaTag = null;

    public CherryAkashicBookshelfEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(CHERRY_RUNESHELF_TILE.get(), pWorldPosition, pBlockState);
    }

    public @Nullable HexPattern getPattern() {
        return this.pattern;
    }

    public @Nullable CompoundTag getIotaTag() {
        return this.iotaTag;
    }

    public void setNewMapping(HexPattern pattern, Iota iota) {
        boolean previouslyEmpty = this.pattern == null;
        this.pattern = pattern;
        this.iotaTag = IotaType.serialize(iota);
        if (previouslyEmpty) {
            BlockState oldBs = this.getBlockState();
            BlockState newBs = oldBs.setValue(BlockAkashicBookshelf.HAS_BOOKS, true);
            this.level.setBlock(this.getBlockPos(), newBs, 3);
            this.level.sendBlockUpdated(this.getBlockPos(), oldBs, newBs, 3);
        } else {
            this.setChanged();
        }
    }

    public void clearIota() {
        boolean previouslyEmpty = this.pattern == null;
        this.pattern = null;
        this.iotaTag = null;
        if (!previouslyEmpty) {
            BlockState oldBs = this.getBlockState();
            BlockState newBs = oldBs.setValue(BlockAkashicBookshelf.HAS_BOOKS, false);
            this.level.setBlock(this.getBlockPos(), newBs, 3);
            this.level.sendBlockUpdated(this.getBlockPos(), oldBs, newBs, 3);
        } else {
            this.setChanged();
        }

    }

    protected void saveModData(CompoundTag compoundTag) {
        if (this.pattern != null && this.iotaTag != null) {
            compoundTag.put("pattern", this.pattern.serializeToNBT());
            compoundTag.put("iota", this.iotaTag);
        } else {
            compoundTag.putBoolean("dummy", false);
        }

    }

    protected void loadModData(CompoundTag tag) {
        if (tag.contains("pattern") && tag.contains("iota")) {
            this.pattern = HexPattern.fromNBT(tag.getCompound("pattern"));
            this.iotaTag = tag.getCompound("iota");
        } else if (tag.contains("dummy")) {
            this.pattern = null;
            this.iotaTag = null;
        }

    }
}
