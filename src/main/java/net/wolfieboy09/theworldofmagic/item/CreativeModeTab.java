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
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BEGINNER_STAFF.get());

                        pOutput.accept(ModBlocks.WITHERED_GRASS_BLOCK.get());

                        pOutput.accept(ModItems.ORANGE.get());

                        pOutput.accept(ModItems.BURNABLE_CRYSTAL.get());
                        pOutput.accept(ModItems.BURNING_CRYSTAL.get());

                        pOutput.accept(ModItems.RAW_CLOUDIUM.get());
                        pOutput.accept(ModItems.CLOUDIUM.get());
                        pOutput.accept(ModBlocks.CLOUDIUM_BLOCK.get());

                        pOutput.accept(ModBlocks.STEAMER.get());

                        pOutput.accept(ModItems.ORE_DETECTOR.get());
                    }).build());

    public static void register(IEventBus eventBus) { CREATIVE_MODE_TABS.register(eventBus); }
}
