package net.wolfieboy09.theworldofmagic.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheWorldOfMagic.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CLOUDIUM_BLOCK);
        blockWithItem(ModBlocks.WITHERED_GRASS_BLOCK);
        blockWithItem(ModBlocks.STEAMER);
    }

    private void blockWithItem(@NotNull RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
