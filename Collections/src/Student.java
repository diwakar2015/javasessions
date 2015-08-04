
public class Student{
	
	
	private String name;
	private int age;
	private double percentage;
	private String SSN;
	
	
	public Student(String name, int age, double percentage, String sSN) {
		super();
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		SSN = sSN;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	// These methods are of object class
	// This is used to compare two objects of calss who implements the mehtod Equals and  HashCode
	
	// Two objects will be trated as same object if hashcode return the same value// for 
	//both the objects and also equals method return true for t
	//both the objects
	
	// s1  -> hashcode 186 
	//s2 --> 186   -> equals--> true // both are same else both are diffrent
	@Override
	public int hashCode()
	{
		final int SALT=31;
		int hashCode = SSN.length()*SALT+SALT;
		System.out.println("Inside hashCode with Value for SSN :"+ this.SSN +" is "+ hashCode);
		return hashCode;
	}
	
	
	// this will be called when  you create the object
	@Override
	public boolean equals(Object obj)
	{
		
		if(obj==null)
			return false;
		
		if(!(obj instanceof Student))
			return false;
		
		Student std = (Student) obj;
		
		System.out.println("This.ssn ="+ this.SSN + "  and std.ssn= "+ std.SSN);
		
		boolean isEqual = this.SSN.equalsIgnoreCase(std.SSN);
		
		System.out.println("Inside equals for SSN "+ std.SSN +" isEqual ="+ isEqual );
		
		return isEqual;
		
		
	}
	
	
	@Override
	public String toString()
	{
		return  "Student Name "+ name + " Student Age : "+ age+ " Percentage : "+ percentage + "SSN :==> "+ SSN;
		
	}
	
/*	
	@Override
	public int compareTo(Student std) {
		
		
		int i = this.name.compareTo(std.name);
		System.out.println("this.name =" +this.name + " std.name = "+ std.name +" and value of i= "+ i);
		return i;
		
	}
	
*/
	
	

}


