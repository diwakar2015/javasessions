/**
 * 
 */

/**
 *  @author Diwakar
 *
 * Date:  Aug 6, 2015 2015
 * File: ClassSuper.java
 */
public class Super {
	
	int superData ;
	String some;
	
	public Super()
	{
		System.out.println(" I am Super Class");
	}
	
	public Super(int value, String some)
	{
		this.superData = value;
		this.some = some;
		System.out.println("I am also Super cons with value "+ value);
		
	}

}

class Sub extends Super
{
	String name;
	
	public Sub()
	{
		super();
		System.out.println(" I am Sub");
	}
	
	public Sub(int val, String name, String some)
	{
		//super();
		super(val,some);
		this.name = name;
		System.out.println("I am sub class with value "+ val);
	}
	
}
