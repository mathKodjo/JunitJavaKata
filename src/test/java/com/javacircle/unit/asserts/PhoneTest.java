package com.javacircle.unit.asserts;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {

    void phoneNumberMustHave10Digit(){
        Phone  phone =  new Phone();
        String phoneNum = "5154227301";
        fail("a failing test");
    }
}
