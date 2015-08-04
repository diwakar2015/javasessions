package day4;

public class StringClasses {
	
	
	public static void main(String[] args) {
		
		// Immutable
		String str = new String("abc");
	
		
		String str1 = "abc";
		
		// Mutable
		
		StringBuilder builder = new StringBuilder("abc");
		builder.append("def");
		System.out.println(builder);
		
		System.out.println(builder.reverse());
		
		
		// thread- safe and all the methods are synchronized
		StringBuffer buffer = new StringBuffer("abc");
		
		
	}

}
