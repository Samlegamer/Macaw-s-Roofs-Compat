package fr.samlegamer.cave_and_cliff_part_II.roof;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MCRLangGen
{
	public static void initAllEnglish(String LOCATION, String Modid, ArrayList<String> Mat, ArrayList<String> MatLang, int MatNumber)
	{		
		File file = new File(LOCATION + "En_Us_Wood_Roofs.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);

				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_roof\":\""+MatLang.get(i)+" Roof\",");
					System.out.println("Hello = 1");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_attic_roof\":\""+MatLang.get(i)+" Attic Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_cube_roof\":\""+MatLang.get(i)+" Cube Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_top_roof\":\""+MatLang.get(i)+" Top Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_lower_roof\":\""+MatLang.get(i)+" Lower Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_steep_roof\":\""+MatLang.get(i)+" Steep Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_upper_lower_roof\":\""+MatLang.get(i)+" Upper Lower Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_upper_steep_roof\":\""+MatLang.get(i)+" Upper Steep Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_roof\":\""+MatLang.get(i)+" Planks Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_attic_roof\":\""+MatLang.get(i)+" Planks Attic Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_cube_roof\":\""+MatLang.get(i)+" Planks Cube Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_top_roof\":\""+MatLang.get(i)+" Planks Top Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_lower_roof\":\""+MatLang.get(i)+" Planks Lower Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_steep_roof\":\""+MatLang.get(i)+" Planks Steep Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_upper_lower_roof\":\""+MatLang.get(i)+" Planks Upper Lower Roof\",");
					buffer.newLine();
				}
				
				for(int i = 0; i >= MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_planks_upper_steep_roof\":\""+MatLang.get(i)+" Planks Upper Steep Roof\",");
					buffer.newLine();
				}

				
				//buffer.write("\"\"");
				
				buffer.close();
				writer.close();
				file.createNewFile();
				System.out.println("Le fichier " + file + " Vient d'être générer à l'emplacement : " + LOCATION);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}	
		}
	}
}