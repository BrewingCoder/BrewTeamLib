package com.brewingcoder.brewteamlib.block;

import com.brewingcoder.brewteamlib.utility.IVariant;
import net.minecraft.block.Block;

public class DecoBlockBase<E extends IVariant> extends Block implements IBlock<E> {

    public DecoBlockBase(Properties properties) {
        super(properties);
    }

    @Override
    public E getVariant() {
        return IVariant.getEmpty();
    }

}
