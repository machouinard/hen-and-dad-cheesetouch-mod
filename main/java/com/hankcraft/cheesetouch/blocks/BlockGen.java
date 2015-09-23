package com.hankcraft.cheesetouch.blocks;

import com.hankcraft.cheesetouch.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BlockGen implements IWorldGenerator {

    @Override
    public void generate( Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch( world.provider.getDimensionId())
        {
            case 0:
                generateSurface(world, random, new BlockPos( chunkX * 16, 64, chunkZ * 16 ) );
        }
    }

    private void generateSurface( World world, Random random, BlockPos pos ) {
        addOreSpawn(ModBlocks.cheeseBlock, world, random, pos, 16, 16, random.nextInt(14) + 2, 10, 0, 256, ModBlocks.cheeseBlock);
    }

    private void addOreSpawn(Block block, World world, Random random, BlockPos pos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY, Block generateIn)
    {
        WorldGenMinable mine = new WorldGenMinable(block.getDefaultState(), maxVeinSize);

        for (int i = 0; i < chanceToSpawn; i++)
        {
            int x = pos.getX() + random.nextInt(maxX);
            int y = minY + random.nextInt(maxY - minY);
            int z = pos.getZ() + random.nextInt(maxZ);

            mine.generate(world, random, new BlockPos(x, y, z));
        }
    }
}
