package com.example.demo1;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.mockito.ArgumentMatcher;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {


    private  static RepositoryService repository;

    private  static DBDriver driver;

    private static Application application;


    @BeforeAll
    public static void init(){
        System.out.println("Init @BeforeAll");
        application= new Application();
        repository= Mockito.mock(RepositoryService.class);
        driver= Mockito.mock(DBDriver.class);
        //System.out.println(repository.getClass().getSimpleName());


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
    void getLongestString() {
        Application app= new Application(driver,repository);
        List<String> list = List.of(
                "qwew",
                "asdfghj",
                "qweye"
        );
        Mockito.when(repository.findAll()).thenReturn(list);
        Assertions.assertEquals("asdfghj", app.getLongestString());
    }


    @ParameterizedTest
    @MethodSource
    void getLongestString1(List<String> list, String res) {
        Application app= new Application(driver,repository);

        Mockito.when(repository.findAll()).thenReturn(list);
        Assertions.assertEquals(res, app.getLongestString());
    }

    public static Stream<Arguments> getLongestString1(){
        return Stream.of(
                Arguments.of(List.of("111","11","1"), "111")
        );
    }

    @DisplayName("FIND MAX TESTS")
    @Nested
    class FindMaxTests {

        @Test
        void yxample() {
            // Input
            // Run unit with input
            // compare real result and expected result

            Integer num1 = 10;
            Integer num2 = 20;


            Integer expectedResult = num2;
            Integer realResult = application.findMax(num1, num2);

            Assertions.assertEquals(expectedResult, realResult);

        }

        @Test
        @DisplayName("поиск max")
        void findMax() {
            // Input
            // Run unit with input
            // compare real result and expected result


            Application application = new Application();


            Assertions.assertAll(
                    () -> Assertions.assertEquals(20, application.findMax(20, 10), "первре число больще"),
                    () -> Assertions.assertEquals(20, application.findMax(10, 20), "второе число больще"),
                    () -> Assertions.assertEquals(20, application.findMax(20, 20), "равны"),
                    () -> Assertions.assertThrows(IllegalArgumentException.class, () -> application.findMax(null, 20), "the first should be not null"),
                    () -> Assertions.assertThrows(IllegalArgumentException.class, () -> application.findMax(20, null), "the second should be not null")
            );


        }
/*
        @ParameterizedTest
        @MethodSource("com.example.demo1.ApplicationTest#getArgumentsToTestFindMaxWithList")
        void testFindMax(List<Integer> list, Integer res) {
            Assertions.assertEquals(res, application.findMax(list));
        }
*/
        @ParameterizedTest
        @ArgumentsSource(ArgProvider.class)
        @ArgumentsSource(ArgProvider2.class)
        @MethodSource("com.example.demo1.ApplicationTest#getArgumentsToTestFindMaxWithList")
        void testFindMaxFromClass(List<Integer> list, Integer res) {
            Assertions.assertEquals(res, application.findMax(list));
        }


    }

    @Nested
    class PalindromeTests {
        @ParameterizedTest(name = "{0} is good")
        @ValueSource(strings = {"1234321", "qweewq", "w"})
        @NullSource
        @EmptySource
            //@NullAndEmptySource
        void isPalindrome(String str) {
            Assertions.assertTrue(application.isPalindrome(str));
        }

        @DisplayName("isPalindrome")
        @ParameterizedTest(name = "The {0} is palindrome: {1}")
        @CsvSource({
                "123321,true",
                "qwerewq,true",
                "qwerew,false",
                "q,true",
                "qwertreq,false"

        })
        void isPalindrome(String str, boolean res) {
            Assertions.assertEquals(res, application.isPalindrome(str));
        }


        @DisplayName("isPalindrome")
        @ParameterizedTest(name = "The {0} is palindrome: {1}")
        @CsvFileSource(resources = "/data.csv")
        void isPalindrome2(String str, boolean res) {
            Assertions.assertEquals(res, application.isPalindrome(str));
        }



    }



    private static Stream<Arguments> getArgumentsToTestFindMaxWithList() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4), 4),
                Arguments.of(List.of(10, 2, 3, 8), 10)
        );
    }
    @Test
    public void saveString(){
        Application app = new Application(driver,repository );
        String stringToSave="Hello";
        app.saveString(stringToSave);
        // Mockito.verify(mock_object, Mockito.times(    ) )  проверка количества вызывов mock_object
        Mockito.verify(repository, Mockito.times(1) ).save(stringToSave);  // метод был вызван ровно 1 раз именно с этим параметром
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.any(String.class));   // метод был вызван ровно 1 раз с любой строкой
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.argThat(new Matcher()));   //метод был вызван ровно 1 раз с параметром удовлетворяющим Matcher().matches(String s)
        //Mockito.verify(repository, Mockito.times(1) ).save(Mockito.argThat(s->s.length()==4));  // реализация через лямбда
        //Mockito.verify(repository, Mockito.never() ).save(Mockito.any(String.class));     //не было вызывов
        //Mockito.verify(repository, Mockito.atLeast(2) ).save(Mockito.any(String.class));   //хотя бы 2 раза с любым параметром
    }

}

class Matcher implements ArgumentMatcher<String> {
    @Override
    public boolean matches(String s) {
        return s.length()==4;
    }
}