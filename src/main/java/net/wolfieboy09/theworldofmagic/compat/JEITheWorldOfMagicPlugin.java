package net.wolfieboy09.theworldofmagic.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.wolfieboy09.theworldofmagic.TheWorldOfMagic;
import org.jetbrains.annotations.NotNull;

@JeiPlugin
public class JEITheWorldOfMagicPlugin implements IModPlugin {


    @Override
    public @NotNull ResourceLocation getPluginUid() {
        return new ResourceLocation(TheWorldOfMagic.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(@NotNull IRecipeCategoryRegistration registration) {
        IModPlugin.super.registerCategories(registration);
    }

    @Override
    public void registerRecipes(@NotNull IRecipeRegistration registration) {
        IModPlugin.super.registerRecipes(registration);
    }

    @Override
    public void registerGuiHandlers(@NotNull IGuiHandlerRegistration registration) {
        IModPlugin.super.registerGuiHandlers(registration);
    }
}

