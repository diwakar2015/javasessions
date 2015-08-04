package multithreading.methods;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class A
{

	public static void main(String[] args) {


		List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 

		features.forEach(n -> System.out.println(n));



		features.forEach(System.out::println);

		new Thread(new Runnable() {
			@Override public void run() 
			{
				System.out.println("Before Java8, too much code for too little to do"); 
			}
		}).start();

		//Java 8 way:

		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();


		// applying 12% VAT on each purchase // Without lambda expressions: 
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500); 
		for (Integer cost : costBeforeTax)
		{
			double price = cost + .12*cost;
			System.out.println(price);
		}
		// With Lambda expression:
		List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTax1.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);

        List<String> strList = Arrays.asList("bnnb","m","mklm","kpollp","mo");
        
		List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered); 

		
		// Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(G7Countries);

		
		//Get count, min, max, sum, and average for numbers
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
		

		
		
		
		
	}

}