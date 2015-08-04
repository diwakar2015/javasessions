import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;



public class ArrayListExample {
	
	
	
	
	public static void main(String[] args) {
		
		
	
	ArrayList<String> arrList = new ArrayList<String>();
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	studentList.add(new Student("def", 1036, 50, "ss2"));
	studentList.add(new Student("xyz", 100, 50, "ss4"));
	studentList.add(new Student("abc", 52, 50, "ss3"));
	studentList.add(new Student("abc", 53, 50, "ss1"));
	studentList.add(new Student("bef", 520, 40, "ss4"));
	studentList.add(new Student("cdd", 312, 50, "ss5"));
	
	
	System.out.println("before sorting...");

	for(Student s : studentList)
		System.out.println(s);
	
	Collections.sort(studentList, new SortByAge());
	
	System.out.println("After sorting...");
	for(Student s : studentList)
		System.out.println(s);
	
	/*
	arrList.add("def");
	arrList.add("abc");
	arrList.add("bef");
	
	for(String s : arrList)
		System.out.println(s);
	
	Collections.sort(arrList);
	
	
	System.out.println("after sorting...");
	for(String s : arrList)
		System.out.println(s);
		
	
	
	*/
	
	}	

}
