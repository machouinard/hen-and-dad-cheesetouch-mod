package com.hankcraft.cheesetouch.items;

import net.minecraft.item.ItemArmor;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseArmor extends ItemArmor {

    public CheeseArmor( String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {

        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
    }
}
