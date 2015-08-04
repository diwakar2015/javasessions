package day2;

public class GradeCalcualtor {
	
	// 100-90 % -- A
	
	// 90-80 -- B
	
	// 80-60 -- C
	
	//60-40 -- D
	
	//Below 40 --E
	
	public static void main(String[] args) {
		
	
		
			byte physics = 70;
			byte chemistry = 80;
			byte maths = 75;
			
			
			boolean isFailed = false;
			
			GradeCalcualtor gradCal = new GradeCalcualtor();
			
			int sum = gradCal.sum(physics, chemistry, maths);
			
			double percentage = gradCal.percentage(sum);
			
			System.out.println(" Percentage is "+ percentage);
			
			if(percentage>90  && percentage<=100)
			{
				System.out.println("Grade - A");
			}
		
			else if(percentage>80 && percentage<=90)
			{
				System.out.println("Grade - B");
			}
			
			else if(percentage>60 && percentage<=80)
			{
				System.out.println("Grade - C");
			}
			
			else if(percentage>40 && percentage<=60)
			{
				System.out.println("Grade - D");
			}
			
			else
			{
				System.out.println("Grade - E");
				isFailed = true;
			}
			
			
			
			
			if(isFailed)
			{
			System.out.println("Student failed.");
			}
		
	}
	

	public int sum(int x, int y, int z)
	{
		int sum = x+y+z;
		return sum;
		
	}
	
	public double percentage(int sum)
	{ 
		int totalMarks = 300;
		double avg =  (double)sum/totalMarks;
		double percentage = avg*100;
		return percentage;
	}
	
}
