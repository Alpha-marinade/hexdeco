package org.marinade.neverland.hexdeco.Client;


import at.petrak.hexcasting.api.casting.math.HexPattern;
import at.petrak.hexcasting.client.render.PatternColors;
import at.petrak.hexcasting.client.render.PatternRenderer;
import at.petrak.hexcasting.client.render.PatternSettings;
import at.petrak.hexcasting.client.render.PatternSettings.PositionSettings;
import at.petrak.hexcasting.client.render.PatternSettings.StrokeSettings;
import at.petrak.hexcasting.client.render.PatternSettings.ZappySettings;
import at.petrak.hexcasting.common.blocks.akashic.BlockAkashicBookshelf;
import at.petrak.hexcasting.common.blocks.circles.BlockSlate;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import javax.annotation.Nullable;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.phys.Vec3;
import org.marinade.neverland.hexdeco.Entity.Akashic.*;
import org.marinade.neverland.hexdeco.Entity.TransparentSlateEntity;

public class BookshelfPatternRenderer {

    public static final PatternSettings SCROLL_SETTINGS;
    public static final PatternSettings READABLE_SCROLL_SETTINGS;
    public static final PatternSettings WORLDLY_SETTINGS;
    public static final PatternSettings WORLDLY_SETTINGS_WOBBLY;
    private static final int[] WALL_ROTATIONS;
    private static final Vec3i[] SLATE_FACINGS;
    private static final Vec3[] WALL_NORMALS;
    private static final Vec3i[] SLATE_FLOORCEIL_FACINGS;
    private static final Vec3i[] BLOCK_FACINGS;

    public BookshelfPatternRenderer() {
    }
    public static void renderPatternForAkashicBookshelf(OakAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(DarkOakAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(SpruceAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(WarpedAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(BambooAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(BirchAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(CrimsonAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(MangroveAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(JungleAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForAkashicBookshelf(CherryAkashicBookshelfEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        int facing = ((Direction)bs.getValue(BlockAkashicBookshelf.FACING)).get2DDataValue();
        ps.pushPose();
        ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
        Vec3i tV = BLOCK_FACINGS[facing % 4];
        ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
        ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
        int actualLight = LevelRenderer.getLightColor(tile.getLevel(), tile.getBlockPos().relative((Direction)bs.getValue(BlockAkashicBookshelf.FACING)));
        renderPattern(pattern, WORLDLY_SETTINGS, PatternColors.DEFAULT_PATTERN_COLOR, (double)tile.getBlockPos().hashCode(), ps, buffer, WALL_NORMALS[facing % 4].multiply((double)-1.0F, (double)-1.0F, (double)-1.0F), -0.02F, actualLight, 1);
        ps.popPose();
    }
    public static void renderPatternForSlate(TransparentSlateEntity tile, HexPattern pattern, PoseStack ps, MultiBufferSource buffer, int light, BlockState bs) {
        boolean isOnWall = bs.getValue(BlockSlate.ATTACH_FACE) == AttachFace.WALL;
        boolean isOnCeiling = bs.getValue(BlockSlate.ATTACH_FACE) == AttachFace.CEILING;
        int facing = ((Direction)bs.getValue(BlockSlate.FACING)).get2DDataValue();
        boolean wombly = (Boolean)bs.getValue(BlockSlate.ENERGIZED);
        ps.pushPose();
        Vec3 normal = null;
        if (isOnWall) {
            ps.mulPose(Axis.ZP.rotationDegrees(180.0F));
            Vec3i tV = SLATE_FACINGS[facing % 4];
            ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
            ps.mulPose(Axis.YP.rotationDegrees((float)WALL_ROTATIONS[facing % 4]));
            normal = WALL_NORMALS[facing % 4];
        } else {
            Vec3i tV = SLATE_FLOORCEIL_FACINGS[facing % 4];
            ps.translate((float)tV.getX(), (float)tV.getY(), (float)tV.getZ());
            ps.mulPose(Axis.YP.rotationDegrees((float)(facing * -90)));
            ps.mulPose(Axis.XP.rotationDegrees((float)(90 * (isOnCeiling ? -1 : 1))));
            if (isOnCeiling) {
                ps.translate(0.0F, -1.0F, 1.0F);
            }
        }

        renderPattern(pattern, wombly ? WORLDLY_SETTINGS_WOBBLY : WORLDLY_SETTINGS, wombly ? HexColor.getById(tile.getColor()).getOnColor() : HexColor.getById(tile.getColor()).getOffColor(), (double)tile.getBlockPos().hashCode(), ps, buffer, normal, (Float)null, light, 1);
        ps.popPose();
    }

    public static void renderPattern(HexPattern pattern, PatternSettings patSets, PatternColors patColors, double seed, PoseStack ps, MultiBufferSource bufSource, Vec3 normal, @Nullable Float zOffset, int light, int blockSize) {
        ps.pushPose();
        float z = zOffset != null ? zOffset : -0.0725F;
        normal = normal != null ? normal : new Vec3((double)0.0F, (double)0.0F, (double)-1.0F);
        ps.translate(0.0F, 0.0F, z);
        ps.scale((float)blockSize, (float)blockSize, 1.0F);
        PoseStack noNormalInv = new PoseStack();
        noNormalInv.scale(1.0F, 1.0F, -1.0F);
        ps.mulPoseMatrix(noNormalInv.last().pose());
        PatternRenderer.renderPattern(pattern, ps, new PatternRenderer.WorldlyBits(bufSource, light, normal), patSets, patColors, seed, blockSize * 512);
        ps.popPose();
    }

    static {
        SCROLL_SETTINGS = new PatternSettings("scroll", PositionSettings.paddedSquare((double)0.125F), StrokeSettings.fromStroke(0.05), ZappySettings.STATIC);
        READABLE_SCROLL_SETTINGS = new PatternSettings("scroll_readable", PositionSettings.paddedSquare((double)0.125F), StrokeSettings.fromStroke(0.05), ZappySettings.READABLE);
        WORLDLY_SETTINGS = new PatternSettings("worldly", PositionSettings.paddedSquare((double)0.125F), StrokeSettings.fromStroke(0.05), ZappySettings.STATIC);
        WORLDLY_SETTINGS_WOBBLY = new PatternSettings("wobbly_world", PositionSettings.paddedSquare((double)0.125F), StrokeSettings.fromStroke(0.05), ZappySettings.WOBBLY);
        WALL_ROTATIONS = new int[]{180, 270, 0, 90};
        SLATE_FACINGS = new Vec3i[]{new Vec3i(0, -1, 0), new Vec3i(-1, -1, 0), new Vec3i(-1, -1, 1), new Vec3i(0, -1, 1)};
        WALL_NORMALS = new Vec3[]{new Vec3((double)0.0F, (double)0.0F, (double)-1.0F), new Vec3((double)-1.0F, (double)0.0F, (double)0.0F), new Vec3((double)0.0F, (double)0.0F, (double)-1.0F), new Vec3((double)-1.0F, (double)0.0F, (double)0.0F)};
        SLATE_FLOORCEIL_FACINGS = new Vec3i[]{new Vec3i(0, 0, 0), new Vec3i(1, 0, 0), new Vec3i(1, 0, 1), new Vec3i(0, 0, 1)};
        BLOCK_FACINGS = new Vec3i[]{new Vec3i(0, -1, 1), new Vec3i(0, -1, 0), new Vec3i(-1, -1, 0), new Vec3i(-1, -1, 1)};
    }
}

