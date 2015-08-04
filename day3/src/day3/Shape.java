package day3;

public abstract class Shape {
	
public abstract int area();
public abstract int perimeter();

public void info()
{
	System.out.println("I am a shape class");
}
	
}



class Rectangle extends Shape 
{
	int l;
	int b;
	
	public void draw()
	{
		System.out.println("Drawing Rectangle...");
	}
	
	@Override
	public int perimeter()
	{
		int l=10;
		int b=20;
		return 2*(l+b);
	}

	@Override
	public int area()
	{
		int l=10;
		int b=20;
		return l*b;
	}
	
	
	
}

class Square extends Shape
{
	int a;
	

	@Override
	public int area() {
		
		int a=5;
		
		return a*a;
	}

	@Override
	public int perimeter() {
		int a=5;
		
		return 4*a;
	}
	
}

class Circle extends Shape
{
	public void draw(){
		System.out.println("Drawing Circle");
		
	}

	@Override
	public int area() {
		int r =7;
		return 22/7*r*r;
	}

	@Override
	public int perimeter() {
		int r=7;
		return 2*22/7*r;
	}
}