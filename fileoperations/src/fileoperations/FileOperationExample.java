package fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class FileOperationExample {

	
public static void main(String[] args) throws Exception {
	
	long startTime = System.currentTimeMillis();
	
	File file = new File("c:/Diwakar/output.txt");
	
	FileReader reader = new FileReader(file);
	
	BufferedReader br = new BufferedReader(reader);
	
	HashMap<String, Integer> wordList = new HashMap<String, Integer>();
	
	String line="";
	
	while((line = br.readLine())!=null)
	{
		
		// Split the string on basis of space
		
		StringTokenizer tokenizer = new  StringTokenizer(line," ");
		
		while(tokenizer.hasMoreTokens())
		{
			String word = tokenizer.nextToken();
			if(wordList.get(word)!=null)
			{
				wordList.put(word, wordList.get(word)+1);
				
			}
			else
			{
				wordList.put(word, 1);
			}
		}
			
	}
	
	
	br.close();
	
	//Sorting the map
	
	Set<Entry<String, Integer>> wordSet = wordList.entrySet();
	
	List<Map.Entry<String, Integer>> listOfWord = new ArrayList<Entry<String, Integer>>(wordSet);
	
	Collections.sort(listOfWord, new Comparator<Entry<String, Integer>>() {

		@Override
		public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
			return o2.getValue().compareTo(o1.getValue());
		}
		
		
	});
	
	
	
	for(Entry<String, Integer> entry : listOfWord)
	{
		System.out.println(entry.getKey() + " -> "+ entry.getValue());
	}
	
	
	
	/*for(Map.Entry<String, Integer> entry : wordList.entrySet())
	{
		System.out.println(entry.getKey() + " occured "+ entry.getValue() + " times.");
	}*/
	
	
	long endTime = System.currentTimeMillis();
	
	System.out.println("Time taken to execute this method is "+ (endTime - startTime)/1000 + "  seconds.");
	
}
	
	
}
