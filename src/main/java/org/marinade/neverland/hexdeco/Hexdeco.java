package org.marinade.neverland.hexdeco;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddPackFindersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.marinade.neverland.hexdeco.register.BlockEntityRendererReg;
import org.slf4j.Logger;

import java.nio.file.Path;

import static org.marinade.neverland.hexdeco.register.DecoBlockReg.*;
import static org.marinade.neverland.hexdeco.register.DecoEntityReg.ENTITIES;
import static org.marinade.neverland.hexdeco.register.DecoTabReg.CREATIVE_MODE_TABS;

@Mod(Hexdeco.MODID)
public class Hexdeco {

    public static final String MODID = "hexdeco";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Hexdeco() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ENTITIES.register(modEventBus);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(TRANSPARENT_SLATE.get(), RenderType.translucent());
        }
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers evt) {
          BlockEntityRendererReg.reg(evt);
        }
        @SubscribeEvent
        public static void onAddResourcePack(AddPackFindersEvent event) {
            if (event.getPackType() == PackType.CLIENT_RESOURCES) {
                var modFile = ModList.get().getModFileById(MODID).getFile();
                Path resourcePath = modFile.getFilePath().resolve("additive");

                var pack = new PathPackResources(
                        "hexdeco:additive",
                        resourcePath,
                        false
                );

                event.addRepositorySource((consumer) -> {
                    Pack.ResourcesSupplier resourceSupplier = new Pack.ResourcesSupplier() {
                        @Override
                        public PackResources open(String p_251717_) {
                            return pack;
                        }

                    };

                    Pack.Info packInfoMetadata = Pack.readPackInfo("pack.mcmeta", resourceSupplier);

                    Pack packInfo = Pack.create(
                            "hexdeco:additive",
                            Component.literal("HexDeco"),
                            true,
                            resourceSupplier,
                            packInfoMetadata,
                            PackType.CLIENT_RESOURCES,
                            Pack.Position.TOP, true,
                            PackSource.BUILT_IN
                    );

                    if (packInfo != null) {
                        consumer.accept(packInfo);
                    }
                });
            }
        }
    }
}
