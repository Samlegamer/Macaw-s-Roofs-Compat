package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MacawsRoofs
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
		File folderFour_way = new File(location + "models/block/four_way/");
		File folderGlass_roof = new File(location + "models/block/glass_roof/");
		File folderGutter = new File(location + "models/block/gutter/");
		File folderLower = new File(location + "models/block/lower/");
		File folderRoof = new File(location + "models/block/roof/");
		File folderSteep = new File(location + "models/block/steep/");
		File folderThree_way = new File(location + "models/block/three_way/");
		File folderTop = new File(location + "models/block/top/");

		if(!folderBlockstates.exists() || !folderModels.exists() || !folderBlock.exists() || !folderItem.exists() 
		|| !folderAttic.exists() || !folderAwning.exists() || !folderCube.exists() || !folderFour_way.exists()
		|| !folderGlass_roof.exists() || !folderGutter.exists() || !folderLower.exists() || !folderRoof.exists()
		|| !folderSteep.exists() || !folderThree_way.exists() || !folderTop.exists())
		{
			folderBlockstates.mkdir();
			folderModels.mkdir();
			folderBlock.mkdir();
			folderItem.mkdir();
			folderAttic.mkdir();
			folderAwning.mkdir();
			folderCube.mkdir();
			folderFour_way.mkdir();
			folderGlass_roof.mkdir();
			folderGutter.mkdir();
			folderLower.mkdir();
			folderRoof.mkdir();
			folderSteep.mkdir();
			folderThree_way.mkdir();
			folderTop.mkdir();
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
			else if(!roof_inner.exists())
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
			else if(!roof_outer.exists())
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

	public static class Log_Four_Way_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=west\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_four_way_roof\", \"y\": 90  },\r\n"
							+ "        \"facing=north\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_four_way_roof\", \"y\": 180 },\r\n"
							+ "        \"facing=east\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_four_way_roof\", \"y\": 270 },\r\n"
							+ "        \"facing=south\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_four_way_roof\"  }\r\n"
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
			File roof = new File(Location + "/models/block/four_way/" + material + "_four_way_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
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
			File file = new File(Location + "/models/item/" + material + "_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/four_way/"+material+"_four_way_roof\"\r\n"
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

	public static class Planks_Four_Way_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "        \"facing=west\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_planks_four_way_roof\", \"y\": 90  },\r\n"
							+ "        \"facing=north\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_planks_four_way_roof\", \"y\": 180 },\r\n"
							+ "        \"facing=east\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_planks_four_way_roof\", \"y\": 270 },\r\n"
							+ "        \"facing=south\": { \"model\": \""+CompatModid+":block/four_way/"+material+"_planks_four_way_roof\"  }\r\n"
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
			File roof = new File(Location + "/models/block/four_way/" + material + "_planks_four_way_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/four_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
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
			File file = new File(Location + "/models/item/" + material + "_planks_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/four_way/"+material+"_planks_four_way_roof\"\r\n"
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
							+ "    \"facing=east,part=bottom\":  { \"model\": \"mcwroofs:block/empty\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=bottom\":  { \"model\": \"mcwroofs:block/empty\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=bottom\": { \"model\": \"mcwroofs:block/empty\", \"y\":180},\r\n"
							+ "    \"facing=south,part=bottom\": { \"model\": \"mcwroofs:block/empty\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "    \"facing=east,part=bottom_right\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_roof\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=bottom_right\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_roof\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=bottom_right\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_roof\", \"y\":180},\r\n"
							+ "    \"facing=south,part=bottom_right\": { \"model\": \""+CompatModid+":block/lower/"+material+"_lower_roof\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "	\"facing=east,part=top\":  { \"model\": \"mcwroofs:block/empty\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=top\":  { \"model\": \"mcwroofs:block/empty\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=top\": { \"model\": \"mcwroofs:block/empty\", \"y\":180},\r\n"
							+ "    \"facing=south,part=top\": { \"model\": \"mcwroofs:block/empty\", \"y\":0 }\r\n"
							+ "		\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
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
			File roof_open = new File(Location + "/models/block/lower/" + material + "_lower_roof" + ".json");
			
			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/lower_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"      \r\n"
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
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_lower_roof\"\r\n"
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
							+ "    \"facing=east,part=bottom\":  { \"model\": \"mcwroofs:block/empty\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=bottom\":  { \"model\": \"mcwroofs:block/empty\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=bottom\": { \"model\": \"mcwroofs:block/empty\", \"y\":180},\r\n"
							+ "    \"facing=south,part=bottom\": { \"model\": \"mcwroofs:block/empty\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "    \"facing=east,part=bottom_right\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_roof\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=bottom_right\":  { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_roof\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=bottom_right\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_roof\", \"y\":180},\r\n"
							+ "    \"facing=south,part=bottom_right\": { \"model\": \""+CompatModid+":block/lower/"+material+"_planks_lower_roof\", \"y\":0 },\r\n"
							+ "\r\n"
							+ "	\"facing=east,part=top\":  { \"model\": \"mcwroofs:block/empty\", \"y\":270 },\r\n"
							+ "    \"facing=west,part=top\":  { \"model\": \"mcwroofs:block/empty\", \"y\":90 },\r\n"
							+ "    \"facing=north,part=top\": { \"model\": \"mcwroofs:block/empty\", \"y\":180},\r\n"
							+ "    \"facing=south,part=top\": { \"model\": \"mcwroofs:block/empty\", \"y\":0 }\r\n"
							+ "		\r\n"
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
			File roof_open = new File(Location + "/models/block/lower/" + material + "_planks_lower_roof" + ".json");
			
			if(!roof_open.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_open);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/lower_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+material+"_planks\"      \r\n"
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
							+ "    \"parent\": \""+CompatModid+":block/lower/"+material+"_planks_lower_roof\"\r\n"
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
							+ "        \"facing=east,shape=straight,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof\" },\r\n"
							+ "        \"facing=west,shape=straight,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_steep_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=straight,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=straight,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=straight,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=straight,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "		\r\n"
							+ "				\r\n"
							+ "		\"facing=east,shape=straight,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=straight,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=straight,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=straight,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=outer_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" }\r\n"
							+ "        \r\n"
							+ "        \r\n"
							+ "        \r\n"
							+ "        \r\n"
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
			File roof = new File(Location + "/models/block/steep/" + material + "_steep_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_steep_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_steep_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof\",\r\n"
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
			else if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof_inner\",\r\n"
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
			else if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof_outer\",\r\n"
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
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_steep_roof\"\r\n"
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
							+ "        \"facing=east,shape=straight,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof\" },\r\n"
							+ "        \"facing=west,shape=straight,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left,part=bottom\":  { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=bottom\": { \"model\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=straight,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=straight,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=straight,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=straight,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_right,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_right,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_left,part=top\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=top\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "		\r\n"
							+ "				\r\n"
							+ "		\"facing=east,shape=straight,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=straight,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=straight,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=straight,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "\r\n"
							+ "        \"facing=east,shape=outer_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=outer_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=outer_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=outer_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_right,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_right,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=west,shape=inner_left,part=bottom_right\":  { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=south,shape=inner_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" },\r\n"
							+ "        \"facing=north,shape=inner_left,part=bottom_right\": { \"model\": \"mcwroofs:block/empty\" }\r\n"
							+ "        \r\n"
							+ "        \r\n"
							+ "        \r\n"
							+ "        \r\n"
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
			File roof = new File(Location + "/models/block/steep/" + material + "_planks_steep_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/steep/" + material + "_planks_steep_roof_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/steep/" + material + "_planks_steep_roof_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof\",\r\n"
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
			else if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof_inner\",\r\n"
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
			else if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/steep_roof_outer\",\r\n"
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
							+ "    \"parent\": \""+CompatModid+":block/steep/"+material+"_planks_steep_roof\"\r\n"
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

	public static class Log_Three_Way_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "    \"facing=east\":  { \"model\": \""+CompatModid+":block/three_way/"+material+"_three_way_roof\", \"y\":270 },\r\n"
							+ "    \"facing=west\":  { \"model\": \""+CompatModid+":block/three_way/"+material+"_three_way_roof\", \"y\":90 },\r\n"
							+ "    \"facing=north\": { \"model\": \""+CompatModid+":block/three_way/"+material+"_three_way_roof\", \"y\":180},\r\n"
							+ "    \"facing=south\": { \"model\": \""+CompatModid+":block/three_way/"+material+"_three_way_roof\", \"y\":0 }    \r\n"
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
			File roof = new File(Location + "/models/block/three_way/" + material + "_three_way_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
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
			File file = new File(Location + "/models/item/" + material + "_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/three_way/"+material+"_three_way_roof\"\r\n"
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
	
	public static class Planks_Three_Way_Roof
	{
		public static void createBlockstate(String Location, String CompatModid, String material)
		{
			File file = new File(Location + "/blockstates/" + material + "_planks_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"variants\": {\r\n"
							+ "    \"facing=east\":  { \"model\": \""+CompatModid+":block/three_way/"+material+"_planks_three_way_roof\", \"y\":270 },\r\n"
							+ "    \"facing=west\":  { \"model\": \""+CompatModid+":block/three_way/"+material+"_planks_three_way_roof\", \"y\":90 },\r\n"
							+ "    \"facing=north\": { \"model\": \""+CompatModid+":block/three_way/"+material+"_planks_three_way_roof\", \"y\":180},\r\n"
							+ "    \"facing=south\": { \"model\": \""+CompatModid+":block/three_way/"+material+"_planks_three_way_roof\", \"y\":0 }    \r\n"
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
			File roof = new File(Location + "/models/block/three_way/" + material + "_planks_three_way_roof" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/three_way_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+material+"_planks\",\r\n"
							+ "		\"1_1_2\": \""+TextureLocationFormodid+"/"+material+"_planks\"\r\n"
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
			File file = new File(Location + "/models/item/" + material + "_planks_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"parent\": \""+CompatModid+":block/three_way/"+material+"_planks_three_way_roof\"\r\n"
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
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\" },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_top_inner\", \"y\": 180, \"uvlock\": false }\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
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
			File roof = new File(Location + "/models/block/top/" + material + "_top_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/top/" + material + "_top_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/top/" + material + "_top_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
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
			else if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
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
			else if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
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
							+ "    \"variants\": {\r\n"
							+ "        \"facing=east,shape=straight\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\" },\r\n"
							+ "        \"facing=west,shape=straight\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=straight\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=north,shape=straight\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_roof\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\" },\r\n"
							+ "        \"facing=west,shape=outer_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=outer_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=outer_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 270, \"uvlock\": true },\r\n"
							+ "        \"facing=west,shape=outer_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=south,shape=outer_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\" },\r\n"
							+ "        \"facing=north,shape=outer_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_outer\", \"y\": 180, \"uvlock\": true },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_right\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 180, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 90, \"uvlock\": true },\r\n"
							+ "        \"facing=north,shape=inner_right\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \r\n"
							+ "        \"facing=east,shape=inner_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 270, \"uvlock\": false },\r\n"
							+ "        \"facing=west,shape=inner_left\":  { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 90, \"uvlock\": false },\r\n"
							+ "        \"facing=south,shape=inner_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\" },\r\n"
							+ "        \"facing=north,shape=inner_left\": { \"model\": \""+CompatModid+":block/top/"+material+"_planks_top_inner\", \"y\": 180, \"uvlock\": false }\r\n"
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
			File roof = new File(Location + "/models/block/top/" + material + "_planks_top_roof" + ".json");
			File roof_inner = new File(Location + "/models/block/top/" + material + "_planks_top_inner" + ".json");
			File roof_outer = new File(Location + "/models/block/top/" + material + "_planks_top_outer" + ".json");

			if(!roof.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_roof\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material +"_planks\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material +"_planks\"\r\n"
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
			else if(!roof_inner.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_inner);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_inner\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material +"_planks\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material +"_planks\"\r\n"
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
			else if(!roof_outer.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(roof_outer);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"parent\": \"mcwroofs:block/parent/top_outer\",\r\n"
							+ "	\"textures\": {\r\n"
							+ "		\"particle\": \""+TextureLocationFormodid+"/"+ material +"_planks\",\r\n"
							+ "		\"1_2\": \""+TextureLocationFormodid+"/"+ material +"_planks\"\r\n"
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
}