package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MoreType {


	public static void main(String[] args) {

		BufferedReader br = null;
		try
		{
			File file = new File("c:/Diwakar/abc.txt");

			FileReader reader = new FileReader(file);

			 br = new BufferedReader(reader);

			String str = "";
			
			
			
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
				
				
			}
			
			System.out.println("done reading");

		}
	
	
		catch (FileNotFoundException e) {
			System.out.println("ex "+e);
		}
		
		catch (IOException e) {
			// TODO: handle exception
		}
		
		finally{
			System.out.println("I will be executed all the time");
			try {
				br.close();
			} catch (IOException e) {
				
			}
			
		}
	

	}

}
