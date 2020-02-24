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
public class MCreatorAgate extends Elementsmorethingsmod.ModElement {
	@GameRegistry.ObjectHolder("morethingsmod:agatehelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("morethingsmod:agatebody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("morethingsmod:agatelegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("morethingsmod:agateboots")
	public static final Item boots = null;

	public MCreatorAgate(Elementsmorethingsmod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AGATE", "morethingsmod:agate_", 27, new int[]{4, 7, 8, 4}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("agatehelmet").setRegistryName("agatehelmet")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("agatebody").setRegistryName("agatebody")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("agatelegs").setRegistryName("agatelegs")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("agateboots").setRegistryName("agateboots")
				.setCreativeTab(MCreatorMoreThingsMod.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("morethingsmod:agatehelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("morethingsmod:agatebody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("morethingsmod:agatelegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("morethingsmod:agateboots", "inventory"));
	}
}
