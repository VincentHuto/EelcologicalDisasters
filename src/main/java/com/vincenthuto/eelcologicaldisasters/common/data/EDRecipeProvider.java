package com.vincenthuto.eelcologicaldisasters.common.data;

import java.util.function.Consumer;

import com.vincenthuto.eelcologicaldisasters.init.ItemInit;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class EDRecipeProvider extends RecipeProvider {
	public EDRecipeProvider(PackOutput generator, ExistingFileHelper helper) {
		super(generator);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemInit.car_battery.get(), 1).define('C', Items.COPPER_INGOT)
				.define('I', Blocks.DEEPSLATE_TILES).define('W', Items.WATER_BUCKET).define('S', Blocks.SMOOTH_STONE)
				.pattern("CSC").pattern("IWI").pattern("SSS").unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
				.save(consumer);

		SimpleCookingRecipeBuilder.smelting(Ingredient.of(ItemInit.raw_eel.get()), RecipeCategory.MISC,
				ItemInit.cooked_eel.get(), 0.35f, 200).unlockedBy("has_raw_eel", has(ItemInit.raw_eel.get())).save(consumer);

//		SimpleCookingRecipeBuilder
//				.smelting(Ingredient.of(ItemInit.swollen_leech.get()), RecipeCategory.MISC, ItemInit.dried_leech.get(), 1f, 200)
//				.unlockedBy("has_swollen_leech", has(ItemInit.swollen_leech.get())).save(consumer);
//
//		SimpleCookingRecipeBuilder
//				.smelting(Ingredient.of(ItemInit.foul_paste.get()), RecipeCategory.MISC,BlockInit.befouling_ash_trail.get(), 1f, 200)
//				.unlockedBy("has_foul_paste", has(ItemInit.foul_paste.get())).save(consumer);
//
//		SimpleCookingRecipeBuilder
//				.smelting(Ingredient.of(BlockInit.polished_venous_stone_bricks.get()),RecipeCategory.MISC,
//						BlockInit.cracked_polished_venous_stone_bricks.get(), 1f, 200)
//				.unlockedBy("has_polished_venous_stone_bricks", has(BlockInit.polished_venous_stone_bricks.get()))
//				.save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ItemInit.dicentra_sap.get(), 3).requires(BlockInit.bleeding_heart.get())
//				.unlockedBy("has_bleeding_heart", has(BlockInit.bleeding_heart.get())).save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ItemInit.foul_paste.get(), 3).requires(Items.NETHER_WART)
//				.requires(Items.GUNPOWDER).requires(Items.BONE_MEAL)
//				.unlockedBy("has_nether_wart", has(Items.NETHER_WART)).save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ItemInit.hematic_iron_scrap.get(), 4)
//				.requires(BlockInit.hematic_iron_block.get())
//				.unlockedBy("has_hematic_iron_block", has(BlockInit.hematic_iron_block.get())).save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,BlockInit.blood_wood_planks.get(), 4).requires(BlockInit.blood_wood_log.get())
//				.unlockedBy("has_blood_wood_log", has(BlockInit.blood_wood_log.get())).save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,BlockInit.infested_venous_stone.get(), 1)
//				.requires(BlockInit.venous_stone.get()).requires(Items.NETHER_WART).requires(Items.BROWN_MUSHROOM)
//				.requires(Items.BONE_MEAL).requires(Items.RED_MUSHROOM)
//				.unlockedBy("has_nether_wart", has(Items.NETHER_WART)).save(consumer);
//
//		ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,BlockInit.smouldering_ash_trail.get(), 3).requires(Items.BLAZE_POWDER)
//				.requires(Items.GUNPOWDER).requires(Items.BONE_MEAL)
//				.unlockedBy("has_blaze_powder", has(Items.BLAZE_POWDER)).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.chiseled_hematic_iron_block.get(), 4)
//				.define('T', BlockInit.hematic_iron_block.get()).pattern("TT").pattern("TT")
//				.unlockedBy("has_hematic_iron_block", has(BlockInit.hematic_iron_block.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.hematic_iron_block.get(), 4)
//				.define('T', BlockInit.chiseled_hematic_iron_block.get()).pattern("TT").pattern("TT")
//				.unlockedBy("has_chiseled_hematic_iron_block", has(BlockInit.chiseled_hematic_iron_block.get()))
//				.save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ItemInit.hematic_iron_helm.get()).define('R', ItemInit.hematic_iron_scrap.get())
//				.pattern("RRR").pattern("R R")
//				.unlockedBy("has_hematic_iron_scrap", has(ItemInit.hematic_iron_scrap.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ItemInit.hematic_iron_chestplate.get())
//				.define('R', ItemInit.hematic_iron_scrap.get()).pattern("R R").pattern("RRR").pattern("RRR")
//				.unlockedBy("has_hematic_iron_scrap", has(ItemInit.hematic_iron_scrap.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ItemInit.hematic_iron_leggings.get()).define('R', ItemInit.hematic_iron_scrap.get())
//				.pattern("RRR").pattern("R R").pattern("R R")
//				.unlockedBy("has_hematic_iron_scrap", has(ItemInit.hematic_iron_scrap.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ItemInit.hematic_iron_boots.get()).define('R', ItemInit.hematic_iron_scrap.get())
//				.pattern("R R").pattern("R R")
//				.unlockedBy("has_hematic_iron_scrap", has(ItemInit.hematic_iron_scrap.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ItemInit.hematic_iron_sword.get()).define('R', ItemInit.hematic_iron_scrap.get())
//				.define('N', Items.STICK).pattern("R").pattern("R").pattern("N")
//				.unlockedBy("has_hematic_iron_scrap", has(ItemInit.hematic_iron_scrap.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.venous_stone_stairs.get(), 4).define('C', BlockInit.venous_stone.get())
//				.pattern("C  ").pattern("CC ").pattern("CCC")
//				.unlockedBy("has_venous_stone", has(BlockInit.venous_stone.get())).save(consumer);
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone_stairs.get(), 4)
//				.define('C', BlockInit.polished_venous_stone.get()).pattern("C  ").pattern("CC ").pattern("CCC")
//				.unlockedBy("has_polished_venous_stone", has(BlockInit.polished_venous_stone.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone_brick_stairs.get(), 4)
//				.define('C', BlockInit.polished_venous_stone_bricks.get()).pattern("C  ").pattern("CC ").pattern("CCC")
//				.unlockedBy("has_polished_venous_stone_bricks", has(BlockInit.polished_venous_stone_bricks.get()))
//				.save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.venous_stone_slab.get(), 6).define('C', BlockInit.venous_stone.get())
//				.pattern("CCC").unlockedBy("has_venous_stone", has(BlockInit.venous_stone.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone_slab.get(), 6)
//				.define('C', BlockInit.polished_venous_stone.get()).pattern("CCC")
//				.unlockedBy("has_polished_venous_stone", has(BlockInit.polished_venous_stone.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone_brick_slab.get(), 6)
//				.define('C', BlockInit.polished_venous_stone_bricks.get()).pattern("CCC")
//				.unlockedBy("has_polished_venous_stone_bricks", has(BlockInit.polished_venous_stone_bricks.get()))
//				.save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone.get(), 4).define('C', BlockInit.venous_stone.get())
//				.pattern("CC").pattern("CC").unlockedBy("has_venous_stone", has(BlockInit.venous_stone.get()))
//				.save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.chiseled_polished_venous_stone.get(), 1)
//				.define('C', BlockInit.polished_venous_stone_slab.get()).pattern("C").pattern("C")
//				.unlockedBy("has_polished_venous_stone_slab", has(BlockInit.polished_venous_stone_slab.get()))
//				.save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.polished_venous_stone_bricks.get(), 4)
//				.define('C', BlockInit.polished_venous_stone.get()).pattern("CC").pattern("CC")
//				.unlockedBy("has_polished_venous_stone", has(BlockInit.polished_venous_stone.get())).save(consumer);
//
//		ShapedRecipeBuilder.shaped(RecipeCategory.MISC,BlockInit.hematic_iron_pillar.get(), 2)
//				.define('C', BlockInit.hematic_iron_block.get()).pattern("C").pattern("C")
//				.unlockedBy("has_hematic_iron_block", has(BlockInit.hematic_iron_block.get())).save(consumer);

	}

}
