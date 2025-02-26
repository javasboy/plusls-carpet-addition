package com.plusls.carpet.util.dispenser;

import net.minecraft.core.BlockSource;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.item.ItemStack;

public class MyDispenserBehavior implements DispenseItemBehavior {

    private final DispenseItemBehavior oldDispenserBehavior;

    public MyDispenserBehavior(DispenseItemBehavior oldDispenserBehavior) {
        this.oldDispenserBehavior = oldDispenserBehavior;
    }

    @Override
    public ItemStack dispense(BlockSource pointer, ItemStack stack) {
        return oldDispenserBehavior.dispense(pointer, stack);
    }
}
