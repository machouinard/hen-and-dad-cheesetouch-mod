package com.hankcraft.cheesetouch;

import com.hankcraft.cheesetouch.init.ModBlocks;
import com.hankcraft.cheesetouch.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseTab extends CreativeTabs {

    public CheeseTab(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        ItemStack iStack = new ItemStack(ModBlocks.cheeseBlock);
        return iStack.getItem();
//        return ModItems.cheese_nugget;
    }
}
