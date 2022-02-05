package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MCRRecipesGen
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
	
	public static class AtticLog
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "            \"item\": \""+modidExtended+":" + material + (isStemTexture ? "_stem" : "_log") + "\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}
	
	public static class AtticPlanks
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_attic_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
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
							+ "            \"item\": \""+modidExtended+":" + material + "_planks" + "\"\r\n"
							+ "        },\r\n"
							+ "		\"G\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:glass\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_attic_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class CubeLog
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \"SW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class CubePlanks
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_cube_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \"SW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_cube_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class LowerLog
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "		\" WW\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_lower_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class LowerPlanks
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "		\" WW\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_lower_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class RoofLog
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class RoofPlanks
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+ material +"_planks_roof\",\r\n"
							+ "        \"count\": 2\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class SteepLog
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \" W\",\r\n"
							+ "		\"WW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_steep_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class SteepPlanks
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
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
							+ "        \" W\",\r\n"
							+ "		\"WW\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_steep_roof\",\r\n"
							+ "        \"count\": 4\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}

	}

	public static class TopLog
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
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
							+ "        \"WSW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class TopPlanks
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
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
							+ "        \"WSW\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
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
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}

	public static class UpperLowerLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_upper_lower_roof" + ".json");
			
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_upper_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_upper_lower_roof" + ".json");
			
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
							+ "		\"  W\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_upper_lower_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class UpperLowerPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_upper_lower_roof" + ".json");
			
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_upper_lower_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_upper_lower_roof" + ".json");
			
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
							+ "		\"  W\",\r\n"
							+ "        \"WWS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_upper_lower_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class UpperSteepLog
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_upper_steep_roof" + ".json");
			
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_upper_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_upper_steep_roof" + ".json");
			
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
							+ "		\" W\",\r\n"
							+ "		\" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + (isStemTexture ? "_stem" : "_log") +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_upper_steep_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class UpperSteepPlanks
	{
		public static void loot_tables(String location, String ModidCompat, String material)
		{
			File file = new File(location + "/data/loot_tables/" + material + "_planks_upper_steep_roof" + ".json");
			
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
							+ "					\"name\": \""+ModidCompat+":"+material+"_planks_upper_steep_roof\"\r\n"
							+ "				}\r\n"
							+ "			]\r\n"
							+ "		}\r\n"
							+ "	]\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		public static void recipe(String location, String modidExtended, String ModidCompat, String material, boolean isStemTexture)
		{
			File file = new File(location + "/data/recipes/" + material + "_planks_upper_steep_roof" + ".json");
			
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
							+ "		\" W\",\r\n"
							+ "		\" W\",\r\n"
							+ "        \"WS\"\r\n"
							+ "    ],\r\n"
							+ "    \r\n"
							+ "    \"key\":\r\n"
							+ "    {\r\n"
							+ "        \"W\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \""+modidExtended+":"+ material + "_planks" +"\"\r\n"
							+ "        },\r\n"
							+ "		\"S\":\r\n"
							+ "        {\r\n"
							+ "            \"item\": \"minecraft:stick\"\r\n"
							+ "        }\r\n"
							+ "    },\r\n"
							+ "    \r\n"
							+ "    \"result\":\r\n"
							+ "    {\r\n"
							+ "        \"item\": \""+ModidCompat+":"+material+"_planks_upper_steep_roof\",\r\n"
							+ "        \"count\": 3\r\n"
							+ "    }\r\n"
							+ "}");
					
					buffer.close();
					writer.close();
					file.createNewFile();
					System.out.println("Le fichier " + file + " Vient d'�tre g�n�rer � l'emplacement : " + location);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}