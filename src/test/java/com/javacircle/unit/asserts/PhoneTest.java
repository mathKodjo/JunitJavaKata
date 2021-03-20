package com.javacircle.unit.asserts;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneTest {

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
		Long phoneNum = 12356l;
		Exception exception =  assertThrows(Exception.class, ()->new  Phone(phoneNum));
	}
	
	
	@Test
	@DisplayName("Custom test name containing spaces")
	public void wrongInput() {
		Phone  phone =  new Phone();
		Long phoneNum = 0l;
	    assertThrows(Exception.class,()->{phone.PhoneThrowsExample(phoneNum);} );
	}

}
