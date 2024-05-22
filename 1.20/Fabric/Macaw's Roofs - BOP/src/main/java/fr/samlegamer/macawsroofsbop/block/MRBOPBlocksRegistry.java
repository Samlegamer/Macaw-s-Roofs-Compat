package fr.samlegamer.macawsroofsbop.block;

import fr.samlegamer.macawsroofsbop.MacawsRoofsBOP;
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

public class MRBOPBlocksRegistry
{
	public static final Block dead_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block dead_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block fir_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block hellbark_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block jacaranda_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block magic_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block mahogany_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block palm_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block redwood_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block umbran_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_attic_roof = new RoofGlass(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_top_roof = new RoofTopNew(AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_lower_roof = new BaseRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_steep_roof = new SteepRoof(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_upper_lower_roof = new Lower(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));

	public static final Block willow_planks_upper_steep_roof = new Steep(Blocks.OAK_PLANKS.getDefaultState(), AbstractBlock.Settings.create().strength(2.0F, 2.3F).sounds(BlockSoundGroup.WOOD));
	
	public static void registry()
	{
		add("dead_roof", dead_roof);
		add("dead_attic_roof", dead_attic_roof);
		add("dead_top_roof", dead_top_roof);
		add("dead_lower_roof", dead_lower_roof);
		add("dead_steep_roof", dead_steep_roof);
		add("dead_upper_lower_roof", dead_upper_lower_roof);
		add("dead_upper_steep_roof", dead_upper_steep_roof);
		add("dead_planks_roof", dead_planks_roof);
		add("dead_planks_attic_roof", dead_planks_attic_roof);
		add("dead_planks_top_roof", dead_planks_top_roof);
		add("dead_planks_lower_roof", dead_planks_lower_roof);
		add("dead_planks_steep_roof", dead_planks_steep_roof);
		add("dead_planks_upper_lower_roof", dead_planks_upper_lower_roof);
		add("dead_planks_upper_steep_roof", dead_planks_upper_steep_roof);
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
		add("hellbark_roof", hellbark_roof);
		add("hellbark_attic_roof", hellbark_attic_roof);
		add("hellbark_top_roof", hellbark_top_roof);
		add("hellbark_lower_roof", hellbark_lower_roof);
		add("hellbark_steep_roof", hellbark_steep_roof);
		add("hellbark_upper_lower_roof", hellbark_upper_lower_roof);
		add("hellbark_upper_steep_roof", hellbark_upper_steep_roof);
		add("hellbark_planks_roof", hellbark_planks_roof);
		add("hellbark_planks_attic_roof", hellbark_planks_attic_roof);
		add("hellbark_planks_top_roof", hellbark_planks_top_roof);
		add("hellbark_planks_lower_roof", hellbark_planks_lower_roof);
		add("hellbark_planks_steep_roof", hellbark_planks_steep_roof);
		add("hellbark_planks_upper_lower_roof", hellbark_planks_upper_lower_roof);
		add("hellbark_planks_upper_steep_roof", hellbark_planks_upper_steep_roof);
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
		add("magic_roof", magic_roof);
		add("magic_attic_roof", magic_attic_roof);
		add("magic_top_roof", magic_top_roof);
		add("magic_lower_roof", magic_lower_roof);
		add("magic_steep_roof", magic_steep_roof);
		add("magic_upper_lower_roof", magic_upper_lower_roof);
		add("magic_upper_steep_roof", magic_upper_steep_roof);
		add("magic_planks_roof", magic_planks_roof);
		add("magic_planks_attic_roof", magic_planks_attic_roof);
		add("magic_planks_top_roof", magic_planks_top_roof);
		add("magic_planks_lower_roof", magic_planks_lower_roof);
		add("magic_planks_steep_roof", magic_planks_steep_roof);
		add("magic_planks_upper_lower_roof", magic_planks_upper_lower_roof);
		add("magic_planks_upper_steep_roof", magic_planks_upper_steep_roof);
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
		add("umbran_roof", umbran_roof);
		add("umbran_attic_roof", umbran_attic_roof);
		add("umbran_top_roof", umbran_top_roof);
		add("umbran_lower_roof", umbran_lower_roof);
		add("umbran_steep_roof", umbran_steep_roof);
		add("umbran_upper_lower_roof", umbran_upper_lower_roof);
		add("umbran_upper_steep_roof", umbran_upper_steep_roof);
		add("umbran_planks_roof", umbran_planks_roof);
		add("umbran_planks_attic_roof", umbran_planks_attic_roof);
		add("umbran_planks_top_roof", umbran_planks_top_roof);
		add("umbran_planks_lower_roof", umbran_planks_lower_roof);
		add("umbran_planks_steep_roof", umbran_planks_steep_roof);
		add("umbran_planks_upper_lower_roof", umbran_planks_upper_lower_roof);
		add("umbran_planks_upper_steep_roof", umbran_planks_upper_steep_roof);
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
	}

	private static void add(String name, Block b)
    {
    	Registry.register(Registries.BLOCK, new Identifier(MacawsRoofsBOP.MODID, name), b);
    	blockItem(b, name);
	}
    
    private static void blockItem(Block b, String n)
    {
        Registry.register(Registries.ITEM, new Identifier(MacawsRoofsBOP.MODID, n), new BlockItem(b, new Item.Settings()));
    }

}