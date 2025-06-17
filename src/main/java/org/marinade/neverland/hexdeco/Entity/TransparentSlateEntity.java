package org.marinade.neverland.hexdeco.Entity;

import at.petrak.hexcasting.api.block.HexBlockEntity;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;


import static org.marinade.neverland.hexdeco.Blocks.TransparentSlate.COLOR;
import static org.marinade.neverland.hexdeco.register.DecoEntityReg.TRANSPARENT_SLATE_TILE;

public class TransparentSlateEntity extends HexBlockEntity {
    public static final String TAG_PATTERN = "pattern";
    public @Nullable HexPattern pattern;
    private int color;

    public TransparentSlateEntity(BlockPos pos, BlockState state) {
        super(TRANSPARENT_SLATE_TILE.get(), pos, state);
        this.color = state.getValue(COLOR);
    }

    protected void saveModData(CompoundTag tag) {
        if (this.pattern != null) {
            tag.put("pattern", this.pattern.serializeToNBT());
        } else {
            tag.put("pattern", new CompoundTag());
        }
        tag.putInt("color", this.color);
    }

    @Override
    protected void loadModData(CompoundTag tag) {
        if (tag.contains("color")) {
            this.color = tag.getInt("color");
        }
        if (this.level != null) {
            BlockState state = this.level.getBlockState(this.worldPosition);
            if (state.hasProperty(COLOR)) {
                this.color = state.getValue(COLOR);
            }
        }
        if (tag.contains(TAG_PATTERN, 10)) {
            CompoundTag patternTag = tag.getCompound(TAG_PATTERN);
            if (HexPattern.isPattern(patternTag)) {
                this.pattern = HexPattern.fromNBT(patternTag);
            } else {
                this.pattern = null;
            }
        } else {
            this.pattern = null;
        }
    }
   public int getColor(){
        return this.color;
   }
   public void setColor(int color){
        this.color=color;

   }
}
