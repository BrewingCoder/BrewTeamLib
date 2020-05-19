package com.brewingcoder.brewteamlib.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.Tags;
import org.lwjgl.system.NonnullDefault;

@SuppressWarnings("unused")
public class CropBlockBase extends CropsBlock {
    private final boolean isWild;

    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_7;
    @SuppressWarnings("FieldCanBeLocal")
    private final String name;

    public CropBlockBase(Block.Properties builder, String name, boolean isWild) {
        super(builder);
        this.name = name;
        this.isWild = isWild;
        this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), isWild ? 7 : 0));
    }


    @Override
    @NonnullDefault
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        if (isWild) {
            return state.isIn(Tags.Blocks.DIRT);
        }
        return state.getBlock() instanceof FarmlandBlock;
    }
}
