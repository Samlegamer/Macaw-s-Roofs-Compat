package fr.samlegamer.macawsroofsbyg;

import fr.samlegamer.macawsroofsbyg.block.MRBYGBlocksRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class MRBYGClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				MRBYGBlocksRegistry.aspen_cube_roof, 
				MRBYGBlocksRegistry.aspen_roof, 
				MRBYGBlocksRegistry.aspen_attic_roof, 
				MRBYGBlocksRegistry.aspen_top_roof, 
				MRBYGBlocksRegistry.aspen_lower_roof, 
				MRBYGBlocksRegistry.aspen_steep_roof, 
				MRBYGBlocksRegistry.aspen_upper_lower_roof, 
				MRBYGBlocksRegistry.aspen_upper_steep_roof, 
				MRBYGBlocksRegistry.baobab_cube_roof, 
				MRBYGBlocksRegistry.baobab_roof, 
				MRBYGBlocksRegistry.baobab_attic_roof, 
				MRBYGBlocksRegistry.baobab_top_roof, 
				MRBYGBlocksRegistry.baobab_lower_roof, 
				MRBYGBlocksRegistry.baobab_steep_roof, 
				MRBYGBlocksRegistry.baobab_upper_lower_roof, 
				MRBYGBlocksRegistry.baobab_upper_steep_roof, 
				MRBYGBlocksRegistry.blue_enchanted_cube_roof, 
				MRBYGBlocksRegistry.blue_enchanted_roof, 
				MRBYGBlocksRegistry.blue_enchanted_attic_roof, 
				MRBYGBlocksRegistry.blue_enchanted_top_roof, 
				MRBYGBlocksRegistry.blue_enchanted_lower_roof, 
				MRBYGBlocksRegistry.blue_enchanted_steep_roof, 
				MRBYGBlocksRegistry.blue_enchanted_upper_lower_roof, 
				MRBYGBlocksRegistry.blue_enchanted_upper_steep_roof, 
				MRBYGBlocksRegistry.cherry_cube_roof, 
				MRBYGBlocksRegistry.cherry_roof, 
				MRBYGBlocksRegistry.cherry_attic_roof, 
				MRBYGBlocksRegistry.cherry_top_roof, 
				MRBYGBlocksRegistry.cherry_lower_roof, 
				MRBYGBlocksRegistry.cherry_steep_roof, 
				MRBYGBlocksRegistry.cherry_upper_lower_roof, 
				MRBYGBlocksRegistry.cherry_upper_steep_roof, 
				MRBYGBlocksRegistry.cika_cube_roof, 
				MRBYGBlocksRegistry.cika_roof, 
				MRBYGBlocksRegistry.cika_attic_roof, 
				MRBYGBlocksRegistry.cika_top_roof, 
				MRBYGBlocksRegistry.cika_lower_roof, 
				MRBYGBlocksRegistry.cika_steep_roof, 
				MRBYGBlocksRegistry.cika_upper_lower_roof, 
				MRBYGBlocksRegistry.cika_upper_steep_roof, 
				MRBYGBlocksRegistry.cypress_cube_roof, 
				MRBYGBlocksRegistry.cypress_roof, 
				MRBYGBlocksRegistry.cypress_attic_roof, 
				MRBYGBlocksRegistry.cypress_top_roof, 
				MRBYGBlocksRegistry.cypress_lower_roof, 
				MRBYGBlocksRegistry.cypress_steep_roof, 
				MRBYGBlocksRegistry.cypress_upper_lower_roof, 
				MRBYGBlocksRegistry.cypress_upper_steep_roof, 
				MRBYGBlocksRegistry.ebony_cube_roof, 
				MRBYGBlocksRegistry.ebony_roof, 
				MRBYGBlocksRegistry.ebony_attic_roof, 
				MRBYGBlocksRegistry.ebony_top_roof, 
				MRBYGBlocksRegistry.ebony_lower_roof, 
				MRBYGBlocksRegistry.ebony_steep_roof, 
				MRBYGBlocksRegistry.ebony_upper_lower_roof, 
				MRBYGBlocksRegistry.ebony_upper_steep_roof, 
				MRBYGBlocksRegistry.ether_cube_roof, 
				MRBYGBlocksRegistry.ether_roof, 
				MRBYGBlocksRegistry.ether_attic_roof, 
				MRBYGBlocksRegistry.ether_top_roof, 
				MRBYGBlocksRegistry.ether_lower_roof, 
				MRBYGBlocksRegistry.ether_steep_roof, 
				MRBYGBlocksRegistry.ether_upper_lower_roof, 
				MRBYGBlocksRegistry.ether_upper_steep_roof, 
				MRBYGBlocksRegistry.fir_cube_roof, 
				MRBYGBlocksRegistry.fir_roof, 
				MRBYGBlocksRegistry.fir_attic_roof, 
				MRBYGBlocksRegistry.fir_top_roof, 
				MRBYGBlocksRegistry.fir_lower_roof, 
				MRBYGBlocksRegistry.fir_steep_roof, 
				MRBYGBlocksRegistry.fir_upper_lower_roof, 
				MRBYGBlocksRegistry.fir_upper_steep_roof, 
				MRBYGBlocksRegistry.green_enchanted_cube_roof, 
				MRBYGBlocksRegistry.green_enchanted_roof, 
				MRBYGBlocksRegistry.green_enchanted_attic_roof, 
				MRBYGBlocksRegistry.green_enchanted_top_roof, 
				MRBYGBlocksRegistry.green_enchanted_lower_roof, 
				MRBYGBlocksRegistry.green_enchanted_steep_roof, 
				MRBYGBlocksRegistry.green_enchanted_upper_lower_roof, 
				MRBYGBlocksRegistry.green_enchanted_upper_steep_roof, 
				MRBYGBlocksRegistry.holly_cube_roof, 
				MRBYGBlocksRegistry.holly_roof, 
				MRBYGBlocksRegistry.holly_attic_roof, 
				MRBYGBlocksRegistry.holly_top_roof, 
				MRBYGBlocksRegistry.holly_lower_roof, 
				MRBYGBlocksRegistry.holly_steep_roof, 
				MRBYGBlocksRegistry.holly_upper_lower_roof, 
				MRBYGBlocksRegistry.holly_upper_steep_roof, 
				MRBYGBlocksRegistry.jacaranda_cube_roof, 
				MRBYGBlocksRegistry.jacaranda_roof, 
				MRBYGBlocksRegistry.jacaranda_attic_roof, 
				MRBYGBlocksRegistry.jacaranda_top_roof, 
				MRBYGBlocksRegistry.jacaranda_lower_roof, 
				MRBYGBlocksRegistry.jacaranda_steep_roof, 
				MRBYGBlocksRegistry.jacaranda_upper_lower_roof, 
				MRBYGBlocksRegistry.jacaranda_upper_steep_roof, 
				MRBYGBlocksRegistry.lament_cube_roof, 
				MRBYGBlocksRegistry.lament_roof, 
				MRBYGBlocksRegistry.lament_attic_roof, 
				MRBYGBlocksRegistry.lament_top_roof, 
				MRBYGBlocksRegistry.lament_lower_roof, 
				MRBYGBlocksRegistry.lament_steep_roof, 
				MRBYGBlocksRegistry.lament_upper_lower_roof, 
				MRBYGBlocksRegistry.lament_upper_steep_roof, 
				MRBYGBlocksRegistry.mahogany_cube_roof, 
				MRBYGBlocksRegistry.mahogany_roof, 
				MRBYGBlocksRegistry.mahogany_attic_roof, 
				MRBYGBlocksRegistry.mahogany_top_roof, 
				MRBYGBlocksRegistry.mahogany_lower_roof, 
				MRBYGBlocksRegistry.mahogany_steep_roof, 
				MRBYGBlocksRegistry.mahogany_upper_lower_roof, 
				MRBYGBlocksRegistry.mahogany_upper_steep_roof, 
				MRBYGBlocksRegistry.mangrove_cube_roof, 
				MRBYGBlocksRegistry.mangrove_roof, 
				MRBYGBlocksRegistry.mangrove_attic_roof, 
				MRBYGBlocksRegistry.mangrove_top_roof, 
				MRBYGBlocksRegistry.mangrove_lower_roof, 
				MRBYGBlocksRegistry.mangrove_steep_roof, 
				MRBYGBlocksRegistry.mangrove_upper_lower_roof, 
				MRBYGBlocksRegistry.mangrove_upper_steep_roof, 
				MRBYGBlocksRegistry.maple_cube_roof, 
				MRBYGBlocksRegistry.maple_roof, 
				MRBYGBlocksRegistry.maple_attic_roof, 
				MRBYGBlocksRegistry.maple_top_roof, 
				MRBYGBlocksRegistry.maple_lower_roof, 
				MRBYGBlocksRegistry.maple_steep_roof, 
				MRBYGBlocksRegistry.maple_upper_lower_roof, 
				MRBYGBlocksRegistry.maple_upper_steep_roof, 
				MRBYGBlocksRegistry.nightshade_cube_roof, 
				MRBYGBlocksRegistry.nightshade_roof, 
				MRBYGBlocksRegistry.nightshade_attic_roof, 
				MRBYGBlocksRegistry.nightshade_top_roof, 
				MRBYGBlocksRegistry.nightshade_lower_roof, 
				MRBYGBlocksRegistry.nightshade_steep_roof, 
				MRBYGBlocksRegistry.nightshade_upper_lower_roof, 
				MRBYGBlocksRegistry.nightshade_upper_steep_roof, 
				MRBYGBlocksRegistry.palm_cube_roof, 
				MRBYGBlocksRegistry.palm_roof, 
				MRBYGBlocksRegistry.palm_attic_roof, 
				MRBYGBlocksRegistry.palm_top_roof, 
				MRBYGBlocksRegistry.palm_lower_roof, 
				MRBYGBlocksRegistry.palm_steep_roof, 
				MRBYGBlocksRegistry.palm_upper_lower_roof, 
				MRBYGBlocksRegistry.palm_upper_steep_roof, 
				MRBYGBlocksRegistry.pine_cube_roof, 
				MRBYGBlocksRegistry.pine_roof, 
				MRBYGBlocksRegistry.pine_attic_roof, 
				MRBYGBlocksRegistry.pine_top_roof, 
				MRBYGBlocksRegistry.pine_lower_roof, 
				MRBYGBlocksRegistry.pine_steep_roof, 
				MRBYGBlocksRegistry.pine_upper_lower_roof, 
				MRBYGBlocksRegistry.pine_upper_steep_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_cube_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_attic_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_top_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_lower_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_steep_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_upper_lower_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_upper_steep_roof, 
				MRBYGBlocksRegistry.redwood_cube_roof, 
				MRBYGBlocksRegistry.redwood_roof, 
				MRBYGBlocksRegistry.redwood_attic_roof, 
				MRBYGBlocksRegistry.redwood_top_roof, 
				MRBYGBlocksRegistry.redwood_lower_roof, 
				MRBYGBlocksRegistry.redwood_steep_roof, 
				MRBYGBlocksRegistry.redwood_upper_lower_roof, 
				MRBYGBlocksRegistry.redwood_upper_steep_roof, 
				MRBYGBlocksRegistry.skyris_cube_roof, 
				MRBYGBlocksRegistry.skyris_roof, 
				MRBYGBlocksRegistry.skyris_attic_roof, 
				MRBYGBlocksRegistry.skyris_top_roof, 
				MRBYGBlocksRegistry.skyris_lower_roof, 
				MRBYGBlocksRegistry.skyris_steep_roof, 
				MRBYGBlocksRegistry.skyris_upper_lower_roof, 
				MRBYGBlocksRegistry.skyris_upper_steep_roof, 
				MRBYGBlocksRegistry.willow_cube_roof, 
				MRBYGBlocksRegistry.willow_roof, 
				MRBYGBlocksRegistry.willow_attic_roof, 
				MRBYGBlocksRegistry.willow_top_roof, 
				MRBYGBlocksRegistry.willow_lower_roof, 
				MRBYGBlocksRegistry.willow_steep_roof, 
				MRBYGBlocksRegistry.willow_upper_lower_roof, 
				MRBYGBlocksRegistry.willow_upper_steep_roof, 
				MRBYGBlocksRegistry.witch_hazel_cube_roof, 
				MRBYGBlocksRegistry.witch_hazel_roof, 
				MRBYGBlocksRegistry.witch_hazel_attic_roof, 
				MRBYGBlocksRegistry.witch_hazel_top_roof, 
				MRBYGBlocksRegistry.witch_hazel_lower_roof, 
				MRBYGBlocksRegistry.witch_hazel_steep_roof, 
				MRBYGBlocksRegistry.witch_hazel_upper_lower_roof, 
				MRBYGBlocksRegistry.witch_hazel_upper_steep_roof, 
				MRBYGBlocksRegistry.zelkova_cube_roof, 
				MRBYGBlocksRegistry.zelkova_roof, 
				MRBYGBlocksRegistry.zelkova_attic_roof, 
				MRBYGBlocksRegistry.zelkova_top_roof, 
				MRBYGBlocksRegistry.zelkova_lower_roof, 
				MRBYGBlocksRegistry.zelkova_steep_roof, 
				MRBYGBlocksRegistry.zelkova_upper_lower_roof, 
				MRBYGBlocksRegistry.zelkova_upper_steep_roof, 
				MRBYGBlocksRegistry.bulbis_cube_roof, 
				MRBYGBlocksRegistry.bulbis_roof, 
				MRBYGBlocksRegistry.bulbis_attic_roof, 
				MRBYGBlocksRegistry.bulbis_top_roof, 
				MRBYGBlocksRegistry.bulbis_lower_roof, 
				MRBYGBlocksRegistry.bulbis_steep_roof, 
				MRBYGBlocksRegistry.bulbis_upper_lower_roof, 
				MRBYGBlocksRegistry.bulbis_upper_steep_roof, 
				MRBYGBlocksRegistry.imparius_cube_roof, 
				MRBYGBlocksRegistry.imparius_roof, 
				MRBYGBlocksRegistry.imparius_attic_roof, 
				MRBYGBlocksRegistry.imparius_top_roof, 
				MRBYGBlocksRegistry.imparius_lower_roof, 
				MRBYGBlocksRegistry.imparius_steep_roof, 
				MRBYGBlocksRegistry.imparius_upper_lower_roof, 
				MRBYGBlocksRegistry.imparius_upper_steep_roof, 
				MRBYGBlocksRegistry.sythian_cube_roof, 
				MRBYGBlocksRegistry.sythian_roof, 
				MRBYGBlocksRegistry.sythian_attic_roof, 
				MRBYGBlocksRegistry.sythian_top_roof, 
				MRBYGBlocksRegistry.sythian_lower_roof, 
				MRBYGBlocksRegistry.sythian_steep_roof, 
				MRBYGBlocksRegistry.sythian_upper_lower_roof, 
				MRBYGBlocksRegistry.sythian_upper_steep_roof, 
				MRBYGBlocksRegistry.aspen_planks_cube_roof, 
				MRBYGBlocksRegistry.aspen_planks_roof, 
				MRBYGBlocksRegistry.aspen_planks_attic_roof, 
				MRBYGBlocksRegistry.aspen_planks_top_roof, 
				MRBYGBlocksRegistry.aspen_planks_lower_roof, 
				MRBYGBlocksRegistry.aspen_planks_steep_roof, 
				MRBYGBlocksRegistry.aspen_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.aspen_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.baobab_planks_cube_roof, 
				MRBYGBlocksRegistry.baobab_planks_roof, 
				MRBYGBlocksRegistry.baobab_planks_attic_roof, 
				MRBYGBlocksRegistry.baobab_planks_top_roof, 
				MRBYGBlocksRegistry.baobab_planks_lower_roof, 
				MRBYGBlocksRegistry.baobab_planks_steep_roof, 
				MRBYGBlocksRegistry.baobab_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.baobab_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_cube_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_attic_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_top_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_lower_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_steep_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.blue_enchanted_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.cherry_planks_cube_roof, 
				MRBYGBlocksRegistry.cherry_planks_roof, 
				MRBYGBlocksRegistry.cherry_planks_attic_roof, 
				MRBYGBlocksRegistry.cherry_planks_top_roof, 
				MRBYGBlocksRegistry.cherry_planks_lower_roof, 
				MRBYGBlocksRegistry.cherry_planks_steep_roof, 
				MRBYGBlocksRegistry.cherry_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.cherry_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.cika_planks_cube_roof, 
				MRBYGBlocksRegistry.cika_planks_roof, 
				MRBYGBlocksRegistry.cika_planks_attic_roof, 
				MRBYGBlocksRegistry.cika_planks_top_roof, 
				MRBYGBlocksRegistry.cika_planks_lower_roof, 
				MRBYGBlocksRegistry.cika_planks_steep_roof, 
				MRBYGBlocksRegistry.cika_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.cika_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.cypress_planks_cube_roof, 
				MRBYGBlocksRegistry.cypress_planks_roof, 
				MRBYGBlocksRegistry.cypress_planks_attic_roof, 
				MRBYGBlocksRegistry.cypress_planks_top_roof, 
				MRBYGBlocksRegistry.cypress_planks_lower_roof, 
				MRBYGBlocksRegistry.cypress_planks_steep_roof, 
				MRBYGBlocksRegistry.cypress_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.cypress_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.ebony_planks_cube_roof, 
				MRBYGBlocksRegistry.ebony_planks_roof, 
				MRBYGBlocksRegistry.ebony_planks_attic_roof, 
				MRBYGBlocksRegistry.ebony_planks_top_roof, 
				MRBYGBlocksRegistry.ebony_planks_lower_roof, 
				MRBYGBlocksRegistry.ebony_planks_steep_roof, 
				MRBYGBlocksRegistry.ebony_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.ebony_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.ether_planks_cube_roof, 
				MRBYGBlocksRegistry.ether_planks_roof, 
				MRBYGBlocksRegistry.ether_planks_attic_roof, 
				MRBYGBlocksRegistry.ether_planks_top_roof, 
				MRBYGBlocksRegistry.ether_planks_lower_roof, 
				MRBYGBlocksRegistry.ether_planks_steep_roof, 
				MRBYGBlocksRegistry.ether_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.ether_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.fir_planks_cube_roof, 
				MRBYGBlocksRegistry.fir_planks_roof, 
				MRBYGBlocksRegistry.fir_planks_attic_roof, 
				MRBYGBlocksRegistry.fir_planks_top_roof, 
				MRBYGBlocksRegistry.fir_planks_lower_roof, 
				MRBYGBlocksRegistry.fir_planks_steep_roof, 
				MRBYGBlocksRegistry.fir_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.fir_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_cube_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_attic_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_top_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_lower_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_steep_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.green_enchanted_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.holly_planks_cube_roof, 
				MRBYGBlocksRegistry.holly_planks_roof, 
				MRBYGBlocksRegistry.holly_planks_attic_roof, 
				MRBYGBlocksRegistry.holly_planks_top_roof, 
				MRBYGBlocksRegistry.holly_planks_lower_roof, 
				MRBYGBlocksRegistry.holly_planks_steep_roof, 
				MRBYGBlocksRegistry.holly_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.holly_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_cube_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_attic_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_top_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_lower_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_steep_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.jacaranda_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.lament_planks_cube_roof, 
				MRBYGBlocksRegistry.lament_planks_roof, 
				MRBYGBlocksRegistry.lament_planks_attic_roof, 
				MRBYGBlocksRegistry.lament_planks_top_roof, 
				MRBYGBlocksRegistry.lament_planks_lower_roof, 
				MRBYGBlocksRegistry.lament_planks_steep_roof, 
				MRBYGBlocksRegistry.lament_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.lament_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.mahogany_planks_cube_roof, 
				MRBYGBlocksRegistry.mahogany_planks_roof, 
				MRBYGBlocksRegistry.mahogany_planks_attic_roof, 
				MRBYGBlocksRegistry.mahogany_planks_top_roof, 
				MRBYGBlocksRegistry.mahogany_planks_lower_roof, 
				MRBYGBlocksRegistry.mahogany_planks_steep_roof, 
				MRBYGBlocksRegistry.mahogany_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.mahogany_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.mangrove_planks_cube_roof, 
				MRBYGBlocksRegistry.mangrove_planks_roof, 
				MRBYGBlocksRegistry.mangrove_planks_attic_roof, 
				MRBYGBlocksRegistry.mangrove_planks_top_roof, 
				MRBYGBlocksRegistry.mangrove_planks_lower_roof, 
				MRBYGBlocksRegistry.mangrove_planks_steep_roof, 
				MRBYGBlocksRegistry.mangrove_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.mangrove_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.maple_planks_cube_roof, 
				MRBYGBlocksRegistry.maple_planks_roof, 
				MRBYGBlocksRegistry.maple_planks_attic_roof, 
				MRBYGBlocksRegistry.maple_planks_top_roof, 
				MRBYGBlocksRegistry.maple_planks_lower_roof, 
				MRBYGBlocksRegistry.maple_planks_steep_roof, 
				MRBYGBlocksRegistry.maple_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.maple_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.nightshade_planks_cube_roof, 
				MRBYGBlocksRegistry.nightshade_planks_roof, 
				MRBYGBlocksRegistry.nightshade_planks_attic_roof, 
				MRBYGBlocksRegistry.nightshade_planks_top_roof, 
				MRBYGBlocksRegistry.nightshade_planks_lower_roof, 
				MRBYGBlocksRegistry.nightshade_planks_steep_roof, 
				MRBYGBlocksRegistry.nightshade_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.nightshade_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.palm_planks_cube_roof, 
				MRBYGBlocksRegistry.palm_planks_roof, 
				MRBYGBlocksRegistry.palm_planks_attic_roof, 
				MRBYGBlocksRegistry.palm_planks_top_roof, 
				MRBYGBlocksRegistry.palm_planks_lower_roof, 
				MRBYGBlocksRegistry.palm_planks_steep_roof, 
				MRBYGBlocksRegistry.palm_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.palm_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.pine_planks_cube_roof, 
				MRBYGBlocksRegistry.pine_planks_roof, 
				MRBYGBlocksRegistry.pine_planks_attic_roof, 
				MRBYGBlocksRegistry.pine_planks_top_roof, 
				MRBYGBlocksRegistry.pine_planks_lower_roof, 
				MRBYGBlocksRegistry.pine_planks_steep_roof, 
				MRBYGBlocksRegistry.pine_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.pine_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_cube_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_attic_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_top_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_lower_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_steep_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.redwood_planks_cube_roof, 
				MRBYGBlocksRegistry.redwood_planks_roof, 
				MRBYGBlocksRegistry.redwood_planks_attic_roof, 
				MRBYGBlocksRegistry.redwood_planks_top_roof, 
				MRBYGBlocksRegistry.redwood_planks_lower_roof, 
				MRBYGBlocksRegistry.redwood_planks_steep_roof, 
				MRBYGBlocksRegistry.redwood_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.redwood_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.skyris_planks_cube_roof, 
				MRBYGBlocksRegistry.skyris_planks_roof, 
				MRBYGBlocksRegistry.skyris_planks_attic_roof, 
				MRBYGBlocksRegistry.skyris_planks_top_roof, 
				MRBYGBlocksRegistry.skyris_planks_lower_roof, 
				MRBYGBlocksRegistry.skyris_planks_steep_roof, 
				MRBYGBlocksRegistry.skyris_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.skyris_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.willow_planks_cube_roof, 
				MRBYGBlocksRegistry.willow_planks_roof, 
				MRBYGBlocksRegistry.willow_planks_attic_roof, 
				MRBYGBlocksRegistry.willow_planks_top_roof, 
				MRBYGBlocksRegistry.willow_planks_lower_roof, 
				MRBYGBlocksRegistry.willow_planks_steep_roof, 
				MRBYGBlocksRegistry.willow_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.willow_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_cube_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_attic_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_top_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_lower_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_steep_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.witch_hazel_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.zelkova_planks_cube_roof, 
				MRBYGBlocksRegistry.zelkova_planks_roof, 
				MRBYGBlocksRegistry.zelkova_planks_attic_roof, 
				MRBYGBlocksRegistry.zelkova_planks_top_roof, 
				MRBYGBlocksRegistry.zelkova_planks_lower_roof, 
				MRBYGBlocksRegistry.zelkova_planks_steep_roof, 
				MRBYGBlocksRegistry.zelkova_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.zelkova_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.bulbis_planks_cube_roof, 
				MRBYGBlocksRegistry.bulbis_planks_roof, 
				MRBYGBlocksRegistry.bulbis_planks_attic_roof, 
				MRBYGBlocksRegistry.bulbis_planks_top_roof, 
				MRBYGBlocksRegistry.bulbis_planks_lower_roof, 
				MRBYGBlocksRegistry.bulbis_planks_steep_roof, 
				MRBYGBlocksRegistry.bulbis_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.bulbis_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.imparius_planks_cube_roof, 
				MRBYGBlocksRegistry.imparius_planks_roof, 
				MRBYGBlocksRegistry.imparius_planks_attic_roof, 
				MRBYGBlocksRegistry.imparius_planks_top_roof, 
				MRBYGBlocksRegistry.imparius_planks_lower_roof, 
				MRBYGBlocksRegistry.imparius_planks_steep_roof, 
				MRBYGBlocksRegistry.imparius_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.imparius_planks_upper_steep_roof, 
				MRBYGBlocksRegistry.sythian_planks_cube_roof, 
				MRBYGBlocksRegistry.sythian_planks_roof, 
				MRBYGBlocksRegistry.sythian_planks_attic_roof, 
				MRBYGBlocksRegistry.sythian_planks_top_roof, 
				MRBYGBlocksRegistry.sythian_planks_lower_roof, 
				MRBYGBlocksRegistry.sythian_planks_steep_roof, 
				MRBYGBlocksRegistry.sythian_planks_upper_lower_roof, 
				MRBYGBlocksRegistry.sythian_planks_upper_steep_roof);
	}
}