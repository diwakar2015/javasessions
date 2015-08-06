/**
 * 
 */
package com.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: FolderListing.java
 */
public class FolderListing {
	public static void main(String[] args) {
		
		File file = new File("c:\\javademo\\abc.txt");
		
		if(file.exists())
		{
			
		}
		else{
			file.mkdir();
		}
		
		
   File files[] = file.listFiles();
   
   for(File s : files )
   {
	   if(s.isDirectory())
	   {
		   System.out.println("Folder "+ s.getAbsolutePath());
	   }
	   else
	   {
		   System.out.println("File name "+ s.getAbsolutePath());
	   }
	   
   }
 
		
		
		
	}
	
	
	
	
	

}
