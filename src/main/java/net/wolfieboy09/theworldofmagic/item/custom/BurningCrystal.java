package net.wolfieboy09.theworldofmagic.item.custom;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class BurningCrystal extends Item {

    public BurningCrystal(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        if (slotIndex == selectedIndex) {
            player.hurt(player.damageSources().onFire(), 2.5F);
        }
        super.onInventoryTick(stack, level, player, slotIndex, selectedIndex);
    }
}
