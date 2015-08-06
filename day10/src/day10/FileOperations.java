/**
 * 
 */
package day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *  @author Diwakar
 *
 * Date:  Aug 6, 2015 2015
 * File: FileOperations.java
 */
public class FileOperations {
	
	public static void main(String[] args) throws IOException {
		
		String str = "clientPost FV452 F001B";
		
		File dirName = null;
		File fileName = null;
		
		try
		{
		
		 dirName = new File("c:\\javademo\\someotherfolder");
		 dirName.mkdir();
		 
		 fileName = new File("c:\\javademo\\someotherfolder\\myfile.txt");
		
		}
		catch(Exception e)
		{
			System.out.println("Exception e" +e);
		}
		
		if(!fileName.exists())
		{
			
			fileName.createNewFile();
			System.out.println("New file got created!!");
		}
		
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bufWriter = new BufferedWriter(writer);
		
		bufWriter.append(str);
		bufWriter.close();
		
		System.out.println("Done");
		
		}
		
		
	}
	

