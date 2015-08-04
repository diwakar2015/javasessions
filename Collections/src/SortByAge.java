import java.util.Comparator;


public class SortByAge implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.getAge()==o2.getAge())
			return 0;
		else 
			return o1.getAge() > o2.getAge() ? 1 : -1;
	}
	
	

}
