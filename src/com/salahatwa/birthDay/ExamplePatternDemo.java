package com.salahatwa.birthDay;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamplePatternDemo {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
			Pattern.compile("^[A-Z0-9.]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
	
	public static final Pattern VALID_DATE=Pattern.compile("^([0-9]{2}|[0-9]{4})+-[0-9]{2}-[0-9]{2}$",Pattern.CASE_INSENSITIVE);
	
	public static boolean validateDate(String date)
	{
		Matcher matcher=VALID_DATE.matcher(date);
		
		return matcher.find();
	}
	
	public static int countWord(String word,String sentense)
	{
		Pattern wordPattern=Pattern.compile(word);
		Matcher matcher=wordPattern.matcher(sentense);
		
		while (matcher.find()) {
			System.out.println(matcher.start()+":"+matcher.end());
		}
		
		return 0;
	}

	public static boolean validate(String emailStr) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

	public static void main(String[] args) {
		countWord("salah", "salah work hard");
//         System.out.println( validate("s-as@dsd.as") );
//         System.out.println(validateDate("5541-55-45"));
  	}

}
