package com.brewingcoder.brewteamlib.block;

import com.brewingcoder.brewteamlib.utility.IVariant;
import net.minecraft.block.SlabBlock;

@SuppressWarnings({"unused", "rawtypes"})
public class SlabBlockBase<E extends IVariant> extends SlabBlock implements IBlock<E> {

    public SlabBlockBase(Properties properties){
        super(properties);
    }

    @Override
    public E getVariant() {
        return IVariant.getEmpty();
    }
}
