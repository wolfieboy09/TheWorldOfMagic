package net.wolfieboy09.theworldofmagic;


import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;

@Mod.EventBusSubscriber(modid = TheWorldOfMagic.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    // public static final ForgeConfigSpec.ConfigValue<String> timestamp_format = BUILDER
    //         .comment("Timestamp format for files everytime server is started. Default: yyyy-MM-dd_HH-mm")
    //        .define("TIMESTAMP_FORMAT", "yyyy-MM-dd_HH-mm ");



    static final ForgeConfigSpec SPEC = BUILDER.build();
    // public static String TIMESTAMP_FORMAT;

}
