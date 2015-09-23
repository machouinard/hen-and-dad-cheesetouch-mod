package com.hankcraft.cheesetouch.init;

import com.hankcraft.cheesetouch.Reference;
import com.hankcraft.cheesetouch.blocks.BlockGen;
import com.hankcraft.cheesetouch.blocks.BlockTest;
import com.hankcraft.cheesetouch.blocks.CheeseBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {

    public static Block cheeseBlock;
    public static  Block test_block;

    public static void init() {
        cheeseBlock = new CheeseBlock(Material.iron);
        test_block = new BlockTest(Material.cloth);
    }

    public static void register() {

        GameRegistry.registerBlock( cheeseBlock, cheeseBlock.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock( test_block, test_block.getUnlocalizedName().substring(5));
        GameRegistry.registerWorldGenerator(new BlockGen(), 5);
    }

    public static void registerRenders() {
        registerRender(cheeseBlock);
        registerRender(test_block);
    }

    public static void registerRender( Block block ) {

        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

        Item t_item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(t_item, 0, new ModelResourceLocation(Reference.MODID + ":" + t_item.getUnlocalizedName().substring(5), "inventory"));
    }
}
