import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void listShouldBeSorted(){

        List<Integer> list=Main.generateSortedList(100);
        boolean sorted =true;
        for (int i = 1; i < list.size() ; i++) {
            if(list.get(i)< list.get(i-1)){
                sorted=false;
                break;
            }

        }
        Assertions.assertTrue(sorted);
    }

    @Test
    public void insertToEnd(){
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        Main.insert(list, 60);

        boolean res = list.get(4) == 60 &&
                      list.get(0) == 15 &&
                      list.get(1) == 19 &&
                      list.get(2) == 25 &&
                      list.get(3) == 31;
        Assertions.assertTrue(res);
    }

    @Test
    public void insertToEnd1(){
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(15);
        expectedList.add(19);
        expectedList.add(25);
        expectedList.add(31);
        expectedList.add(60);

        Main.insert(list, 60);

        Assertions.assertEquals(expectedList,list);
    }


    @Test
    public void insertToMid(){
        List<Integer> list = new ArrayList<>(); // 15,19,25,31
        list.add(15);
        list.add(19);
        list.add(25);
        list.add(31);

        List<Integer> expectedList = new ArrayList<>(); // 15,19,22,25,31
        expectedList.add(15);
        expectedList.add(19);
        expectedList.add(22);
        expectedList.add(25);
        expectedList.add(31);

        Main.insert(list, 22);

        Assertions.assertEquals(expectedList,list);
    }

    @Test
    public void getIndexToInsertTest(){
        /*
             - создали исходные данные для вызова тестируемого метода
             - вызвали тестируемый метод с исходными данными
             - сравнили результат работы метода с ожидаемым результатом
         */

        List<Integer> inputList = new ArrayList<>();
        inputList.add(15);
        inputList.add(25);
        inputList.add(40);
        inputList.add(48);
        inputList.add(50);

        int value =12;

        int expectedResult = 0;
        int actualResult=Main.getIndexToInsert(inputList,value);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getIndexToInsertTest1(){
        /*
             - создали исходные данные для вызова тестируемого метода
             - вызвали тестируемый метод с исходными данными
             - сравнили результат работы метода с ожидаемым результатом
         */

        List<Integer> inputList = new ArrayList<>();
        inputList.add(15);
        inputList.add(25);
        inputList.add(40);
        inputList.add(48);
        inputList.add(50);

        int value =30;

        int expectedResult = 2;
        int actualResult=Main.getIndexToInsert(inputList,value);

        Assertions.assertEquals(expectedResult,actualResult);
    }


}
