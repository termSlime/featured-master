
package io.github.zmicro.featuredmaster.world.biome;

import net.minecraft.world.level.levelgen.placement.SurfaceWaterDepthFilter;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.RuleBasedBlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.DiskConfiguration;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.Music;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;

public class FarrierLandBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.75f, 0.9f), Climate.Parameter.span(-0.2f, 0.65f), Climate.Parameter.span(0.3005f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f),
					Climate.Parameter.span(-1f, 1f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.75f, 0.9f), Climate.Parameter.span(-0.2f, 0.65f), Climate.Parameter.span(0.3005f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f),
					Climate.Parameter.span(-1f, 1f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(-6095923).waterFogColor(-11799579).skyColor(7972607).foliageColorOverride(-5318992).grassColorOverride(-5643093)
				.ambientMoodSound(new AmbientMoodSettings(new SoundEvent(new ResourceLocation("ambient.cave")), 6000, 8, 2)).backgroundMusic(new Music(new SoundEvent(new ResourceLocation("music.overworld.swamp")), 12000, 24000, true))
				.ambientParticle(new AmbientParticleSettings(ParticleTypes.ITEM_SLIME, 0.001f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("featuredmaster:tree_farrier_land",
						FeatureUtils.register("featuredmaster:tree_farrier_land", Feature.TREE,
								new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.OAK_LOG.defaultBlockState()), new StraightTrunkPlacer(4, 2, 0), BlockStateProvider.simple(Blocks.OAK_LEAVES.defaultBlockState()),
										new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3), new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build()),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING), BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("featuredmaster:grass_farrier_land", VegetationFeatures.PATCH_GRASS,
				List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("featuredmaster:flower_farrier_land", VegetationFeatures.FLOWER_DEFAULT,
				List.of(CountPlacement.of(5), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("featuredmaster:patch_sugar_cane_farrier_land", VegetationFeatures.PATCH_SUGAR_CANE, List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("featuredmaster:disk_sand_farrier_land",
						FeatureUtils.register("featuredmaster:disk_sand_farrier_land", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.SAND), BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.STONE)), UniformInt.of(2, 6), 2)),
						List.of(CountPlacement.of(3), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("featuredmaster:disk_gravel_farrier_land",
						FeatureUtils.register("featuredmaster:disk_gravel_farrier_land", Feature.DISK,
								new DiskConfiguration(RuleBasedBlockStateProvider.simple(Blocks.GRAVEL), BlockPredicate.matchesBlocks(List.of(Blocks.GRASS_BLOCK, Blocks.STONE)), UniformInt.of(2, 5), 2)),
						List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome())));
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addSwampVegetation(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 8, 2, 6));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 10, 1, 5));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.VILLAGER, 16, 1, 6));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ENDERMAN, 19, 1, 5));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 19, 3, 5));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.MAGMA_CUBE, 20, 2, 6));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.SLIME, 18, 3, 7));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.30000000000000004f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}
}
