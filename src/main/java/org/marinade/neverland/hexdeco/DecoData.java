package org.marinade.neverland.hexdeco;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.marinade.neverland.hexdeco.datagen.ModBlockTagsProvider;
import org.marinade.neverland.hexdeco.datagen.ModLootTableProvider;
import org.marinade.neverland.hexdeco.datagen.RecipeGen;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DecoData {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator=event.getGenerator();
        PackOutput output=generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider=event.getLookupProvider();
        ExistingFileHelper helper=event.getExistingFileHelper();
        generator.addProvider(
                event.includeServer(),
                new ModLootTableProvider(output,lookupProvider)
        );
        generator.addProvider(event.includeServer(),
                new RecipeGen(output)
        );
        generator.addProvider(event.includeServer(),
                new ModBlockTagsProvider(generator.getPackOutput(),
                        event.getLookupProvider(),helper));
    }
}
