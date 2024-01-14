package net.wolfieboy09.theworldofmagic.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import net.wolfieboy09.theworldofmagic.item.custom.BurningCrystal;
import net.wolfieboy09.theworldofmagic.item.custom.FuelItem;
import net.wolfieboy09.theworldofmagic.item.custom.OreDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheWorldOfMagic.MOD_ID);

    public static final RegistryObject<Item> BEGINNER_STAFF = ITEMS.register("beginner_staff",
            () -> new Item(new Item.Properties()
                    .stacksTo(1)
            ));

    public static final RegistryObject<Item> CLOUDIUM = ITEMS.register("cloudium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CLOUDIUM = ITEMS.register("raw_cloudium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_WITHERITE = ITEMS.register("raw_witherite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WITHERITE_INGOT = ITEMS.register("witherite_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties().food(ModFoods.ORANGE)));

    public static final RegistryObject<Item> BURNABLE_CRYSTAL = ITEMS.register("burnable_crystal",
            () -> new FuelItem(new Item.Properties(), 400));

    public static final RegistryObject<Item> BURNING_CRYSTAL = ITEMS.register("burning_crystal",
            () -> new BurningCrystal(new Item.Properties()));





    public static final RegistryObject<Item> ORE_DETECTOR = ITEMS.register("ore_detector",
            () -> new OreDetectorItem(new Item.Properties()
                    .stacksTo(1)
                    .durability(100)
            ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

