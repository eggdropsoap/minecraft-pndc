package com.pipemaze.eggdropsoap.mod_pndc;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.NAME)
public class Main {
    public static final String MODID = "mod_pndc";
    public static final String VERSION = "0.1";
    public static final String NAME = "Peaceful Nights, Dangerous Caves";

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new MyCheckSpawn());
	}
	
}
