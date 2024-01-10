package net.wolfieboy09.theworldofmagic.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import org.jetbrains.annotations.NotNull;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORE_DETECTOR_VALUABLES = tag("ore_detector_valuable");

        private static @NotNull TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TheWorldOfMagic.MOD_ID, name));
        }
    }

    public static class Items {
        private static @NotNull TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TheWorldOfMagic.MOD_ID, name));
        }
    }
}
