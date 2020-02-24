package net.mcreator.morethingsmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorLingotRubisRecipe extends Elementsmorethingsmod.ModElement {
	public MCreatorLingotRubisRecipe(Elementsmorethingsmod instance) {
		super(instance, 98);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMineraisRubis.block, (int) (1)), new ItemStack(MCreatorLingotRubis.block, (int) (1)), 1F);
	}
}
