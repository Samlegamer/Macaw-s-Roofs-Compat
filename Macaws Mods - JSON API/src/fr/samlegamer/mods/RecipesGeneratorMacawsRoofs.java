package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecipesGeneratorMacawsRoofs
{
	public static void init(String location)
	{
		File folderData = new File(location + "data/");
		File folderRecipes = new File(location + "data/recipes/");
		File folderLoot_Tables = new File(location + "data/loot_tables/");

		if(!folderData.exists() || !folderRecipes.exists() || !folderLoot_Tables.exists())
		{
			folderData.mkdir();
			folderRecipes.mkdir();
			folderLoot_Tables.mkdir();
		}
	}

	public static class Log_Roof
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_attic_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WG\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass_pane\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}\r\n"
							+ "");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_attic_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_attic_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"WG\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass_pane\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WW\",\r\n"
							+ "        \"WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_cube_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WW\",\r\n"
							+ "        \"WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_four_way_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W \",\r\n"
							+ "		\"WWW\",\r\n"
							+ "        \" W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_four_way_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_four_way_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_four_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W \",\r\n"
							+ "		\"WWW\",\r\n"
							+ "        \" W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_four_way_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"W  \",\r\n"
							+ "        \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_lower_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_lower_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"W  \",\r\n"
							+ "        \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_lower_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"  W\",\r\n"
							+ "		\"  W\",\r\n"
							+ "        \" WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_steep_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_steep_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"  W\",\r\n"
							+ "		\"  W\",\r\n"
							+ "        \" WW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_steep_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_three_way_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WWW\",\r\n"
							+ "        \" W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_three_way_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_three_way_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_three_way_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WWW\",\r\n"
							+ "        \" W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_three_way_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_top_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_log_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_top_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
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
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "	\"type\": \"minecraft:block\",\r\n"
							+ "	\"pools\":\r\n"
							+ "	[\r\n"
							+ "		{\r\n"
							+ "			\"rolls\": 1,\r\n"
							+ "			\"entries\":\r\n"
							+ "			[\r\n"
							+ "				{\r\n"
							+ "					\"type\": \"minecraft:item\",\r\n"
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_top_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_top_roof" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidCompat+":tile_planks_"+material+"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_top_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class Tiles
	{
		public static void log(String location, String ModidCompat, String material, String ModidExtended)
		{
			File file = new File(location + "/data/recipes/" + "tile_log_" + material + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidExtended+":"+material+"_log\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":tile_log_"+material+"\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void planks(String location, String ModidCompat, String material, String ModidExtended)
		{
			File file = new File(location + "/data/recipes/" + "tile_planks_" + material + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\":\r\n"
							+ "    [\r\n"
							+ "        \" W\",\r\n"
							+ "        \"W \"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+ModidExtended+":"+material+"_planks\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":tile_planks_"+material+"\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}