package net.wolfieboy09.theworldofmagic.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.block.custom.Steamer;
import net.wolfieboy09.theworldofmagic.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheWorldOfMagic.MOD_ID);

    public static final RegistryObject<Block> WITHERED_GRASS_BLOCK = registerBlock("withered_grass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRASS_BLOCK).sound(SoundType.SOUL_SAND)));


    public static final RegistryObject<Block> CLOUDIUM_BLOCK = registerBlock("cloudium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> STEAMER = registerBlock("steamer",
            () -> new Steamer(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // IDE said that the "return" statement was never being used, a nd made it a void function
    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
