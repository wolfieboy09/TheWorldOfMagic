package net.wolfieboy09.theworldofmagic;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.wolfieboy09.theworldofmagic.block.ModBlocks;
import net.wolfieboy09.theworldofmagic.item.ModCreativeModeTabs;
import net.wolfieboy09.theworldofmagic.item.ModItems;
import org.slf4j.Logger;

@Mod(TheWorldOfMagic.MOD_ID)
public class TheWorldOfMagic {
    public static final String MOD_ID = "theworldofmagic";
    private static final Logger LOGGER = LogUtils.getLogger();


    public  TheWorldOfMagic() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {}

    // need to redo block category
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BEGINNER_STAFF);
        } else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.WITHERED_GRASS_BLOCK);
            event.accept(ModItems.RAW_CLOUDIUM);
            event.accept(ModItems.CLOUDIUM);
            event.accept(ModBlocks.CLOUDIUM_BLOCK);
        }
    }
}
