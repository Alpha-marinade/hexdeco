package org.marinade.neverland.hexdeco.Blocks;

import at.petrak.hexcasting.api.casting.ParticleSpray;
import at.petrak.hexcasting.api.pigment.FrozenPigment;
import at.petrak.hexcasting.common.lib.HexItems;
import at.petrak.hexcasting.common.lib.HexMobEffects;
import at.petrak.hexcasting.common.misc.HexMobEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HexGlobe extends Block {
    protected static final VoxelShape SHAPE = Block.box(3.5D, 0.0D, 3.5D, 12.5D, 7.0D, 12.5D);

    public HexGlobe(Properties properties) {
        super(properties.lightLevel(state -> 12).emissiveRendering((state,block,pos)-> true).pushReaction(PushReaction.DESTROY));
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return SHAPE;
    }

    @Override
    public void onPlace(BlockState p_60566_, Level level, BlockPos pos, BlockState p_60569_, boolean p_60570_) {
        level.scheduleTick(pos, this.asBlock(),1);
        super.onPlace(p_60566_, level, pos, p_60569_, p_60570_);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {

        Vec3 v = new Vec3(0, -0.3, 0);
       ParticleSpray spray = new ParticleSpray(pos.getCenter().add(0,0.1,0).add(v),
                new Vec3(
                        -0.5 + 1* random.nextDouble(),
                        -0.5 + 1 * random.nextDouble(),
                        -0.5 + 1 * random.nextDouble())
                , 0.5,
                Mth.PI / 2, 5);
        if (Minecraft.getInstance().player != null) {
            spray.sprayParticles(level, new FrozenPigment(HexItems.DEFAULT_PIGMENT.getDefaultInstance(), Minecraft.getInstance().player.getUUID()));
        }
        AABB zone=new AABB(pos.east(2).north(2),pos.west(2).south(2).above(2));
        for(ServerPlayer player: level.getEntitiesOfClass(ServerPlayer.class,zone)){
           player.addEffect(new MobEffectInstance(HexMobEffects.ENLARGE_GRID,5*20,0,false,false));

        }
        level.scheduleTick(pos, this.asBlock(),20);
        super.tick(state, level, pos, random);
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader levelReader, BlockPos pos) {
        return levelReader.getBlockState(pos.below()).isSolid();
    }
    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        if(level instanceof ServerLevel server){
            Vec3 v=new Vec3(0,0,0);
            ParticleSpray spray = new ParticleSpray(pos.getCenter().add(v),
                    new Vec3(
                            0,
                            1.5,
                            0)
                    , 0.5,
                    Mth.PI / 2, 50);
            if( Minecraft.getInstance().player!=null){
                spray.sprayParticles(server, new FrozenPigment(HexItems.DEFAULT_PIGMENT.getDefaultInstance(), Minecraft.getInstance().player.getUUID()));
            }
        }
        return super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
    }
}
