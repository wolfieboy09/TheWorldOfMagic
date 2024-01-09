package net.wolfieboy09.theworldofmagic.block.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AbstractFurnaceBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class Steamer extends AbstractFurnaceBlock {

    protected Steamer(Properties pProperties) { super(pProperties); }

    @Override
    protected void openContainer(@NotNull Level level,@NotNull BlockPos blockPos,@NotNull Player player) {

    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos,@NotNull BlockState blockState) {
        return null;
    }
}
