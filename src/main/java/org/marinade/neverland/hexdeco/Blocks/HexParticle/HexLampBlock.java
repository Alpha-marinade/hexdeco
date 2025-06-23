package org.marinade.neverland.hexdeco.Blocks.HexParticle;

import at.petrak.hexcasting.api.casting.ParticleSpray;
import at.petrak.hexcasting.api.pigment.FrozenPigment;
import at.petrak.hexcasting.common.lib.HexItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;

public class HexLampBlock extends Block {

    public HexLampBlock(Properties properties,int light) {
        super(properties.lightLevel(state -> light));
    }

    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState p_60569_, boolean p_60570_) {
        level.scheduleTick(pos, this.asBlock(),10);
        super.onPlace(state, level, pos, p_60569_, p_60570_);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        Vec3 v=new Vec3(0,0,0);
        ParticleSpray spray = new ParticleSpray(pos.getCenter().add(v),
                new Vec3(
                        -1 + 2.4 * random.nextDouble(),
                        -1.2 + 2.4 * random.nextDouble(),
                        -1.2 + 2.4 * random.nextDouble())
                , 0.5,
                Mth.PI / 2, 10);
        if( Minecraft.getInstance().player!=null){
            spray.sprayParticles(level, new FrozenPigment(HexItems.DEFAULT_PIGMENT.getDefaultInstance(), Minecraft.getInstance().player.getUUID()));
        }
        level.scheduleTick(pos, this.asBlock(),10);
        super.tick(state,level,pos,random);
    }


}
