package day6.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {


		String str = "This This is just an example";


		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();


		for(int i=0; i<=str.length()-1; i++)
		{

			char ch = str.charAt(i);

			Integer val = charCountMap.get(ch);

			if(val!=null)
			{
				val = val+1;
				charCountMap.put(ch, val);
			}
			else
			{
				charCountMap.put(ch, 1);
			}


		}
		
		
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet())
		{
			System.out.println("Char "+ entry.getKey() + " occured "+ entry.getValue() + " times in the string.");
			
		}

	}

}
