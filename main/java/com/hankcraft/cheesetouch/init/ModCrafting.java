package com.hankcraft.cheesetouch.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by markchouinard on 9/24/15.
 */
public class ModCrafting {

    public static void init() {

        GameRegistry.addRecipe(new ItemStack(ModBlocks.cheeseBlock), new Object[]{"sss", "sss", "sss", 's', ModItems.cheese_slice});
    }
}
