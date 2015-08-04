package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		int aveMarks[] = new int[3];

				try
		{

			aveMarks = new ExceptionHandling().calCulateAverage();

		}
		catch(ArithmeticException ex)
		{
			System.out.println("Exception occured, someone enterted noOfSubjects as Zero "+ex.getMessage());
			System.out.println("Retrying now....");
			aveMarks = new ExceptionHandling().calCulateAverage();
		}
		{


			for(Integer avgMark : aveMarks)
			{
				System.out.println("Average Mark :"+ avgMark);
			}



		}



	}
	public int[] calCulateAverage() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);
		
		int aveMarks[] = new int[3];
		for(int i=0; i<3; i++)
		{

			System.out.println("Enter the total marks");
			int marks = sc.nextInt();

			System.out.println("Enter the no of subjects");
			int noOfSubjects = sc.nextInt();

			int avg = marks/noOfSubjects;

			aveMarks[i] = avg;


		}
		
		System.out.println("Returing the array");
		return aveMarks;
		
	}
}
