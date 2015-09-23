package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.CheesetouchMain;
import net.minecraft.item.ItemFood;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseSlice extends ItemFood {

    public CheeseSlice() {
        super(5, 1.0F, true);
        this.setUnlocalizedName("cheese_slice");
        this.setCreativeTab(CheesetouchMain.cheeseTab);
        this.setAlwaysEdible();
        this.setPotionEffect(16, 10, 1, 1.0F);
    }

}
