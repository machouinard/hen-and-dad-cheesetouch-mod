package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.item.ItemArmor;


public class CheeseHelmet extends ItemArmor {

    public CheeseHelmet() {
        super(CheesetouchMain.TITANIUM, 1, 1);
        this.setUnlocalizedName("cheese_helmet");
        this.setCreativeTab(CheesetouchMain.cheeseTab);
    }


}
