import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest {

    @Test
    public void getPersonAccounts(){
        List<Account> testList = new ArrayList<>();
        testList.add(new Account("DE01", new Person("Jack Sparrow")));
        testList.add(new Account("DE02", new Person("Black Widow")));
        testList.add(new Account("DE03", new Person("Hulk")));
        testList.add(new Account("DE04", new Person("Hans Zimmer")));

        HashMap<Person,String> expectedResult = new HashMap<>();
        expectedResult.put(new Person("Jack Sparrow"),"DE01");
        expectedResult.put(new Person("Black Widow"),"DE02");
        expectedResult.put(new Person("Hulk"),"DE03");
        expectedResult.put(new Person("Hans Zimmer"),"DE04");

        HashMap<Person, String> actualResult = Main.getPersonAccounts(testList);

        Assertions.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void ifExceptionThrowsTest(){
        boolean flag = false;
        List<Account> testList = new ArrayList<>();
        testList.add(new Account("DE01", new Person("Jack Sparrow")));
        testList.add(new Account("DE02", new Person("Black Widow")));
        testList.add(new Account("DE03", new Person("Hulk")));
        testList.add(new Account("DE05", new Person("Hulk")));
        testList.add(new Account("DE04", new Person("Hans Zimmer")));
        try{
            HashMap<Person, String> actualResult = Main.getPersonAccounts(testList);
        }catch (MoshennikException e){
            flag=true;
        }
        Assertions.assertTrue(flag);

    }
}