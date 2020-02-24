package net.mcreator.morethingsmod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementsmorethingsmod.ModElement.Tag
public class MCreatorEmeraude extends Elementsmorethingsmod.ModElement {
	@GameRegistry.ObjectHolder("morethingsmod:emeraudehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("morethingsmod:emeraudebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("morethingsmod:emeraudelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("morethingsmod:emeraudeboots")
	public static final Item boots = null;

	public MCreatorEmeraude(Elementsmorethingsmod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("EMERAUDE", "morethingsmod:emerald_", 21, new int[]{2, 5, 7, 2}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 1f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("emeraudehelmet")
				.setRegistryName("emeraudehelmet").setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("emeraudebody")
				.setRegistryName("emeraudebody").setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("emeraudelegs").setRegistryName("emeraudelegs")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("emeraudeboots")
				.setRegistryName("emeraudeboots").setCreativeTab(MCreatorMoreThingsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("morethingsmod:emeraudehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("morethingsmod:emeraudebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("morethingsmod:emeraudelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("morethingsmod:emeraudeboots", "inventory"));
	}
}
