package com.hankcraft.cheesetouch.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CheeseBlock extends Block {

        public CheeseBlock(Material material) {
            super(material);
            this.setUnlocalizedName("cheeseBlock");
            this.setCreativeTab(CreativeTabs.tabBlock);
            this.setResistance(5.0F);
            this.setHardness(10.0F);
            this.setLightLevel(1.0F);
        }
}
