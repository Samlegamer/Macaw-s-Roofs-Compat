package fr.samlegamer.languages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MacawsBridgesLangGenerator
{
	public static void WoodBridges(String LOCATION, String Modid, ArrayList<String> Mat, ArrayList<String> MatLang, int MatNumber)
	{		
		File file = new File(LOCATION + "En_Us_Wood_Bridges.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_log_bridge_middle\": \""+MatLang.get(i)+" Bridge\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge_pier\": \""+MatLang.get(i)+" Bridge Support\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+".rope_"+Mat.get(i)+"_bridge\": \"Rope "+MatLang.get(i)+" Bridge\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_log_bridge_stair\": \""+MatLang.get(i)+" Bridge Stair\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_rail_bridge\": \""+MatLang.get(i)+" Rail Bridge\",");
					buffer.newLine();
				}
				
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

	public static void StoneBridges(String LOCATION, String Modid, ArrayList<String> Mat, ArrayList<String> MatLang, int MatNumber)
	{		
		File file = new File(LOCATION + "En_Us_Stone_Bridges.json");
		
		if(!file.exists())
		{
			try
			{
				FileWriter writer = new FileWriter(file);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge\":\""+MatLang.get(i)+" Bridge\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge_pier\": \""+MatLang.get(i)+" Bridge Support\",");
					buffer.newLine();
				}
				
				for(int i = 0; i == MatNumber; i++)
				{
					buffer.write("\"block."+Modid+"."+Mat.get(i)+"_bridge_stair\": \""+MatLang.get(i)+" Bridge Stair\",");
					buffer.newLine();
				}
				
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