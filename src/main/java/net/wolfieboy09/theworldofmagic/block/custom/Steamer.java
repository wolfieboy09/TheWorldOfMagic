package net.wolfieboy09.theworldofmagic.block.custom;



import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public class Steamer extends BaseEntityBlock {
    public static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 12, 16);

    public Steamer(Properties pProperties) {
        super(pProperties);
    }


    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState pState,@NotNull BlockGetter pLevel,@NotNull BlockPos pPos,@NotNull CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public @NotNull RenderShape getRenderShape(@NotNull BlockState pState) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos,@NotNull BlockState blockState) {
        return null;
    }
}
