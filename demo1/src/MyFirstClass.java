

public class MyFirstClass {
	
	
	//Special method in java
	// This
	
	public static void main(String[] args) {
	
		System.out.println("start point ");
		
		Phone nokiaPhone = new Phone();
		nokiaPhone.model ="NOKIA 6060";
		nokiaPhone.price=1000;
		
		nokiaPhone.call();
		nokiaPhone.msg();
		
		
		int sum = nokiaPhone.calculate(10, 20);
		
		System.out.println("Calucalted by nokia phone "+ sum);
		
		
		Phone applePhone = new Phone();
		applePhone.model = "Apple 4S";
		applePhone.price = 2000;
		applePhone.call();
		applePhone.msg();
		
		
int sum1 = applePhone.calculate(100, 200);
		
		System.out.println("Calucalted by apple phone "+ sum1);
		
		System.out.println("end point...");
		
		
	}

}

class Phone
{
	int price;
	String model;
	
	public void call()
	{
		System.out.println("making a call.."+ model);
	}
	
	public void msg()
	{
		System.out.println("Sending message with phone "+ model);
	}
	
	public int calculate(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
}