package day3;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the shape name");
		String shapeName = sc.next();
		
		
		Shape shape = MainClass.getShape(shapeName);
		
		System.out.println("Area of "+ shapeName + " is "+ shape.area());
		

		
	}
	
	
	
	public static Shape getShape(String shapeName)
	{
		
		if(shapeName.equalsIgnoreCase("circle"))
		{
			Circle cir = new Circle();
			return cir;
		}
		
		else if(shapeName.equalsIgnoreCase("square"))
		{
			Square sq = new Square();
			return sq;
		}
		
		else if(shapeName.equalsIgnoreCase("rectangle"))
		{
			Rectangle rec = new Rectangle();
			return rec;
		}
		else
		{
			return null;
		}
		
	}

}
