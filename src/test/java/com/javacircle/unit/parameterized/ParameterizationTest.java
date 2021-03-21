package com.javacircle.unit.parameterized;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizationTest {
   /*
     @ValueSource
     @EnumSource
     @CsvSource
     @CscFileSource
     @ArgumentsSource
    */

    //------------------- @ValueSource -------------------

    @ParameterizedTest(name = "{index} - Run test with args = {0}")
    @ValueSource(ints = {1, 5, 7, 8})
    void valueSourceTest(int args) {
        System.out.println(args);
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "orange", "papaya"})
    void valueSourceTest2(String args) {
        System.out.println(args);
    }

    //------------------ @EnumSource ------------------

    enum Fruits {apple, banana, orange, papaya}

    ;

    @ParameterizedTest
    @EnumSource(Fruits.class)
    void enumSourceTest(Fruits args) {
        System.out.println(args);
    }

    //------------------- @MethodSource --------------------
    private static String[] fruits() {
        return new String[]{"apple", "banana", "orange", "papaya"};
    }

    @ParameterizedTest
    @MethodSource("fruits")
    void methodSourceTest(String args) {
        System.out.println(args);
    }


    private static Object[] values() {
        return new Object[][]{
                {"Java", "programming language"},
                {"junit5", "Unit testing framework"},
                {"selenium", "automation api"},
                {"github", "repository"}
        };
    }

    @ParameterizedTest
    @MethodSource("values")
    void methodSourceTest2(String tech, String desc) {
        System.out.println(tech + " --- " + desc);
    }

    //--------------------@CsvSource ------------------

    @ParameterizedTest
    @CsvSource({"Java, programming language",
            "junit5, Unit testing framework",
            "selenium, automation api",
            "github, repository"})
    void csvSourceTest (String tech, String desc) {
        System.out.println(tech + " --- " + desc);
    }


    @ParameterizedTest
    @CsvSource({
            "Peter, admin, 1",
            "John, author, 2",
            "Martin, subscriber, 3"
    })
    void testWith_CsvSource(String name, String role, long id) {
        System.out.println("testWith_CsvSource: name => "+name+"; role => "+role+"; id => "+id);
    }



    //----------------------  @CscFileSource -----------

    @ParameterizedTest(name = "{index} ----> calculate({0}) should return {1}")
    @CsvFileSource(
            resources ="/data/csv_file_data.csv",
            encoding = "UTF-8",
            lineSeparator = "\n",
            delimiter = ',',
            numLinesToSkip = 1
    )
    void cscFileSourceTest (String tech, String desc) {
        System.out.println(tech + " --- " + desc);
    }

  //------------------  @ArgumentsSource  -----------------------

    @DisplayName("Should calculate the correct sum")
    @ParameterizedTest(name = "{index} => a={0}, b={1}, sum={2}")
    @ArgumentsSource(CustomArgumentProvider.class)
    void sum(int a, int b, int sum) {
        System.out.println(sum + " is from " + a +" and " +b);
    }


}