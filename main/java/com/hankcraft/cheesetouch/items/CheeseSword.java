package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseSword extends ItemSword {

    public CheeseSword() {
        super(CheesetouchMain.KRYPTONITE);
        this.setUnlocalizedName("cheese_sword");
        this.setCreativeTab(CheesetouchMain.cheeseTab);
        this.setMaxDamage(0);
    }
}
