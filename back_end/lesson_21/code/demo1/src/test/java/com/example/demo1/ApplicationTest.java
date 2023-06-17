package com.example.demo1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    private static Application application;

    @BeforeAll
    public static void init(){
        System.out.println("Init @BeforeAll");
        application= new Application();
    }


    @AfterAll
    public static void close(){
        System.out.println("------------- @AfterAll --------------");
    }

    @BeforeEach
    public  void startNewTes(){
        System.out.println("@BeforeEach");

    }
    @AfterEach
    public  void stopNewTes(){
        System.out.println("@AfterEach");
    }

    @Test
    void yxample() {
        // Input
        // Run unit with input
        // compare real result and expected result

        Integer num1=10;
        Integer num2=20;



        Integer expectedResult = num2;
        Integer realResult = application.findMax(num1,num2);

        Assertions.assertEquals(expectedResult,realResult);

    }

    @Test
    @DisplayName("поиск max")
    void findMax() {
        // Input
        // Run unit with input
        // compare real result and expected result


        Application application= new Application();


        Assertions.assertAll(
                ()->Assertions.assertEquals(20,application.findMax(20,10), "первре число больще"),
                ()->Assertions.assertEquals(20,application.findMax(10,20),"второе число больще"),
                ()->Assertions.assertEquals(20,application.findMax(20,20), "равны"),
                ()->Assertions.assertThrows(IllegalArgumentException.class,  ()->application.findMax(null, 20), "the first should be not null"),
                ()->Assertions.assertThrows(IllegalArgumentException.class,  ()->application.findMax(20, null), "the second should be not null")
        );



    }

    @ParameterizedTest (name="{0} is good")
    @ValueSource(strings = {"1234321","qweewq","w"})
    @NullSource
    @EmptySource
    //@NullAndEmptySource
    void isPalindrome(String str) {
        Assertions.assertTrue(application.isPalindrome(str));
    }

    @DisplayName("isPalindrome")
    @ParameterizedTest (name="The {0} is palindrome: {1}")
    @CsvSource({
        "123321,true",
        "qwerewq,true",
        "qwerew,false",
        "q,true",
        "qwertreq,false"

    })

    void isPalindrome(String str, boolean res) {
        Assertions.assertEquals(res,application.isPalindrome(str));
    }


    @DisplayName("isPalindrome")
    @ParameterizedTest (name="The {0} is palindrome: {1}")
    @CsvFileSource(resources = "/data.csv")

    void isPalindrome2(String str, boolean res) {
        Assertions.assertEquals(res,application.isPalindrome(str));
    }


    @ParameterizedTest
    @MethodSource("getArgumentsToTestFindMaxWithList")
    void testFindMax(List<Integer> list, Integer res) {
        Assertions.assertEquals(res,application.findMax(list));
    }

    private static Stream<Arguments> getArgumentsToTestFindMaxWithList(){
        return Stream.of(
                Arguments.of(List.of(1,2,3,4),4),
                Arguments.of(List.of(10,2,3,8),10)
        );
    }

}