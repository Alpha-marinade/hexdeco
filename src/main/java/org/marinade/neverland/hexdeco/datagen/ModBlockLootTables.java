package org.marinade.neverland.hexdeco.datagen;

import at.petrak.hexcasting.common.blocks.circles.BlockEntitySlate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.CopyNbtFunction;
import net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.marinade.neverland.hexdeco.register.DecoBlockReg;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    private final Set<Block> knownBlocks = new HashSet<>();

    public ModBlockLootTables() {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        for(RegistryObject<Block> block :DecoBlockReg.BLOCKS.getEntries()){
            dropSelf(block.get());
        }

        var slatePool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .add(LootItem.lootTableItem(DecoBlockReg.TRANSPARENT_SLATE.get())
                        .apply(CopyNbtFunction.copyData(ContextNbtProvider.BLOCK_ENTITY)
                                .copy(BlockEntitySlate.TAG_PATTERN, "BlockEntityTag." + BlockEntitySlate.TAG_PATTERN)));

     add(DecoBlockReg.TRANSPARENT_SLATE.get(), LootTable.lootTable().withPool(slatePool));
        knownBlocks.addAll(DecoBlockReg.BLOCKS.getEntries().stream().map(RegistryObject::get).toList());
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return knownBlocks;
    }
}
