package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MacawsRoofNewJsonApi
{
	public static void init(String location)
	{
		//Base
		File folderBlockstates = new File(location + "blockstates/");
		File folderModels = new File(location + "models/");
		File folderBlock = new File(location + "models/block/");
		File folderItem = new File(location + "models/item/");
		
		//models/block/
		File folderAttic = new File(location + "models/block/attic/");
		File folderAwning = new File(location + "models/block/awning/");
		File folderCube = new File(location + "models/block/cube/");
		File foldermiddle_end = new File(location + "models/block/middle_end/");
		File folderGutter = new File(location + "models/block/gutter/");
		File folderLower = new File(location + "models/block/lower/");
		File folderRoof = new File(location + "models/block/roof/");
		File folderSteep = new File(location + "models/block/steep/");
		File folderTop = new File(location + "models/block/top/");

		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderItem.exists() 
		|| !folderAttic.exists() || !folderAwning.exists() || !folderCube.exists() 
		|| !foldermiddle_end.exists() || !folderGutter.exists() || !folderLower.exists() || !folderRoof.exists()
		|| !folderSteep.exists() || !folderTop.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			folderAttic.mkdir();
			folderAwning.mkdir();
			folderCube.mkdir();
			foldermiddle_end.mkdir();
			folderGutter.mkdir();
			folderLower.mkdir();
			folderRoof.mkdir();
			folderSteep.mkdir();
			folderTop.mkdir();
		}
	}
	
	public static class Log_Attic_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=east,open=false\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_closed\", \"y\":270 },\r\n"
							+ "        \"facing=west,open=false\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_closed\", \"y\":90 },\r\n"
							+ "        \"facing=north,open=false\": { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_closed\", \"y\":180},\r\n"
							+ "        \"facing=south,open=false\": { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_closed\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "        \"facing=east,open=true\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_open\", \"y\":270 },\r\n"
							+ "        \"facing=west,open=true\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_open\", \"y\":90 },\r\n"
							+ "        \"facing=north,open=true\": { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_open\", \"y\":180},\r\n"
							+ "        \"facing=south,open=true\": { \"model\": \""+CompatModid+":block/attic/"+material+"_attic_roof_open\", \"y\":0 }\r\n"
							+ "          \r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof_closed = new File(Location + "/models/block/attic/" + material + "_attic_roof_closed" + ".json");
			File roof_open = new File(Location + "/models/block/attic/" + material + "_attic_roof_open" + ".json");
			
			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_open\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"     \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_open.createNewFile();
					System.out.println("Le fichier " + roof_open + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!roof_closed.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_closed);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_closed\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") + "\"      \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_closed.createNewFile();
					System.out.println("Le fichier " + roof_closed + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/attic/"+material+"_attic_roof_closed\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Planks_Attic_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {                                                                        \r\n"
							+ "        \"facing=east,open=false\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_closed\", \"y\":270 },\r\n"
							+ "        \"facing=west,open=false\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_closed\", \"y\":90 },\r\n"
							+ "        \"facing=north,open=false\": { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_closed\", \"y\":180},\r\n"
							+ "        \"facing=south,open=false\": { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_closed\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "        \"facing=east,open=true\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_open\", \"y\":270 },\r\n"
							+ "        \"facing=west,open=true\":  { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_open\", \"y\":90 },\r\n"
							+ "        \"facing=north,open=true\": { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_open\", \"y\":180},\r\n"
							+ "        \"facing=south,open=true\": { \"model\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_open\", \"y\":0 }\r\n"
							+ "          \r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof_open = new File(Location + "/models/block/attic/" + material + "_planks_attic_roof_open" + ".json");
			File roof_closed = new File(Location + "/models/block/attic/" + material + "_planks_attic_roof_closed" + ".json");

			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_open\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"     \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_open.createNewFile();
					System.out.println("Le fichier " + roof_open + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!roof_closed.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_closed);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/attic_roof_closed\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"3\": \"minecraft:block/glass\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"      \r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_closed.createNewFile();
					System.out.println("Le fichier " + roof_closed + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/attic/"+material+"_planks_attic_roof_closed\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Cube_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"variants\":\r\n"
							+ "	{\r\n"
							+ "		\"facing=south\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_cube_roof\",\"y\":270\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=east\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_cube_roof\",\"y\":180\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=west\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_cube_roof\",\"y\":180\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=north\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_cube_roof\",\"y\":270\r\n"
							+ "		}\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/cube/" + material + "_cube_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/cube_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/cube/"+material+"_cube_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Planks_Cube_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"variants\":\r\n"
							+ "	{\r\n"
							+ "		\"facing=south\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_planks_cube_roof\",\"y\":270\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=east\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_planks_cube_roof\",\"y\":180\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=west\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_planks_cube_roof\",\"y\":180\r\n"
							+ "		},\r\n"
							+ "		\r\n"
							+ "		\"facing=north\":\r\n"
							+ "		{\r\n"
							+ "			 \"model\": \""+CompatModid+":block/cube/"+material+"_planks_cube_roof\",\"y\":270\r\n"
							+ "		}\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/cube/" + material + "_planks_cube_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/cube_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/cube/"+material+"_planks_cube_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Log_Lower_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\" },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 180  },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 180  },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\" },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\" },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_outer\", \"x\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_inner\", \"x\": 180, \"y\": 90 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_lower\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Planks_Lower_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\" },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 180  },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 180  },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\" },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\" },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_outer\", \"x\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_inner\", \"x\": 180, \"y\": 90 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_planks_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_planks_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_planks_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + material + "_planks" + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + material + "_planks" + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_planks_lower\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof\" },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_roof_inner\", \"y\": 180, \"uvlock\": false }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/roof/" + material + "_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/roof/" + material + "_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/roof/" + material + "_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"4\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/roof/"+material+"_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Planks_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof\" },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+CompatModid+":block/roof/"+material+"_planks_roof_inner\", \"y\": 180, \"uvlock\": false }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/roof/" + material + "_planks_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/roof/" + material + "_planks_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/roof/" + material + "_planks_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/roof_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"4\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/roof/"+material+"_planks_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Log_Steep_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\" },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\" },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"y\": 180 },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"x\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 180},\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_inner\", \"x\": 180, \"y\": 270 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"3\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}

			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_steep\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Planks_Steep_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\" },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\" },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"y\": 180 },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"x\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 180},\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_inner\", \"x\": 180, \"y\": 270 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_planks_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_planks_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_planks_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"3\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_planks_steep\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class Log_Top_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "  \"multipart\": [\r\n"
							+ "\r\n"
							+ "	{ \r\n"
							+ "	  \"when\": { \"part\": \"pyramid\" },\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_pyramid\"}\r\n"
							+ "	},\r\n"
							+ "\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 180}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 270}\r\n"
							+ "    },	\r\n"
							+ "		\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_three_way_roof\", \"y\": 270} \r\n"
							+ "    },		\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_three_way_roof\", \"y\": 90} \r\n"
							+ "    },	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_three_way_roof\"} \r\n"
							+ "    },	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_three_way_roof\", \"y\": 180} \r\n"
							+ "    },	\r\n"
							+ "\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\", \"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "  	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"east\": \"true\", \"west\": \"true\", \"north\": \"true\", \"south\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_four_way_roof\"}\r\n"
							+ "    },\r\n"
							+ "	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "		\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\", \"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\", \"y\": 180}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\", \"y\": 270}\r\n"
							+ "    },\r\n"
							+ "  	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof_end\"}\r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "  ]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File four_way_roof = new File(Location + "/models/block/top/" + material + "_four_way_roof" + ".json");
			File three_way_roof = new File(Location + "/models/block/top/" + material + "_three_way_roof" + ".json");
			File top_inner = new File(Location + "/models/block/top/" + material + "_top_inner" + ".json");
			File top_outer = new File(Location + "/models/block/top/" + material + "_top_outer" + ".json");
			File top_pyramid = new File(Location + "/models/block/top/" + material + "_top_pyramid" + ".json");
			File top_roof = new File(Location + "/models/block/top/" + material + "_top_roof" + ".json");
			File top_roof_end = new File(Location + "/models/block/top/" + material + "_top_roof_end" + ".json");
			
			if(!top_roof_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof_end);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof_end\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof_end.createNewFile();
					System.out.println("Le fichier " + top_roof_end + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof.createNewFile();
					System.out.println("Le fichier " + top_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_pyramid.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_pyramid);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_pyramid\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_pyramid.createNewFile();
					System.out.println("Le fichier " + top_pyramid + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_outer.createNewFile();
					System.out.println("Le fichier " + top_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_inner.createNewFile();
					System.out.println("Le fichier " + top_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!four_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(four_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/four_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					four_way_roof.createNewFile();
					System.out.println("Le fichier " + four_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!three_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(three_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					three_way_roof.createNewFile();
					System.out.println("Le fichier " + three_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/top/"+material+"_top_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class Planks_Top_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "  \"multipart\": [\r\n"
							+ "\r\n"
							+ "	{ \r\n"
							+ "	  \"when\": { \"part\": \"pyramid\" },\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_pyramid\"}\r\n"
							+ "	},\r\n"
							+ "\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\",\"west\": \"true\",\"east\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\",\"east\": \"true\",\"west\": \"false\",\"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"south\": \"true\",\"east\": \"true\",\"west\": \"false\",\"north\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 180}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"south\": \"true\",\"west\": \"true\",\"east\": \"false\",\"north\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 270}\r\n"
							+ "    },	\r\n"
							+ "		\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"true\",\"south\": \"false\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_three_way_roof\", \"y\": 270} \r\n"
							+ "    },		\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"false\", \"east\": \"true\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_three_way_roof\", \"y\": 90} \r\n"
							+ "    },	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"true\",\"south\": \"true\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_three_way_roof\"} \r\n"
							+ "    },	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"north\": \"true\", \"east\": \"false\",\"south\": \"true\", \"west\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_three_way_roof\", \"y\": 180} \r\n"
							+ "    },	\r\n"
							+ "\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\", \"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "  	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic|end_part\",\"east\": \"true\", \"west\": \"true\", \"north\": \"true\", \"south\": \"true\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_four_way_roof\"}\r\n"
							+ "    },\r\n"
							+ "	\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"basic\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\"}\r\n"
							+ "    },\r\n"
							+ "		\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\", \"north\": \"false\", \"south\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\", \"y\": 180}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"false\",\"north\": \"true\", \"west\": \"false\", \"east\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\"}\r\n"
							+ "    },\r\n"
							+ "    {\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"east\": \"false\",\"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\", \"y\": 270}\r\n"
							+ "    },\r\n"
							+ "  	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"west\": \"false\",\"east\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"east\": \"true\", \"west\": \"true\", \"north\": \"false\", \"south\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\", \"y\": 90}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"true\", \"north\": \"true\", \"east\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\"}\r\n"
							+ "    },\r\n"
							+ "	{\r\n"
							+ "      \"when\": { \"AND\": [  {\"part\": \"end_part\",\"south\": \"false\", \"east\": \"false\", \"north\": \"false\", \"west\": \"false\"} ]},\r\n"
							+ "      \"apply\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof_end\"}\r\n"
							+ "    }\r\n"
							+ "\r\n"
							+ "  ]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File four_way_roof = new File(Location + "/models/block/top/" + material + "_planks_four_way_roof" + ".json");
			File three_way_roof = new File(Location + "/models/block/top/" + material + "_planks_three_way_roof" + ".json");
			File top_inner = new File(Location + "/models/block/top/" + material + "_planks_top_inner" + ".json");
			File top_outer = new File(Location + "/models/block/top/" + material + "_planks_top_outer" + ".json");
			File top_pyramid = new File(Location + "/models/block/top/" + material + "_planks_top_pyramid" + ".json");
			File top_roof = new File(Location + "/models/block/top/" + material + "_planks_top_roof" + ".json");
			File top_roof_end = new File(Location + "/models/block/top/" + material + "_planks_top_roof_end" + ".json");
			
			if(!top_roof_end.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof_end);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof_end\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof_end.createNewFile();
					System.out.println("Le fichier " + top_roof_end + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_roof.createNewFile();
					System.out.println("Le fichier " + top_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_pyramid.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_pyramid);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_pyramid\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_pyramid.createNewFile();
					System.out.println("Le fichier " + top_pyramid + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_outer.createNewFile();
					System.out.println("Le fichier " + top_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!top_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(top_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					top_inner.createNewFile();
					System.out.println("Le fichier " + top_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!four_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(four_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/four_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					four_way_roof.createNewFile();
					System.out.println("Le fichier " + four_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			if(!three_way_roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(three_way_roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					three_way_roof.createNewFile();
					System.out.println("Le fichier " + three_way_roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class UpperLog_Lower_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_upper_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\" },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 180  },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 180  },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\" },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\" },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_outer\", \"x\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_upper_lower_inner\", \"x\": 180, \"y\": 90 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		/*
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
*/
		
		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_upper_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_upper_lower\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class UpperPlanks_Lower_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_upper_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\" },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 180  },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 180  },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\" },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\" },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_outer\", \"x\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower_inner\", \"x\": 180, \"y\": 90 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		/*
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File f1 = new File(Location + "/models/block/lower/" + material + "_planks_lower" + ".json");
			File f2 = new File(Location + "/models/block/lower/" + material + "_planks_lower_inner" + ".json");
			File f3 = new File(Location + "/models/block/lower/" + material + "_planks_lower_outer" + ".json");
			File f4 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower" + ".json");
			File f5 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_inner" + ".json");
			File f6 = new File(Location + "/models/block/lower/" + material + "_planks_upper_lower_outer" + ".json");

			if(!f1.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f1);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/" + material + "_planks" + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/" + material + "_planks" + "\"}}");
					buffer.close();
					writer.close();
					f1.createNewFile();
					System.out.println("Le fichier " + f1 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f2.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f2);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" + "\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f2.createNewFile();
					System.out.println("Le fichier " + f2 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f3.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f3);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f3.createNewFile();
					System.out.println("Le fichier " + f3 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f4.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f4);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f4.createNewFile();
					System.out.println("Le fichier " + f4 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f5.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f5);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_inner\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f5.createNewFile();
					System.out.println("Le fichier " + f5 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!f6.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(f6);
					BufferedWriter buffer = new BufferedWriter(writer);
					buffer.write("{\"parent\": \"mcwroofs:block/parent/xx_upper_lower_outer\",\r\n"
							+ "\"textures\":{\"particle\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\",\r\n"
							+ "\"1_2\": \""+TextureLocationFormodid+"/"+ material + "_planks" +"\"}}");
					buffer.close();
					writer.close();
					f6.createNewFile();
					System.out.println("Le fichier " + f6 + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		*/
		
		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_upper_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_planks_upper_lower\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class UpperLog_Steep_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_upper_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\" },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\" },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"y\": 180 },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"x\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_upper_steep_inner\", \"x\": 180, \"y\": 270 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_upper_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_upper_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_upper_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"3\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_upper_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_upper_steep\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class UpperPlanks_Steep_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_upper_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\" },\r\n"
							+ "        \"facing=west,shape=straight,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\" },\r\n"
							+ "        \"facing=west,shape=inner_right,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,half=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"y\": 180 },\r\n"
							+ "\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"x\": 180 },\r\n"
							+ "        \"facing=west,shape=straight,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=straight,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=outer_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=outer_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=west,shape=outer_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=south,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=north,shape=outer_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_outer\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=west,shape=inner_right,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 270 },\r\n"
							+ "        \"facing=south,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=north,shape=inner_right,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 0 },\r\n"
							+ "        \"facing=west,shape=inner_left,half=top\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 180 },\r\n"
							+ "        \"facing=south,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 90 },\r\n"
							+ "        \"facing=north,shape=inner_left,half=top\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep_inner\", \"x\": 180, \"y\": 270 }\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	
		public static void createModelsBlock(String Location, String TextureLocationFormodid, String material, boolean isStemTexture)
		{
			File roof = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_planks_upper_steep_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof.createNewFile();
					System.out.println("Le fichier " + roof + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"3\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_inner.createNewFile();
					System.out.println("Le fichier " + roof_inner + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			
			if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/xx_upper_steep_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"2\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
							+ "	}\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					roof_outer.createNewFile();
					System.out.println("Le fichier " + roof_outer + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

		public static void createModelsItem(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/models/item/" + material + "_planks_upper_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_planks_upper_steep\"\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + Location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

}