package me.skyfox.tutorialmod;

import me.skyfox.tutorialmod.block.ModBlocks;
import me.skyfox.tutorialmod.item.ModItemGroups;
import me.skyfox.tutorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// fuel
		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 600);
	}
}