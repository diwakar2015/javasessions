package day4;

public class StudentInfo {
	
	public static void main(String[] args) {
		
		
		Student listOfStudents[] = new Student[50];
		
		for(int i=0; i<50; i++)
		{
			
			Student student = new Student();
			
			student.rollNumber = 10+i;
			student.studentName = "name-"+i+1;
			student.std=10;
			
			listOfStudents[i] = student;
			
			
		}
		
		
		System.out.println("Here is the list of students");
		
		
		// For each loop
		
		for(Student student : listOfStudents)
		{
			System.out.println("Name : "+ student.studentName + " Roll "+ student.rollNumber + " Class "+ student.std);
		}
		
		
		/*for(int i=0; i<50; i++)
	    {
			
			Student student = listOfStudents[i];
			
			System.out.println("Name : "+ student.studentName + " Roll "+ student.rollNumber + " Class "+ student.std);
		
		}*/
		
	}

}
