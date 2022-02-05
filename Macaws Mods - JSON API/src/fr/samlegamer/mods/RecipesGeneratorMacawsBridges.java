package fr.samlegamer.mods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecipesGeneratorMacawsBridges
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
	
	public static class BridgeLog
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_log_bridge_middle" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+material+"_log_bridge_middle\",\r\n"
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

		public static void loot_tablesGen(String location, String modidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_log_bridge_middle" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+material+"_log_bridge_middle\"\r\n"
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
	}
	
	public static class BridgeStone
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_bridge" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_wall\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+material+"_bridge\",\r\n"
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
		
		public static void loot_tablesGen(String location, String modidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_bridge" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+material+"_bridge\"\r\n"
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
	}
	
	public static class RopeBridge
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + "rope_" + material + "_bridge" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"WWW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:string\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+"rope_"+material+"_bridge\",\r\n"
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

		public static void loot_tablesGen(String location, String modidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + "rope_" + material + "_bridge" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+"rope_"+material+"_bridge\"\r\n"
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
	}

	public static class Pier
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material, boolean stone, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_bridge_pier" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"WFW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+material+"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+ material +"_bridge_pier\",\r\n"
							+ "        \"count\": 3\r\n"
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
			else if(!file.exists() && stone)
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"WFW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"_wall\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+ material +"_bridge_pier\",\r\n"
							+ "        \"count\": 3\r\n"
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

		public static void loot_tablesGen(String location, String modidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_bridge_pier" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+material+"_bridge_pier\"\r\n"
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
	}

	public static class Stairs
	{
		public static void recipeGen(String location, String modidCompat, String material, boolean stone)
		{
			File file = new File(location + "/data/recipes/" + material + (stone ? "_bridge_stair" : "_log_bridge_stair") + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"  F\",\r\n"
							+ "    \" FF\",\r\n"
							+ "	\"FFF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidCompat+":"+material+"_log_bridge_middle\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+material+"_log_bridge_stair\",\r\n"
							+ "        \"count\": 6\r\n"
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
			else if(!file.exists() && stone)
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"  F\",\r\n"
							+ "    \" FF\",\r\n"
							+ "	\"FFF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidCompat+":"+material+"_bridge\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+material+"_bridge_stair\",\r\n"
							+ "        \"count\": 6\r\n"
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

		public static void loot_tablesGen(String location, String modidCompat, String material, boolean stone)
		{
			File file = new File(location + "/data/loot_tables/" + material + (stone ? "_bridge_stair" : "_log_bridge_stair") + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+material+"_log_bridge_stair\"\r\n"
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
			else if(!file.exists() && stone)
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
							+ "					\"name\": \""+modidCompat+":"+material+"_bridge_stair\"\r\n"
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
	}

	public static class Rails
	{
		public static void recipeGen(String location, String modid, String modidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_rail_bridge" + ".json");
			
			if(!file.exists())
			{
				try
				{
					FileWriter writer = new FileWriter(file);
					BufferedWriter buffer = new BufferedWriter(writer);
					
					buffer.write("{\r\n"
							+ "    \"type\": \"minecraft:crafting_shaped\",\r\n"
							+ "    \r\n"
							+ "    \"pattern\": [\r\n"
							+ "    \"F F\",\r\n"
							+ "    \"FWF\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"F\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"_fence\"\r\n"
							+ "        },\r\n"
							+ "        \r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modid+":"+ material +"_slab\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\":  \""+modidCompat+":"+ material +"_rail_bridge\",\r\n"
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

		public static void loot_tablesGen(String location, String modidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_rail_bridge" + ".json");
			
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
							+ "					\"name\": \""+modidCompat+":"+material+"_rail_bridge\"\r\n"
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
	}
}