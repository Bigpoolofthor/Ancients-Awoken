package net.nintenno.awoken;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nintenno.awoken.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.registry.RegistryKeys.ITEM_GROUP;

public class AncientsAwoken implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "awoken";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override

	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();


	}
}