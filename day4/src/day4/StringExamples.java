package day4;

public class StringExamples {
	
	//String is immutable
	
	public static void main(String[] args) {
		
		
	String str = "diwakar";
	
	String upperCase = "";
	
	for(int i=0; i<=str.length()-1; i++)
	{
		char positionedChar = str.charAt(i);
		
		char cc = (char)(positionedChar - 32);
		
		upperCase = upperCase + cc;
	}
		
		
		System.out.println("Reversed String : "+ upperCase);
		
	}
	
	

}
