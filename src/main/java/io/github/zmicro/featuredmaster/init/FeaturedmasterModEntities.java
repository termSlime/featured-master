
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.zmicro.featuredmaster.init;

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

import io.github.zmicro.featuredmaster.entity.SlimeEntity;
import io.github.zmicro.featuredmaster.entity.CslimeEntity;
import io.github.zmicro.featuredmaster.FeaturedmasterMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FeaturedmasterModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FeaturedmasterMod.MODID);
	public static final RegistryObject<EntityType<SlimeEntity>> SLIME = register("slime",
			EntityType.Builder.<SlimeEntity>of(SlimeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(41).setUpdateInterval(3).setCustomClientFactory(SlimeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<CslimeEntity>> CSLIME = register("cslime",
			EntityType.Builder.<CslimeEntity>of(CslimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CslimeEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SlimeEntity.init();
			CslimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLIME.get(), SlimeEntity.createAttributes().build());
		event.put(CSLIME.get(), CslimeEntity.createAttributes().build());
	}
}
