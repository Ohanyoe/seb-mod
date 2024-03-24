
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sebmod.entity.SkibiditoiletEntity;
import net.mcreator.sebmod.entity.GaryEntity;
import net.mcreator.sebmod.entity.BatmaneEntity;
import net.mcreator.sebmod.entity.AmongUsEntity;
import net.mcreator.sebmod.SebModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SebModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SebModMod.MODID);
	public static final RegistryObject<EntityType<SkibiditoiletEntity>> SKIBIDITOILET = register("skibiditoilet",
			EntityType.Builder.<SkibiditoiletEntity>of(SkibiditoiletEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkibiditoiletEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AmongUsEntity>> AMONG_US = register("among_us",
			EntityType.Builder.<AmongUsEntity>of(AmongUsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AmongUsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BatmaneEntity>> BATMANE = register("batmane",
			EntityType.Builder.<BatmaneEntity>of(BatmaneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(BatmaneEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GaryEntity>> GARY = register("gary",
			EntityType.Builder.<GaryEntity>of(GaryEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GaryEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkibiditoiletEntity.init();
			AmongUsEntity.init();
			BatmaneEntity.init();
			GaryEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKIBIDITOILET.get(), SkibiditoiletEntity.createAttributes().build());
		event.put(AMONG_US.get(), AmongUsEntity.createAttributes().build());
		event.put(BATMANE.get(), BatmaneEntity.createAttributes().build());
		event.put(GARY.get(), GaryEntity.createAttributes().build());
	}
}
