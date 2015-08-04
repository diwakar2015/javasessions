package day3;

public class StaticVsInstance {
	
//Instance variable or non-static fields
 int x;
 boolean someBoolean;
 String str;
 
 
 //Class level variable
  static int version;
 
 
 public static void main(String[] args) {
	
	
	
	StaticVsInstance.version= 100;
	
	
	
	version = 200;
	
	version = 300;
	
	
	
	
	System.out.println("Version details "+version + " "+ version + " "+ version );
	

	
}
 
 
 public void displayNumber()
 {
	 
	 int varX=10;
	 
	 System.out.println(varX);
	 
	 
 }

}


// Instance variable
//Local variable --> it  resides in a method..
//Static variable or class veriable