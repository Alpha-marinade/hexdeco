package org.marinade.neverland.hexdeco.Blocks.HexParticle;

import at.petrak.hexcasting.api.casting.ParticleSpray;
import at.petrak.hexcasting.api.pigment.FrozenPigment;
import at.petrak.hexcasting.common.lib.HexItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;

public class HexParticleSlab extends SlabBlock {
    public HexParticleSlab(Properties properties,int light) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(level instanceof ServerLevel server){
            RandomSource random=level.getRandom();
            Vec3 v=new Vec3(0,0,0);
            v=state.getValue(TYPE)== SlabType.TOP?v.add(0,0.25,0):v.add(0,-0.25,0);
            ParticleSpray spray = new ParticleSpray(entity.getOnPos().getCenter().add(0,0.1,0).add(v),
                    new Vec3(
                            -0.5 + 1 * random.nextDouble(),
                            -0.5 + 1 * random.nextDouble(),
                            -0.5 + 1 * random.nextDouble())
                    , 0.5,
                    Mth.PI / 2, 10);
            if( Minecraft.getInstance().player!=null){
                spray.sprayParticles(server, new FrozenPigment(HexItems.DEFAULT_PIGMENT.getDefaultInstance(), Minecraft.getInstance().player.getUUID()));
            }
        }

        super.stepOn(level,pos,state,entity);
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
