package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.CheesetouchMain;
import com.hankcraft.cheesetouch.Reference;
import com.hankcraft.cheesetouch.items.CheeseArmor;
import com.hankcraft.cheesetouch.items.CheesePickaxe;
import com.hankcraft.cheesetouch.items.CheeseSlice;
import com.hankcraft.cheesetouch.items.CheeseSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {

    public static Item cheese_sword;
    public static Item cheese_slice;
    public static Item cheese_pickaxe;
    public static Item cheese_helmet;
    public static Item cheese_chestplate;
    public static Item cheese_leggings;
    public static Item cheese_boots;

    public static void init() {
        cheese_sword = new CheeseSword();
        cheese_slice = new CheeseSlice();
        cheese_pickaxe = new CheesePickaxe();
        cheese_helmet = new CheeseArmor("cheese_helmet", CheesetouchMain.TITANIUM, 1, 0).setCreativeTab(CheesetouchMain.cheeseTab);
        cheese_chestplate = new CheeseArmor("cheese_chestplate", CheesetouchMain.TITANIUM, 1, 1).setCreativeTab(CheesetouchMain.cheeseTab);
        cheese_leggings = new CheeseArmor("cheese_leggings", CheesetouchMain.TITANIUM, 2, 2).setCreativeTab(CheesetouchMain.cheeseTab);
        cheese_boots = new CheeseArmor("cheese_boots", CheesetouchMain.TITANIUM, 1, 3).setCreativeTab(CheesetouchMain.cheeseTab);
    }

    public static void register() {
        GameRegistry.registerItem(cheese_sword, cheese_sword.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_slice, cheese_slice.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_pickaxe, cheese_pickaxe.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_helmet, cheese_helmet.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_chestplate, cheese_chestplate.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_leggings, cheese_leggings.getUnlocalizedName().substring(5));
        GameRegistry.registerItem(cheese_boots, cheese_boots.getUnlocalizedName().substring(5));
    }

    public static void registerRenders() {

        registerRender( cheese_sword );
        registerRender( cheese_slice );
        registerRender( cheese_pickaxe );
        registerRender( cheese_helmet );
        registerRender( cheese_chestplate );
        registerRender( cheese_boots );
        registerRender( cheese_leggings );
    }

    public static void registerRender( Item item ) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
