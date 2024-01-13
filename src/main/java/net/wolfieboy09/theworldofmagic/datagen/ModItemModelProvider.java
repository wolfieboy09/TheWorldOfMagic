package net.wolfieboy09.theworldofmagic.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheWorldOfMagic.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CLOUDIUM);
        simpleItem(ModItems.RAW_CLOUDIUM);
        simpleItem(ModItems.BEGINNER_STAFF);
        simpleItem(ModItems.ORANGE);
        simpleItem(ModItems.BURNABLE_CRYSTAL);
        simpleItem(ModItems.RAW_WITHERITE);
        simpleItem(ModItems.WITHERITE_INGOT);
    }

    private void simpleItem(@NotNull RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TheWorldOfMagic.MOD_ID, "item/" + item.getId().getPath()));
    }

}
