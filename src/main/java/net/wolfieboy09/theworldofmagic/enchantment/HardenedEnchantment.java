package net.wolfieboy09.theworldofmagic.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.wolfieboy09.theworldofmagic.item.ModItems;
import org.jetbrains.annotations.NotNull;

public class HardenedEnchantment extends Enchantment {
    public HardenedEnchantment(Rarity pRarity, @NotNull EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, EnchantmentCategory.BREAKABLE, pApplicableSlots);
        pCategory.canEnchant(ModItems.BEGINNER_STAFF.get());
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, @NotNull Entity pTarget, int pLevel) {
        if (!pAttacker.level().isClientSide()) {
            ServerLevel world = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();
            if (pLevel == 1) {

            }
        }
    }

    @Override
    public int getMinCost(int pEnchantmentLevel) { return pEnchantmentLevel * 25; }

    @Override
    public int getMaxCost(int pEnchantmentLevel) { return this.getMinCost(pEnchantmentLevel) + 50; }

    @Override
    public boolean isTreasureOnly() { return true; }
}
