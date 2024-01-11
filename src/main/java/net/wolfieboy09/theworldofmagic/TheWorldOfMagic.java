package net.wolfieboy09.theworldofmagic;

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
import org.jetbrains.annotations.NotNull;

@Mod(TheWorldOfMagic.MOD_ID)
public class TheWorldOfMagic {
    public static final String MOD_ID = "theworldofmagic";
    // private static final Logger LOGGER = LogUtils.getLogger();


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

    private void addCreative(@NotNull BuildCreativeModeTabContentsEvent  event) {
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BEGINNER_STAFF);
        } else if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.WITHERED_GRASS_BLOCK);
        } else if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.CLOUDIUM_BLOCK.get());
        } else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_CLOUDIUM);
            event.accept(ModItems.CLOUDIUM);
        } else if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.ORANGE);
        }
    }
}
