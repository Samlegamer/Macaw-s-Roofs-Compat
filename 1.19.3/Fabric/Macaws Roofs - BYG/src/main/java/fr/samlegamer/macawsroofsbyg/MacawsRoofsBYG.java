package fr.samlegamer.macawsroofsbyg;

import fr.samlegamer.macawsroofsbyg.block.MRBYGBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MacawsRoofsBYG implements ModInitializer
{
	public static final ItemGroup TAB = FabricItemGroup.builder(new Identifier("tab_mrbyg")).displayName(Text.of("Macaw's Roofs - BYG")).icon(() -> new ItemStack(MRBYGBlocksRegistry.aspen_roof)).build();
	
	@Override
	public void onInitialize()
	{
		MRBYGBlocksRegistry.registry();
		ItemGroupEvents.modifyEntriesEvent(MacawsRoofsBYG.TAB).register(content -> {
			content.add(MRBYGBlocksRegistry.aspen_roof);

			content.add(MRBYGBlocksRegistry.aspen_attic_roof);

			content.add(MRBYGBlocksRegistry.aspen_top_roof);

			content.add(MRBYGBlocksRegistry.aspen_lower_roof);

			content.add(MRBYGBlocksRegistry.aspen_steep_roof);

			content.add(MRBYGBlocksRegistry.aspen_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.aspen_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_top_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.aspen_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.baobab_roof);

			content.add(MRBYGBlocksRegistry.baobab_attic_roof);

			content.add(MRBYGBlocksRegistry.baobab_top_roof);

			content.add(MRBYGBlocksRegistry.baobab_lower_roof);

			content.add(MRBYGBlocksRegistry.baobab_steep_roof);

			content.add(MRBYGBlocksRegistry.baobab_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.baobab_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_top_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.baobab_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_attic_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_top_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_lower_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_steep_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_top_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.blue_enchanted_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cherry_roof);

			content.add(MRBYGBlocksRegistry.cherry_attic_roof);

			content.add(MRBYGBlocksRegistry.cherry_top_roof);

			content.add(MRBYGBlocksRegistry.cherry_lower_roof);

			content.add(MRBYGBlocksRegistry.cherry_steep_roof);

			content.add(MRBYGBlocksRegistry.cherry_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cherry_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_top_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cherry_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cika_roof);

			content.add(MRBYGBlocksRegistry.cika_attic_roof);

			content.add(MRBYGBlocksRegistry.cika_top_roof);

			content.add(MRBYGBlocksRegistry.cika_lower_roof);

			content.add(MRBYGBlocksRegistry.cika_steep_roof);

			content.add(MRBYGBlocksRegistry.cika_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cika_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_top_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cika_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cypress_roof);

			content.add(MRBYGBlocksRegistry.cypress_attic_roof);

			content.add(MRBYGBlocksRegistry.cypress_top_roof);

			content.add(MRBYGBlocksRegistry.cypress_lower_roof);

			content.add(MRBYGBlocksRegistry.cypress_steep_roof);

			content.add(MRBYGBlocksRegistry.cypress_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cypress_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_top_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.cypress_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.ebony_roof);

			content.add(MRBYGBlocksRegistry.ebony_attic_roof);

			content.add(MRBYGBlocksRegistry.ebony_top_roof);

			content.add(MRBYGBlocksRegistry.ebony_lower_roof);

			content.add(MRBYGBlocksRegistry.ebony_steep_roof);

			content.add(MRBYGBlocksRegistry.ebony_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.ebony_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_top_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.ebony_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.ether_roof);

			content.add(MRBYGBlocksRegistry.ether_attic_roof);

			content.add(MRBYGBlocksRegistry.ether_top_roof);

			content.add(MRBYGBlocksRegistry.ether_lower_roof);

			content.add(MRBYGBlocksRegistry.ether_steep_roof);

			content.add(MRBYGBlocksRegistry.ether_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.ether_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_top_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.ether_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.fir_roof);

			content.add(MRBYGBlocksRegistry.fir_attic_roof);

			content.add(MRBYGBlocksRegistry.fir_top_roof);

			content.add(MRBYGBlocksRegistry.fir_lower_roof);

			content.add(MRBYGBlocksRegistry.fir_steep_roof);

			content.add(MRBYGBlocksRegistry.fir_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.fir_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_top_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.fir_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_attic_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_top_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_lower_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_steep_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_top_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.green_enchanted_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.holly_roof);

			content.add(MRBYGBlocksRegistry.holly_attic_roof);

			content.add(MRBYGBlocksRegistry.holly_top_roof);

			content.add(MRBYGBlocksRegistry.holly_lower_roof);

			content.add(MRBYGBlocksRegistry.holly_steep_roof);

			content.add(MRBYGBlocksRegistry.holly_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.holly_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_top_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.holly_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_attic_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_top_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_lower_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_steep_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_top_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.jacaranda_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.lament_roof);

			content.add(MRBYGBlocksRegistry.lament_attic_roof);

			content.add(MRBYGBlocksRegistry.lament_top_roof);

			content.add(MRBYGBlocksRegistry.lament_lower_roof);

			content.add(MRBYGBlocksRegistry.lament_steep_roof);

			content.add(MRBYGBlocksRegistry.lament_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.lament_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_top_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.lament_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.mahogany_roof);

			content.add(MRBYGBlocksRegistry.mahogany_attic_roof);

			content.add(MRBYGBlocksRegistry.mahogany_top_roof);

			content.add(MRBYGBlocksRegistry.mahogany_lower_roof);

			content.add(MRBYGBlocksRegistry.mahogany_steep_roof);

			content.add(MRBYGBlocksRegistry.mahogany_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.mahogany_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_top_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.mahogany_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_attic_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_top_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_lower_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_steep_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_top_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.white_mangrove_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.maple_roof);

			content.add(MRBYGBlocksRegistry.maple_attic_roof);

			content.add(MRBYGBlocksRegistry.maple_top_roof);

			content.add(MRBYGBlocksRegistry.maple_lower_roof);

			content.add(MRBYGBlocksRegistry.maple_steep_roof);

			content.add(MRBYGBlocksRegistry.maple_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.maple_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_top_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.maple_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.nightshade_roof);

			content.add(MRBYGBlocksRegistry.nightshade_attic_roof);

			content.add(MRBYGBlocksRegistry.nightshade_top_roof);

			content.add(MRBYGBlocksRegistry.nightshade_lower_roof);

			content.add(MRBYGBlocksRegistry.nightshade_steep_roof);

			content.add(MRBYGBlocksRegistry.nightshade_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.nightshade_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_top_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.nightshade_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.palm_roof);

			content.add(MRBYGBlocksRegistry.palm_attic_roof);

			content.add(MRBYGBlocksRegistry.palm_top_roof);

			content.add(MRBYGBlocksRegistry.palm_lower_roof);

			content.add(MRBYGBlocksRegistry.palm_steep_roof);

			content.add(MRBYGBlocksRegistry.palm_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.palm_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_top_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.palm_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.pine_roof);

			content.add(MRBYGBlocksRegistry.pine_attic_roof);

			content.add(MRBYGBlocksRegistry.pine_top_roof);

			content.add(MRBYGBlocksRegistry.pine_lower_roof);

			content.add(MRBYGBlocksRegistry.pine_steep_roof);

			content.add(MRBYGBlocksRegistry.pine_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.pine_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_top_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.pine_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_attic_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_top_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_lower_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_steep_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_top_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.rainbow_eucalyptus_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.redwood_roof);

			content.add(MRBYGBlocksRegistry.redwood_attic_roof);

			content.add(MRBYGBlocksRegistry.redwood_top_roof);

			content.add(MRBYGBlocksRegistry.redwood_lower_roof);

			content.add(MRBYGBlocksRegistry.redwood_steep_roof);

			content.add(MRBYGBlocksRegistry.redwood_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.redwood_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_top_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.redwood_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.skyris_roof);

			content.add(MRBYGBlocksRegistry.skyris_attic_roof);

			content.add(MRBYGBlocksRegistry.skyris_top_roof);

			content.add(MRBYGBlocksRegistry.skyris_lower_roof);

			content.add(MRBYGBlocksRegistry.skyris_steep_roof);

			content.add(MRBYGBlocksRegistry.skyris_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.skyris_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_top_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.skyris_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.willow_roof);

			content.add(MRBYGBlocksRegistry.willow_attic_roof);

			content.add(MRBYGBlocksRegistry.willow_top_roof);

			content.add(MRBYGBlocksRegistry.willow_lower_roof);

			content.add(MRBYGBlocksRegistry.willow_steep_roof);

			content.add(MRBYGBlocksRegistry.willow_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.willow_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_top_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.willow_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_attic_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_top_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_lower_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_steep_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_top_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.witch_hazel_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.zelkova_roof);

			content.add(MRBYGBlocksRegistry.zelkova_attic_roof);

			content.add(MRBYGBlocksRegistry.zelkova_top_roof);

			content.add(MRBYGBlocksRegistry.zelkova_lower_roof);

			content.add(MRBYGBlocksRegistry.zelkova_steep_roof);

			content.add(MRBYGBlocksRegistry.zelkova_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.zelkova_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_top_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.zelkova_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.bulbis_roof);

			content.add(MRBYGBlocksRegistry.bulbis_attic_roof);

			content.add(MRBYGBlocksRegistry.bulbis_top_roof);

			content.add(MRBYGBlocksRegistry.bulbis_lower_roof);

			content.add(MRBYGBlocksRegistry.bulbis_steep_roof);

			content.add(MRBYGBlocksRegistry.bulbis_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.bulbis_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_top_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.bulbis_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.imparius_roof);

			content.add(MRBYGBlocksRegistry.imparius_attic_roof);

			content.add(MRBYGBlocksRegistry.imparius_top_roof);

			content.add(MRBYGBlocksRegistry.imparius_lower_roof);

			content.add(MRBYGBlocksRegistry.imparius_steep_roof);

			content.add(MRBYGBlocksRegistry.imparius_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.imparius_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_top_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.imparius_planks_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.sythian_roof);

			content.add(MRBYGBlocksRegistry.sythian_attic_roof);

			content.add(MRBYGBlocksRegistry.sythian_top_roof);

			content.add(MRBYGBlocksRegistry.sythian_lower_roof);

			content.add(MRBYGBlocksRegistry.sythian_steep_roof);

			content.add(MRBYGBlocksRegistry.sythian_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.sythian_upper_steep_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_attic_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_top_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_lower_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_steep_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_upper_lower_roof);

			content.add(MRBYGBlocksRegistry.sythian_planks_upper_steep_roof);

			});
			//Finish
	}
}