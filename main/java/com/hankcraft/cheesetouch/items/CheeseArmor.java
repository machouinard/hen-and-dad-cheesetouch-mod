package com.hankcraft.cheesetouch.items;

import com.hankcraft.cheesetouch.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by markchouinard on 9/23/15.
 */
public class CheeseArmor extends ItemArmor {

    public CheeseArmor( String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {

        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (itemStack.getItem() == ModItems.cheese_helmet) {
            effectPlayer(player, Potion.nightVision, 0);
        }
        if (itemStack.getItem() == ModItems.cheese_chestplate) {
            effectPlayer(player, Potion.digSpeed, 0);
        }
        if (itemStack.getItem() == ModItems.cheese_leggings) {
            effectPlayer(player, Potion.moveSpeed, 0);
        }
        if (itemStack.getItem() == ModItems.cheese_boots) {
            effectPlayer(player, Potion.jump, 1);
        }
    }

    private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
        if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1) {
            player.addPotionEffect(new PotionEffect(potion.id, 159, amplifier, true, true));
        }
    }
}
