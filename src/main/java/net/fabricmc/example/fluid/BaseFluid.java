package net.fabricmc.example.fluid;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public abstract class BaseFluid extends FlowableFluid {
    /**
     * @return 给定的流体是否为该流体的实例？
     */
    @Override
    public boolean matchesType(Fluid fluid)
    {
        return fluid == getStill() || fluid == getFlowing();
    }

    /**
     * @return 流体是否可以像无限刷水的方法一样无限生成？
     */
    @Override
    protected boolean isInfinite()
    {
        return false;
    }

    /**
     * 流体流入一个可替换的方块时的行为。
     * 水会掉落方块的战利品表。熔岩会播放“block.lava.extinguish”音效。
     */
    @Override
    protected void beforeBreakingBlock(WorldAccess world, BlockPos pos, BlockState state)
    {
        final BlockEntity blockEntity = state.getBlock().hasBlockEntity() ? world.getBlockEntity(pos) : null;
        Block.dropStacks(state, world, pos, blockEntity);
    }

    /**
     * Lava returns true if its FluidState is above a certain height and the
     * Fluid is Water.
     *
     * @return 给定的流体能否流入它的FluidState？
     */
    @Override
    protected boolean canBeReplacedWith(FluidState fluidState, BlockView blockView, BlockPos blockPos, Fluid fluid, Direction direction)
    {
        return false;
    }

    /**
     * 或许与流入周围附近凹洞的距离检查有关？
     * 水返回4。熔岩在主世界返回2，而在下界返回4。
     */
    @Override
    protected int getFlowSpeed(WorldView worldView)
    {
        return 4;
    }

    /**
     * 返回每次流动一格，其等级减少的数值。水返回1，熔岩在主世界返回2，在下界返回1。
     */
    @Override
    protected int getLevelDecreasePerBlock(WorldView worldView)
    {
        return 1;
    }

    /**
     * 返回每流一格需要花费的时间（按刻计算）。水返回5。熔岩在主世界返回30，在下界返回10。
     */
    @Override
    public int getTickRate(WorldView worldView)
    {
        return 5;
    }

    /**
     * 返回爆炸抗性。水和熔岩都返回100.0F。
     */
    @Override
    protected float getBlastResistance()
    {
        return 100.0F;
    }
}