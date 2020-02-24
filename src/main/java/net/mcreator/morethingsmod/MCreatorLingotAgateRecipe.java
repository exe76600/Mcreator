package net.mcreator.morethingsmod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorLingotAgateRecipe extends Elementsmorethingsmod.ModElement {
	public MCreatorLingotAgateRecipe(Elementsmorethingsmod instance) {
		super(instance, 124);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(MCreatorMineraisAgate.block, (int) (1)), new ItemStack(MCreatorLingotAgate.block, (int) (1)), 1F);
	}
}
