package com.brewingcoder.brewteamlib.block;

import com.brewingcoder.brewteamlib.utility.IVariant;
import net.minecraft.block.FenceGateBlock;

@SuppressWarnings({"unused", "rawtypes"})
public class FenceGateBlockBase<E extends IVariant> extends FenceGateBlock implements IBlock<E> {

    public FenceGateBlockBase(Properties properties){
        super(properties);
    }
    @Override
    public E getVariant() {
        return IVariant.getEmpty();
    }
}
