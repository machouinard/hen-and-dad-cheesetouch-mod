package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.Main;
import com.hankcraft.cheesetouch.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

    public static Item cheese_sword;
    public static Item cheese_nugget;

    public static void init() {
        cheese_sword = new Item().setUnlocalizedName("cheese_sword").setCreativeTab(Main.cheeseTab).setMaxDamage(800);
        cheese_nugget = new Item().setUnlocalizedName("cheese_nugget").setCreativeTab(Main.cheeseTab);

    }

    public static void register() {
        GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_nugget, cheese_nugget.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {

        registerRender( cheese_sword );
        registerRender( cheese_nugget );
    }

    public static void registerRender( Item item ) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
