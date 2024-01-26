package net.wolfieboy09.theworldofmagic.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.block.ModBlocks;


public class CreativeModeTab {
    public static final DeferredRegister<net.minecraft.world.item.CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheWorldOfMagic.MOD_ID);
    public static final RegistryObject<net.minecraft.world.item.CreativeModeTab> THEWORLDOFMAGIC_MAIN_TAB = CREATIVE_MODE_TABS.register("theworldofmagic_main_title_name",
            () -> net.minecraft.world.item.CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BURNABLE_CRYSTAL.get()))
                    .title(Component.translatable("creativetab.theworldofmagic_main_title_name"))
                    .displayItems((pParameters, populate) -> {
                        populate.accept(ModItems.BEGINNER_STAFF.get());

                        populate.accept(ModBlocks.WITHERED_GRASS_BLOCK.get());
                        populate.accept(ModItems.RAW_WITHERITE.get());
                        populate.accept(ModItems.WITHERITE_INGOT.get());


                        populate.accept(ModItems.ORANGE.get());

                        populate.accept(ModItems.BURNABLE_CRYSTAL.get());
                        populate.accept(ModItems.BURNING_CRYSTAL.get());

                        populate.accept(ModItems.RAW_CLOUDIUM.get());
                        populate.accept(ModItems.CLOUDIUM.get());
                        populate.accept(ModBlocks.CLOUDIUM_BLOCK.get());

                        populate.accept(ModBlocks.STEAMER.get());

                        populate.accept(ModItems.ORE_DETECTOR.get());
                    }).build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
