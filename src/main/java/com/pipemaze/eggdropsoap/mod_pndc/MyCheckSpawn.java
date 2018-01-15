package com.pipemaze.eggdropsoap.mod_pndc;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent.CheckSpawn;

public class MyCheckSpawn {

	@SubscribeEvent
	public void spawnfired(CheckSpawn event) {
	   World world = event.world;
//	   String dimension = world.provider.getDimensionName();
//	   int dimensionId = world.getWorldInfo().getVanillaDimension();
	   int dimensionId = world.provider.dimensionId;
	   Entity entity = event.entity;
	   String name = entity.toString();
	   boolean isHostile = IMob.mobSelector.isEntityApplicable(entity);
	   boolean isSlime = entity instanceof EntitySlime;
	   int x = MathHelper.floor_double(event.x);
	   int y = MathHelper.floor_double(event.y);
	   int z = MathHelper.floor_double(event.z);
	   Chunk chunk = world.getChunkFromBlockCoords(x, z);
	   int skyLight = chunk.getSavedLightValue(EnumSkyBlock.Sky, x & 15, y, z & 15);

	   // deny any normally-permitted spawn that is under direct sky
//	   if (dimension.equals("Overworld") && isHostile && world.canBlockSeeTheSky(x, y, z) ) {
	   // deny any normally-permitted spawn that is under or near open sky, unless it's a slime
	   if (dimensionId == 0 && isHostile && !isSlime && skyLight > 7 ) {
//		   System.out.println("Spawn denied: "+dimensionId+" @ ["+x+","+y+","+z+"] sl: "+skyLight+" ("+name+")");
		   event.setResult(Result.DENY);
	   }
//	   else {
////		   System.out.println("Spawn allowed: "+dimension+" @ ["+x+", "+y+", "+z+"] sl: "+skyLight+" ("+name+")");
//		   System.out.println("Dimension name: "+dimension+", ID: "+dimensionId+", ID2: "+dimensionId2);
//	   }
	}
}
