package org.marinade.neverland.hexdeco.Blocks;


import at.petrak.hexcasting.api.casting.ParticleSpray;
import at.petrak.hexcasting.api.casting.circles.ICircleComponent;
import at.petrak.hexcasting.api.casting.eval.ExecutionClientView;
import at.petrak.hexcasting.api.casting.eval.env.CircleCastEnv;
import at.petrak.hexcasting.api.casting.eval.vm.CastingImage;
import at.petrak.hexcasting.api.casting.eval.vm.CastingVM;
import at.petrak.hexcasting.api.casting.iota.PatternIota;
import at.petrak.hexcasting.api.casting.math.HexPattern;
import at.petrak.hexcasting.api.pigment.FrozenPigment;
import at.petrak.hexcasting.common.blocks.circles.BlockEntitySlate;
import at.petrak.hexcasting.common.blocks.circles.BlockSlate;
import at.petrak.hexcasting.common.lib.HexItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;
import org.marinade.neverland.hexdeco.Client.HexColor;
import org.marinade.neverland.hexdeco.Entity.TransparentSlateEntity;

import java.util.EnumSet;
import java.util.stream.Stream;


import static org.marinade.neverland.hexdeco.register.DecoBlockReg.TRANSPARENT_SLATE_ITEM;

public class TransparentSlate extends BlockSlate  implements EntityBlock, SimpleWaterloggedBlock {
    public static IntegerProperty COLOR = IntegerProperty.create("color", 0, 32);

    public TransparentSlate(Properties p_53182_) {
        super(p_53182_);
        this.registerDefaultState(this.getStateDefinition().any().setValue(COLOR, 0));
    }

    @Override
    public ControlFlow acceptControlFlow(CastingImage imageIn, CircleCastEnv env, Direction enterDir, BlockPos pos, BlockState bs, ServerLevel world) {
        BlockEntity exitDirsSet = world.getBlockEntity(pos);
        if (exitDirsSet instanceof TransparentSlateEntity tile) {
            HexPattern pattern = tile.pattern;
            EnumSet<Direction> exitDirsSet2 = this.possibleExitDirections(pos, bs, world);
            exitDirsSet2.remove(enterDir.getOpposite());
            Stream exitDirs = exitDirsSet2.stream().map((dir) -> this.exitPositionFromDirection(pos, dir));
            if (pattern == null) {
                return new ICircleComponent.ControlFlow.Continue(imageIn, exitDirs.toList());
            } else {
                CastingVM vm = new CastingVM(imageIn, env);
                ExecutionClientView result = vm.queueExecuteAndWrapIota(new PatternIota(pattern), world);
                return (result.getResolutionType().getSuccess() ? new ICircleComponent.ControlFlow.Continue(vm.getImage(), exitDirs.toList()) : new ICircleComponent.ControlFlow.Stop());
            }
        } else {
            return new ICircleComponent.ControlFlow.Stop();
        }
    }

    @Override
    public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, Player player) {
        BlockEntity be = level.getBlockEntity(pos);
        if (be instanceof BlockEntitySlate slate) {
            ItemStack stack = new ItemStack(TRANSPARENT_SLATE_ITEM.get());
            if (slate.pattern != null) {
                HexItems.SLATE.writeDatum(stack, new PatternIota(slate.pattern));
            }

            return stack;
        } else {
            return new ItemStack(this);
        }
    }

    public @Nullable BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new TransparentSlateEntity(pPos, pState);
    }

    @Override
    public BlockState startEnergized(BlockPos pos, BlockState bs, Level world) {
        return super.startEnergized(pos, bs, world);
    }

    @Override
    public boolean isEnergized(BlockPos pos, BlockState bs, Level world) {
        return super.isEnergized(pos, bs, world);
    }

    @Override
    public BlockState endEnergized(BlockPos pos, BlockState bs, Level world) {
        return super.endEnergized(pos, bs, world);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext pContext) {
        FluidState fluidState = pContext.getLevel().getFluidState(pContext.getClickedPos());

        for (Direction direction : pContext.getNearestLookingDirections()) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = (this.defaultBlockState().setValue(ATTACH_FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR)).setValue(FACING, pContext.getHorizontalDirection().getOpposite());
            } else {
                blockstate = (this.defaultBlockState().setValue(ATTACH_FACE, AttachFace.WALL)).setValue(FACING, direction.getOpposite());
            }
            int Color = 0;

            CompoundTag playerData = pContext.getPlayer().getPersistentData();
            if (playerData.contains("hexcasting:pigment")) {
                CompoundTag pigment = playerData.getCompound("hexcasting:pigment");
                for (HexColor hexColor : HexColor.values()) {
                    if (hexColor.getName().equals(pigment.getCompound("stack").getString("id"))) {
                        Color = hexColor.getId();
                    }
                }
            }
            blockstate = blockstate.setValue(WATERLOGGED, fluidState.is(FluidTags.WATER) && fluidState.getAmount() == 8).setValue(COLOR, Color).setValue(ENERGIZED, false);
            if (blockstate.canSurvive(pContext.getLevel(), pContext.getClickedPos())) {
                return blockstate;
            }
        }

        return null;
    }


    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(COLOR);
    }

    @Override
    public InteractionResult use(BlockState currentState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            ItemStack heldStack = player.getMainHandItem();
            String usedItem = "hexcasting:" + heldStack.getItem().toString();

            for (HexColor hexColor : HexColor.values()) {
                if (hexColor.getName().equals(usedItem)) {
                    BlockState newState = currentState.setValue(COLOR, hexColor.getId());

                    if (newState != currentState) {
                        if (level instanceof ServerLevel serverLevel) {
                            Vec3 v=new Vec3(0,0,0);

                           v.add(0,-0.5,0);
                            ParticleSpray spray = new ParticleSpray(pos.getCenter().add(v), new Vec3(0.0,1.0,0.0), 0.5,
                                    Mth.PI / 2, 100);
                            spray.sprayParticles(serverLevel,new FrozenPigment(heldStack,player.getUUID()));
                        }

                        level.setBlock(pos, newState, Block.UPDATE_ALL);
                        BlockEntity entity= level.getBlockEntity(pos);
                        if(entity instanceof TransparentSlateEntity){
                            ((TransparentSlateEntity) entity).setColor(newState.getValue(COLOR));
                            entity.setChanged();
                        }

                        return InteractionResult.SUCCESS;
                    }
                }
            }
        }
        return super.use(currentState, level, pos, player, hand, hitResult);
    }
}

