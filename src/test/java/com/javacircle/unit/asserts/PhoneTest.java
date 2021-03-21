package com.javacircle.unit.asserts;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

	@Test
	void ValidPhoneNumberIs10Digit(){
		Phone  phone =  new Phone();
		String phoneNum = "1234567890";
		assertTrue(phone.isValidPhoneNumber(phoneNum));
	}

	@Test
	void InvalidPhoneNumberIsNot10Digit(){
		Phone  phone =  new Phone();
		String phoneNum = "123456789";
		assertFalse(phone.isValidPhoneNumber(phoneNum));
	}


	@Test
	void InvalidPhoneNumberValidThrowException(){
		long phoneNum = 12356L;
		 assertThrows(Exception.class, ()->new  Phone(phoneNum));
	}
	
	
	@Test
	@DisplayName("Custom test name containing spaces")
	 void wrongInput() {
		Phone  phone =  new Phone();
		long phoneNum = 0L;
	    assertThrows(Exception.class,()->{phone.PhoneThrowsExample(phoneNum);} );
	}

}
