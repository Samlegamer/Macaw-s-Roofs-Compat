package fr.samlegamer.macawsroofsbyg.block;

import fr.samlegamer.macawsroofsbyg.MacawsRoofsBYG;
import net.kikoz.mcwroofs.objects.roofs.BaseRoof;
import net.kikoz.mcwroofs.objects.roofs.Lower;
import net.kikoz.mcwroofs.objects.roofs.RoofGlass;
import net.kikoz.mcwroofs.objects.roofs.RoofTopNew;
import net.kikoz.mcwroofs.objects.roofs.Steep;
import net.kikoz.mcwroofs.objects.roofs.SteepRoof;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MRBYGBlocksRegistry
{
	private static final AbstractBlock.Settings WOOD_PROPERTIES = AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD);

			public static final Block aspen_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block aspen_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block aspen_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block aspen_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block aspen_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block aspen_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block baobab_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block baobab_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block baobab_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block baobab_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block baobab_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block blue_enchanted_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block blue_enchanted_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block blue_enchanted_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block cika_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block cika_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block cika_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block cika_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cika_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block cypress_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block cypress_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block cypress_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block cypress_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block cypress_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block ebony_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block ebony_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block ebony_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block ebony_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ebony_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block fir_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block fir_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block fir_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block fir_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block fir_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block green_enchanted_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block green_enchanted_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block green_enchanted_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block holly_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block holly_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block holly_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block holly_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block holly_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block ironwood_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block ironwood_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block ironwood_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block ironwood_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block ironwood_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block jacaranda_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block jacaranda_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block jacaranda_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block jacaranda_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block jacaranda_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block mahogany_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block mahogany_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block mahogany_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block mahogany_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block mahogany_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block maple_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block maple_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block maple_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block maple_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block maple_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block palm_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block palm_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block palm_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block palm_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block palm_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block pine_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block pine_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block pine_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block pine_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block pine_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block rainbow_eucalyptus_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block redwood_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block redwood_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block redwood_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block redwood_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block redwood_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block sakura_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block sakura_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block sakura_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block sakura_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block sakura_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block skyris_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block skyris_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block skyris_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block skyris_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block skyris_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block white_mangrove_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block white_mangrove_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block white_mangrove_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block willow_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block willow_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block willow_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block willow_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block willow_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block witch_hazel_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block witch_hazel_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block witch_hazel_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block zelkova_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block zelkova_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block zelkova_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block zelkova_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block zelkova_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block florus_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block florus_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_planks_attic_roof = new RoofGlass(WOOD_PROPERTIES);

			public static final Block florus_planks_top_roof = new RoofTopNew(WOOD_PROPERTIES);

			public static final Block florus_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);

			public static final Block florus_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), WOOD_PROPERTIES);
	
	
	public static void registry()
	{
		add("aspen_roof", aspen_roof);
		add("aspen_attic_roof", aspen_attic_roof);
		add("aspen_top_roof", aspen_top_roof);
		add("aspen_lower_roof", aspen_lower_roof);
		add("aspen_steep_roof", aspen_steep_roof);
		add("aspen_upper_lower_roof", aspen_upper_lower_roof);
		add("aspen_upper_steep_roof", aspen_upper_steep_roof);
		add("aspen_planks_roof", aspen_planks_roof);
		add("aspen_planks_attic_roof", aspen_planks_attic_roof);
		add("aspen_planks_top_roof", aspen_planks_top_roof);
		add("aspen_planks_lower_roof", aspen_planks_lower_roof);
		add("aspen_planks_steep_roof", aspen_planks_steep_roof);
		add("aspen_planks_upper_lower_roof", aspen_planks_upper_lower_roof);
		add("aspen_planks_upper_steep_roof", aspen_planks_upper_steep_roof);
		add("baobab_roof", baobab_roof);
		add("baobab_attic_roof", baobab_attic_roof);
		add("baobab_top_roof", baobab_top_roof);
		add("baobab_lower_roof", baobab_lower_roof);
		add("baobab_steep_roof", baobab_steep_roof);
		add("baobab_upper_lower_roof", baobab_upper_lower_roof);
		add("baobab_upper_steep_roof", baobab_upper_steep_roof);
		add("baobab_planks_roof", baobab_planks_roof);
		add("baobab_planks_attic_roof", baobab_planks_attic_roof);
		add("baobab_planks_top_roof", baobab_planks_top_roof);
		add("baobab_planks_lower_roof", baobab_planks_lower_roof);
		add("baobab_planks_steep_roof", baobab_planks_steep_roof);
		add("baobab_planks_upper_lower_roof", baobab_planks_upper_lower_roof);
		add("baobab_planks_upper_steep_roof", baobab_planks_upper_steep_roof);
		add("blue_enchanted_roof", blue_enchanted_roof);
		add("blue_enchanted_attic_roof", blue_enchanted_attic_roof);
		add("blue_enchanted_top_roof", blue_enchanted_top_roof);
		add("blue_enchanted_lower_roof", blue_enchanted_lower_roof);
		add("blue_enchanted_steep_roof", blue_enchanted_steep_roof);
		add("blue_enchanted_upper_lower_roof", blue_enchanted_upper_lower_roof);
		add("blue_enchanted_upper_steep_roof", blue_enchanted_upper_steep_roof);
		add("blue_enchanted_planks_roof", blue_enchanted_planks_roof);
		add("blue_enchanted_planks_attic_roof", blue_enchanted_planks_attic_roof);
		add("blue_enchanted_planks_top_roof", blue_enchanted_planks_top_roof);
		add("blue_enchanted_planks_lower_roof", blue_enchanted_planks_lower_roof);
		add("blue_enchanted_planks_steep_roof", blue_enchanted_planks_steep_roof);
		add("blue_enchanted_planks_upper_lower_roof", blue_enchanted_planks_upper_lower_roof);
		add("blue_enchanted_planks_upper_steep_roof", blue_enchanted_planks_upper_steep_roof);
		add("cika_roof", cika_roof);
		add("cika_attic_roof", cika_attic_roof);
		add("cika_top_roof", cika_top_roof);
		add("cika_lower_roof", cika_lower_roof);
		add("cika_steep_roof", cika_steep_roof);
		add("cika_upper_lower_roof", cika_upper_lower_roof);
		add("cika_upper_steep_roof", cika_upper_steep_roof);
		add("cika_planks_roof", cika_planks_roof);
		add("cika_planks_attic_roof", cika_planks_attic_roof);
		add("cika_planks_top_roof", cika_planks_top_roof);
		add("cika_planks_lower_roof", cika_planks_lower_roof);
		add("cika_planks_steep_roof", cika_planks_steep_roof);
		add("cika_planks_upper_lower_roof", cika_planks_upper_lower_roof);
		add("cika_planks_upper_steep_roof", cika_planks_upper_steep_roof);
		add("cypress_roof", cypress_roof);
		add("cypress_attic_roof", cypress_attic_roof);
		add("cypress_top_roof", cypress_top_roof);
		add("cypress_lower_roof", cypress_lower_roof);
		add("cypress_steep_roof", cypress_steep_roof);
		add("cypress_upper_lower_roof", cypress_upper_lower_roof);
		add("cypress_upper_steep_roof", cypress_upper_steep_roof);
		add("cypress_planks_roof", cypress_planks_roof);
		add("cypress_planks_attic_roof", cypress_planks_attic_roof);
		add("cypress_planks_top_roof", cypress_planks_top_roof);
		add("cypress_planks_lower_roof", cypress_planks_lower_roof);
		add("cypress_planks_steep_roof", cypress_planks_steep_roof);
		add("cypress_planks_upper_lower_roof", cypress_planks_upper_lower_roof);
		add("cypress_planks_upper_steep_roof", cypress_planks_upper_steep_roof);
		add("ebony_roof", ebony_roof);
		add("ebony_attic_roof", ebony_attic_roof);
		add("ebony_top_roof", ebony_top_roof);
		add("ebony_lower_roof", ebony_lower_roof);
		add("ebony_steep_roof", ebony_steep_roof);
		add("ebony_upper_lower_roof", ebony_upper_lower_roof);
		add("ebony_upper_steep_roof", ebony_upper_steep_roof);
		add("ebony_planks_roof", ebony_planks_roof);
		add("ebony_planks_attic_roof", ebony_planks_attic_roof);
		add("ebony_planks_top_roof", ebony_planks_top_roof);
		add("ebony_planks_lower_roof", ebony_planks_lower_roof);
		add("ebony_planks_steep_roof", ebony_planks_steep_roof);
		add("ebony_planks_upper_lower_roof", ebony_planks_upper_lower_roof);
		add("ebony_planks_upper_steep_roof", ebony_planks_upper_steep_roof);
		add("fir_roof", fir_roof);
		add("fir_attic_roof", fir_attic_roof);
		add("fir_top_roof", fir_top_roof);
		add("fir_lower_roof", fir_lower_roof);
		add("fir_steep_roof", fir_steep_roof);
		add("fir_upper_lower_roof", fir_upper_lower_roof);
		add("fir_upper_steep_roof", fir_upper_steep_roof);
		add("fir_planks_roof", fir_planks_roof);
		add("fir_planks_attic_roof", fir_planks_attic_roof);
		add("fir_planks_top_roof", fir_planks_top_roof);
		add("fir_planks_lower_roof", fir_planks_lower_roof);
		add("fir_planks_steep_roof", fir_planks_steep_roof);
		add("fir_planks_upper_lower_roof", fir_planks_upper_lower_roof);
		add("fir_planks_upper_steep_roof", fir_planks_upper_steep_roof);
		add("green_enchanted_roof", green_enchanted_roof);
		add("green_enchanted_attic_roof", green_enchanted_attic_roof);
		add("green_enchanted_top_roof", green_enchanted_top_roof);
		add("green_enchanted_lower_roof", green_enchanted_lower_roof);
		add("green_enchanted_steep_roof", green_enchanted_steep_roof);
		add("green_enchanted_upper_lower_roof", green_enchanted_upper_lower_roof);
		add("green_enchanted_upper_steep_roof", green_enchanted_upper_steep_roof);
		add("green_enchanted_planks_roof", green_enchanted_planks_roof);
		add("green_enchanted_planks_attic_roof", green_enchanted_planks_attic_roof);
		add("green_enchanted_planks_top_roof", green_enchanted_planks_top_roof);
		add("green_enchanted_planks_lower_roof", green_enchanted_planks_lower_roof);
		add("green_enchanted_planks_steep_roof", green_enchanted_planks_steep_roof);
		add("green_enchanted_planks_upper_lower_roof", green_enchanted_planks_upper_lower_roof);
		add("green_enchanted_planks_upper_steep_roof", green_enchanted_planks_upper_steep_roof);
		add("holly_roof", holly_roof);
		add("holly_attic_roof", holly_attic_roof);
		add("holly_top_roof", holly_top_roof);
		add("holly_lower_roof", holly_lower_roof);
		add("holly_steep_roof", holly_steep_roof);
		add("holly_upper_lower_roof", holly_upper_lower_roof);
		add("holly_upper_steep_roof", holly_upper_steep_roof);
		add("holly_planks_roof", holly_planks_roof);
		add("holly_planks_attic_roof", holly_planks_attic_roof);
		add("holly_planks_top_roof", holly_planks_top_roof);
		add("holly_planks_lower_roof", holly_planks_lower_roof);
		add("holly_planks_steep_roof", holly_planks_steep_roof);
		add("holly_planks_upper_lower_roof", holly_planks_upper_lower_roof);
		add("holly_planks_upper_steep_roof", holly_planks_upper_steep_roof);
		add("ironwood_roof", ironwood_roof);
		add("ironwood_attic_roof", ironwood_attic_roof);
		add("ironwood_top_roof", ironwood_top_roof);
		add("ironwood_lower_roof", ironwood_lower_roof);
		add("ironwood_steep_roof", ironwood_steep_roof);
		add("ironwood_upper_lower_roof", ironwood_upper_lower_roof);
		add("ironwood_upper_steep_roof", ironwood_upper_steep_roof);
		add("ironwood_planks_roof", ironwood_planks_roof);
		add("ironwood_planks_attic_roof", ironwood_planks_attic_roof);
		add("ironwood_planks_top_roof", ironwood_planks_top_roof);
		add("ironwood_planks_lower_roof", ironwood_planks_lower_roof);
		add("ironwood_planks_steep_roof", ironwood_planks_steep_roof);
		add("ironwood_planks_upper_lower_roof", ironwood_planks_upper_lower_roof);
		add("ironwood_planks_upper_steep_roof", ironwood_planks_upper_steep_roof);
		add("jacaranda_roof", jacaranda_roof);
		add("jacaranda_attic_roof", jacaranda_attic_roof);
		add("jacaranda_top_roof", jacaranda_top_roof);
		add("jacaranda_lower_roof", jacaranda_lower_roof);
		add("jacaranda_steep_roof", jacaranda_steep_roof);
		add("jacaranda_upper_lower_roof", jacaranda_upper_lower_roof);
		add("jacaranda_upper_steep_roof", jacaranda_upper_steep_roof);
		add("jacaranda_planks_roof", jacaranda_planks_roof);
		add("jacaranda_planks_attic_roof", jacaranda_planks_attic_roof);
		add("jacaranda_planks_top_roof", jacaranda_planks_top_roof);
		add("jacaranda_planks_lower_roof", jacaranda_planks_lower_roof);
		add("jacaranda_planks_steep_roof", jacaranda_planks_steep_roof);
		add("jacaranda_planks_upper_lower_roof", jacaranda_planks_upper_lower_roof);
		add("jacaranda_planks_upper_steep_roof", jacaranda_planks_upper_steep_roof);
		add("mahogany_roof", mahogany_roof);
		add("mahogany_attic_roof", mahogany_attic_roof);
		add("mahogany_top_roof", mahogany_top_roof);
		add("mahogany_lower_roof", mahogany_lower_roof);
		add("mahogany_steep_roof", mahogany_steep_roof);
		add("mahogany_upper_lower_roof", mahogany_upper_lower_roof);
		add("mahogany_upper_steep_roof", mahogany_upper_steep_roof);
		add("mahogany_planks_roof", mahogany_planks_roof);
		add("mahogany_planks_attic_roof", mahogany_planks_attic_roof);
		add("mahogany_planks_top_roof", mahogany_planks_top_roof);
		add("mahogany_planks_lower_roof", mahogany_planks_lower_roof);
		add("mahogany_planks_steep_roof", mahogany_planks_steep_roof);
		add("mahogany_planks_upper_lower_roof", mahogany_planks_upper_lower_roof);
		add("mahogany_planks_upper_steep_roof", mahogany_planks_upper_steep_roof);
		add("maple_roof", maple_roof);
		add("maple_attic_roof", maple_attic_roof);
		add("maple_top_roof", maple_top_roof);
		add("maple_lower_roof", maple_lower_roof);
		add("maple_steep_roof", maple_steep_roof);
		add("maple_upper_lower_roof", maple_upper_lower_roof);
		add("maple_upper_steep_roof", maple_upper_steep_roof);
		add("maple_planks_roof", maple_planks_roof);
		add("maple_planks_attic_roof", maple_planks_attic_roof);
		add("maple_planks_top_roof", maple_planks_top_roof);
		add("maple_planks_lower_roof", maple_planks_lower_roof);
		add("maple_planks_steep_roof", maple_planks_steep_roof);
		add("maple_planks_upper_lower_roof", maple_planks_upper_lower_roof);
		add("maple_planks_upper_steep_roof", maple_planks_upper_steep_roof);
		add("palm_roof", palm_roof);
		add("palm_attic_roof", palm_attic_roof);
		add("palm_top_roof", palm_top_roof);
		add("palm_lower_roof", palm_lower_roof);
		add("palm_steep_roof", palm_steep_roof);
		add("palm_upper_lower_roof", palm_upper_lower_roof);
		add("palm_upper_steep_roof", palm_upper_steep_roof);
		add("palm_planks_roof", palm_planks_roof);
		add("palm_planks_attic_roof", palm_planks_attic_roof);
		add("palm_planks_top_roof", palm_planks_top_roof);
		add("palm_planks_lower_roof", palm_planks_lower_roof);
		add("palm_planks_steep_roof", palm_planks_steep_roof);
		add("palm_planks_upper_lower_roof", palm_planks_upper_lower_roof);
		add("palm_planks_upper_steep_roof", palm_planks_upper_steep_roof);
		add("pine_roof", pine_roof);
		add("pine_attic_roof", pine_attic_roof);
		add("pine_top_roof", pine_top_roof);
		add("pine_lower_roof", pine_lower_roof);
		add("pine_steep_roof", pine_steep_roof);
		add("pine_upper_lower_roof", pine_upper_lower_roof);
		add("pine_upper_steep_roof", pine_upper_steep_roof);
		add("pine_planks_roof", pine_planks_roof);
		add("pine_planks_attic_roof", pine_planks_attic_roof);
		add("pine_planks_top_roof", pine_planks_top_roof);
		add("pine_planks_lower_roof", pine_planks_lower_roof);
		add("pine_planks_steep_roof", pine_planks_steep_roof);
		add("pine_planks_upper_lower_roof", pine_planks_upper_lower_roof);
		add("pine_planks_upper_steep_roof", pine_planks_upper_steep_roof);
		add("rainbow_eucalyptus_roof", rainbow_eucalyptus_roof);
		add("rainbow_eucalyptus_attic_roof", rainbow_eucalyptus_attic_roof);
		add("rainbow_eucalyptus_top_roof", rainbow_eucalyptus_top_roof);
		add("rainbow_eucalyptus_lower_roof", rainbow_eucalyptus_lower_roof);
		add("rainbow_eucalyptus_steep_roof", rainbow_eucalyptus_steep_roof);
		add("rainbow_eucalyptus_upper_lower_roof", rainbow_eucalyptus_upper_lower_roof);
		add("rainbow_eucalyptus_upper_steep_roof", rainbow_eucalyptus_upper_steep_roof);
		add("rainbow_eucalyptus_planks_roof", rainbow_eucalyptus_planks_roof);
		add("rainbow_eucalyptus_planks_attic_roof", rainbow_eucalyptus_planks_attic_roof);
		add("rainbow_eucalyptus_planks_top_roof", rainbow_eucalyptus_planks_top_roof);
		add("rainbow_eucalyptus_planks_lower_roof", rainbow_eucalyptus_planks_lower_roof);
		add("rainbow_eucalyptus_planks_steep_roof", rainbow_eucalyptus_planks_steep_roof);
		add("rainbow_eucalyptus_planks_upper_lower_roof", rainbow_eucalyptus_planks_upper_lower_roof);
		add("rainbow_eucalyptus_planks_upper_steep_roof", rainbow_eucalyptus_planks_upper_steep_roof);
		add("redwood_roof", redwood_roof);
		add("redwood_attic_roof", redwood_attic_roof);
		add("redwood_top_roof", redwood_top_roof);
		add("redwood_lower_roof", redwood_lower_roof);
		add("redwood_steep_roof", redwood_steep_roof);
		add("redwood_upper_lower_roof", redwood_upper_lower_roof);
		add("redwood_upper_steep_roof", redwood_upper_steep_roof);
		add("redwood_planks_roof", redwood_planks_roof);
		add("redwood_planks_attic_roof", redwood_planks_attic_roof);
		add("redwood_planks_top_roof", redwood_planks_top_roof);
		add("redwood_planks_lower_roof", redwood_planks_lower_roof);
		add("redwood_planks_steep_roof", redwood_planks_steep_roof);
		add("redwood_planks_upper_lower_roof", redwood_planks_upper_lower_roof);
		add("redwood_planks_upper_steep_roof", redwood_planks_upper_steep_roof);
		add("sakura_roof", sakura_roof);
		add("sakura_attic_roof", sakura_attic_roof);
		add("sakura_top_roof", sakura_top_roof);
		add("sakura_lower_roof", sakura_lower_roof);
		add("sakura_steep_roof", sakura_steep_roof);
		add("sakura_upper_lower_roof", sakura_upper_lower_roof);
		add("sakura_upper_steep_roof", sakura_upper_steep_roof);
		add("sakura_planks_roof", sakura_planks_roof);
		add("sakura_planks_attic_roof", sakura_planks_attic_roof);
		add("sakura_planks_top_roof", sakura_planks_top_roof);
		add("sakura_planks_lower_roof", sakura_planks_lower_roof);
		add("sakura_planks_steep_roof", sakura_planks_steep_roof);
		add("sakura_planks_upper_lower_roof", sakura_planks_upper_lower_roof);
		add("sakura_planks_upper_steep_roof", sakura_planks_upper_steep_roof);
		add("skyris_roof", skyris_roof);
		add("skyris_attic_roof", skyris_attic_roof);
		add("skyris_top_roof", skyris_top_roof);
		add("skyris_lower_roof", skyris_lower_roof);
		add("skyris_steep_roof", skyris_steep_roof);
		add("skyris_upper_lower_roof", skyris_upper_lower_roof);
		add("skyris_upper_steep_roof", skyris_upper_steep_roof);
		add("skyris_planks_roof", skyris_planks_roof);
		add("skyris_planks_attic_roof", skyris_planks_attic_roof);
		add("skyris_planks_top_roof", skyris_planks_top_roof);
		add("skyris_planks_lower_roof", skyris_planks_lower_roof);
		add("skyris_planks_steep_roof", skyris_planks_steep_roof);
		add("skyris_planks_upper_lower_roof", skyris_planks_upper_lower_roof);
		add("skyris_planks_upper_steep_roof", skyris_planks_upper_steep_roof);
		add("white_mangrove_roof", white_mangrove_roof);
		add("white_mangrove_attic_roof", white_mangrove_attic_roof);
		add("white_mangrove_top_roof", white_mangrove_top_roof);
		add("white_mangrove_lower_roof", white_mangrove_lower_roof);
		add("white_mangrove_steep_roof", white_mangrove_steep_roof);
		add("white_mangrove_upper_lower_roof", white_mangrove_upper_lower_roof);
		add("white_mangrove_upper_steep_roof", white_mangrove_upper_steep_roof);
		add("white_mangrove_planks_roof", white_mangrove_planks_roof);
		add("white_mangrove_planks_attic_roof", white_mangrove_planks_attic_roof);
		add("white_mangrove_planks_top_roof", white_mangrove_planks_top_roof);
		add("white_mangrove_planks_lower_roof", white_mangrove_planks_lower_roof);
		add("white_mangrove_planks_steep_roof", white_mangrove_planks_steep_roof);
		add("white_mangrove_planks_upper_lower_roof", white_mangrove_planks_upper_lower_roof);
		add("white_mangrove_planks_upper_steep_roof", white_mangrove_planks_upper_steep_roof);
		add("willow_roof", willow_roof);
		add("willow_attic_roof", willow_attic_roof);
		add("willow_top_roof", willow_top_roof);
		add("willow_lower_roof", willow_lower_roof);
		add("willow_steep_roof", willow_steep_roof);
		add("willow_upper_lower_roof", willow_upper_lower_roof);
		add("willow_upper_steep_roof", willow_upper_steep_roof);
		add("willow_planks_roof", willow_planks_roof);
		add("willow_planks_attic_roof", willow_planks_attic_roof);
		add("willow_planks_top_roof", willow_planks_top_roof);
		add("willow_planks_lower_roof", willow_planks_lower_roof);
		add("willow_planks_steep_roof", willow_planks_steep_roof);
		add("willow_planks_upper_lower_roof", willow_planks_upper_lower_roof);
		add("willow_planks_upper_steep_roof", willow_planks_upper_steep_roof);
		add("witch_hazel_roof", witch_hazel_roof);
		add("witch_hazel_attic_roof", witch_hazel_attic_roof);
		add("witch_hazel_top_roof", witch_hazel_top_roof);
		add("witch_hazel_lower_roof", witch_hazel_lower_roof);
		add("witch_hazel_steep_roof", witch_hazel_steep_roof);
		add("witch_hazel_upper_lower_roof", witch_hazel_upper_lower_roof);
		add("witch_hazel_upper_steep_roof", witch_hazel_upper_steep_roof);
		add("witch_hazel_planks_roof", witch_hazel_planks_roof);
		add("witch_hazel_planks_attic_roof", witch_hazel_planks_attic_roof);
		add("witch_hazel_planks_top_roof", witch_hazel_planks_top_roof);
		add("witch_hazel_planks_lower_roof", witch_hazel_planks_lower_roof);
		add("witch_hazel_planks_steep_roof", witch_hazel_planks_steep_roof);
		add("witch_hazel_planks_upper_lower_roof", witch_hazel_planks_upper_lower_roof);
		add("witch_hazel_planks_upper_steep_roof", witch_hazel_planks_upper_steep_roof);
		add("zelkova_roof", zelkova_roof);
		add("zelkova_attic_roof", zelkova_attic_roof);
		add("zelkova_top_roof", zelkova_top_roof);
		add("zelkova_lower_roof", zelkova_lower_roof);
		add("zelkova_steep_roof", zelkova_steep_roof);
		add("zelkova_upper_lower_roof", zelkova_upper_lower_roof);
		add("zelkova_upper_steep_roof", zelkova_upper_steep_roof);
		add("zelkova_planks_roof", zelkova_planks_roof);
		add("zelkova_planks_attic_roof", zelkova_planks_attic_roof);
		add("zelkova_planks_top_roof", zelkova_planks_top_roof);
		add("zelkova_planks_lower_roof", zelkova_planks_lower_roof);
		add("zelkova_planks_steep_roof", zelkova_planks_steep_roof);
		add("zelkova_planks_upper_lower_roof", zelkova_planks_upper_lower_roof);
		add("zelkova_planks_upper_steep_roof", zelkova_planks_upper_steep_roof);
		add("florus_roof", florus_roof);
		add("florus_attic_roof", florus_attic_roof);
		add("florus_top_roof", florus_top_roof);
		add("florus_lower_roof", florus_lower_roof);
		add("florus_steep_roof", florus_steep_roof);
		add("florus_upper_lower_roof", florus_upper_lower_roof);
		add("florus_upper_steep_roof", florus_upper_steep_roof);
		add("florus_planks_roof", florus_planks_roof);
		add("florus_planks_attic_roof", florus_planks_attic_roof);
		add("florus_planks_top_roof", florus_planks_top_roof);
		add("florus_planks_lower_roof", florus_planks_lower_roof);
		add("florus_planks_steep_roof", florus_planks_steep_roof);
		add("florus_planks_upper_lower_roof", florus_planks_upper_lower_roof);
		add("florus_planks_upper_steep_roof", florus_planks_upper_steep_roof);
	}
	
	private static void add(String name, Block b)
    {
    	Registry.register(Registries.BLOCK, new Identifier(MacawsRoofsBYG.MODID, name), b);
    	blockItem(b, name);
	}
    
    private static void blockItem(Block b, String n)
    {
        Registry.register(Registries.ITEM, new Identifier(MacawsRoofsBYG.MODID, n), new BlockItem(b, new Item.Settings()));
    }
}