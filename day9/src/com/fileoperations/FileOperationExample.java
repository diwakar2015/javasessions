/**
 * 
 */
package com.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  @author Diwakar
 *
 * Date:  Aug 5, 2015 2015
 * File: FileOperationExample.java
 */
public class FileOperationExample {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("c:\\javademo\\demo.txt");
		
		if(file.exists())
		{
			FileReader reader = new FileReader(file); 
			
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			
			String line ="";
			while((line=bufferedReader.readLine())!=null)
			{
				System.out.println("Line : "+ line);
				
			}
			
			
		}
		
		else
		{
			System.out.println("No such file ");
		}
		
		
	}

}
