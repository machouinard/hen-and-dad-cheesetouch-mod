package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.item.ItemPickaxe;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheesePickaxe extends ItemPickaxe {

    public CheesePickaxe() {
        super(CheesetouchMain.KRYPTONITE);
        this.setUnlocalizedName("cheese_pickaxe");
        this.setCreativeTab(CheesetouchMain.cheeseTab);

    }


}
