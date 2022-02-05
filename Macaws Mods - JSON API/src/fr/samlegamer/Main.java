package fr.samlegamer;

import java.util.ArrayList;

import fr.samlegamer.cave_and_cliff_part_II.roof.MCRLangGen;  //Cave and Cliff package is for Forge 1.16.5, 1.17.1, 1.18.1 !
import fr.samlegamer.cave_and_cliff_part_II.roof.MCRRecipesGen;
import fr.samlegamer.cave_and_cliff_part_II.roof.MRTagGenerator;
import fr.samlegamer.cave_and_cliff_part_II.roof.MacawsRoofNewJsonApi;

public class Main
{
	public static final String LOCATION = "C://Users/ExampleDude/Documents/MyFolder/";  //Path
	public static final String CompatModid = "macawsroofsbop"; //The modid of compat, No :
	public static final String TextureLocationFormodid = "biomesoplenty:block"; //modid:block (don't change "block")
	public static final String ModidExtended = "biomesoplenty";
	
	public static final String WALL = "";	// !ONLY FOR STONE! this is wall texture in the bridge
	public static final String FLOOR = "";		// !ONLY FOR STONE! this is floor texture in the bridge
	public static final String MATERIAL_NAME = "";
	
	public static final ArrayList<String> MATERIAL = new ArrayList<>();
	public static final ArrayList<String> MAJ_MAT = new ArrayList<>();

	public static final String ClassMod = ""; // Blocks Class Registries (ex : IafBlockRegistry)
	
	public static void main(String[] args)
	{
		MATERIAL.add("cherry");
		MATERIAL.add("dead");
		MATERIAL.add("fir");
		MATERIAL.add("hellbark");
		MATERIAL.add("jacaranda");
		MATERIAL.add("magic");
		MATERIAL.add("mahogany");
		MATERIAL.add("palm");
		MATERIAL.add("redwood");
		MATERIAL.add("umbran");
		MATERIAL.add("willow");
	
		MAJ_MAT.add("Cherry");
		MAJ_MAT.add("Dead");
		MAJ_MAT.add("Fir");
		MAJ_MAT.add("Hellbark");
		MAJ_MAT.add("Jacaranda");
		MAJ_MAT.add("Magic");
		MAJ_MAT.add("Mahogany");
		MAJ_MAT.add("Palm");
		MAJ_MAT.add("Redwood");
		MAJ_MAT.add("Umbran");
		MAJ_MAT.add("Willow");

		MRTagGenerator.AxeDataGen(LOCATION, CompatModid, MATERIAL);
		
		
		MCRRecipesGen.init(LOCATION);
		MacawsRoofNewJsonApi.init(LOCATION);
				
		MCRLangGen.initAllEnglish(LOCATION, CompatModid, MATERIAL, MAJ_MAT, 11);

		for(String i : MATERIAL)
		{
			MacawsRoofNewJsonApi.Log_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);
			
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Attic_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Cube_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Cube_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Cube_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Log_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Log_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Log_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.Planks_Top_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.Planks_Top_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.Planks_Top_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.UpperLog_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.UpperLog_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createBlockstate(LOCATION, CompatModid, i);
			//MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.UpperPlanks_Lower_Roof.createModelsItem(LOCATION, CompatModid, i);

			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createBlockstate(LOCATION, CompatModid, i);
			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createModelsBlock(LOCATION, TextureLocationFormodid, i, false);
			MacawsRoofNewJsonApi.UpperPlanks_Steep_Roof.createModelsItem(LOCATION, CompatModid, i);

			
			MCRRecipesGen.AtticLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);
			
			MCRRecipesGen.AtticPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.AtticPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.CubeLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubeLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.CubePlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.CubePlanks.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.LowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.LowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.LowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.RoofLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.RoofPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.RoofPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.SteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.SteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.SteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.TopLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.TopPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.TopPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperLowerLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.UpperLowerPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperLowerPlanks.recipe(LOCATION, ModidExtended, CompatModid, i);

			MCRRecipesGen.UpperSteepPlanks.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepPlanks.recipe(LOCATION, ModidExtended, CompatModid, i, false);

			MCRRecipesGen.UpperSteepLog.loot_tables(LOCATION, CompatModid, i);
			MCRRecipesGen.UpperSteepLog.recipe(LOCATION, ModidExtended, CompatModid, i, false);
		}
	}
}