package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserNameValidator {


	public boolean validate(String username){

		String USERNAME_REGEX_PATTERN = "^[\\d]{3,5}$"; 
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile(USERNAME_REGEX_PATTERN);

		matcher = pattern.matcher(username);
		return matcher.matches();

	}



	public static void main(String[] args) {

		/*System.out.println("Enter the usename");

		String userName = new Scanner(System.in).nextLine();
		System.out.println("Is Valid ? "+  new UserNameValidator().validate(userName));
		
		*/
		String str ="hello this is Java 8 verision 7 and 5";
		
		str = str.replaceAll("[\\d]"," abc");
		System.out.println(str);
		
		
	}




}
