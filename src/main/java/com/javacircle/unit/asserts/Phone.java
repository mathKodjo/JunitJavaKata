package com.javacircle.unit.asserts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

	private static final String PATTERN = "\\d{10}";

	public Phone() {}

	public boolean isValidPhoneNumber(String phoneNum) {
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(phoneNum);
		return matcher.matches();
	}


	public  Phone(long number) throws Exception {
		if(String.valueOf(number).length()!=0) {
			throw new Exception(" Phone number must have 10 digit, lenght is "+ String.valueOf(number).length());
		}	
	}


	public  void PhoneThrowsExample(long number) throws Exception {
		if(String.valueOf(number).length()!=0) {
			throw new Exception(" Phone number must have 10 digit, lenght is "+ String.valueOf(number).length());
		}	


	}

}
