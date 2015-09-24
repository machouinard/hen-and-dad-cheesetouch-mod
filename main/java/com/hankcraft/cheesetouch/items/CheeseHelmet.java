package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.item.ItemArmor;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseHelmet extends ItemArmor {

    public CheeseHelmet() {
        super(CheesetouchMain.TITANIUM, 1, 1);
        this.setUnlocalizedName("cheese_helmet");
        this.setCreativeTab(CheesetouchMain.cheeseTab);
    }
}
