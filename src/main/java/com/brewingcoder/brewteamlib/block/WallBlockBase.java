package com.brewingcoder.brewteamlib.block;

import com.brewingcoder.brewteamlib.utility.IVariant;
import net.minecraft.block.WallBlock;

@SuppressWarnings({"unused", "rawtypes"})
public class WallBlockBase<E extends IVariant> extends WallBlock implements IBlock<E> {

    public WallBlockBase(Properties properties) {
        super(properties);
    }

    @Override
    public E getVariant() {
        return IVariant.getEmpty();
    }
}
