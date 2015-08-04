package day4;

import java.util.StringTokenizer;

public class ArrayExample2 {
	
	public static void main(String[] args) {
		
	String sentence = "The organs took one hour and 3 minutes to reach Delhi while the normal travel time in any passenger aircraft is more than two hours";
	
	
	// using split method
	
	
	String wordArray[]  = sentence.split("[\\d]");
	
	System.out.println("No of words is "+ wordArray.length);
	
	for(String word : wordArray)
	{
		System.out.println("Word is "+ word);
		
	}
	
	
	
	// using Stringtokenizer
	
	
	StringTokenizer tokenizer = new StringTokenizer(sentence, " ");
	int c=0;
	while(tokenizer.hasMoreTokens())
	{
		String token = tokenizer.nextToken();
		
		System.out.println("Word Retrieved is ==> "+ token);
		c++;
		
	}
	
	System.out.println(c);	
		
	
	}

}
