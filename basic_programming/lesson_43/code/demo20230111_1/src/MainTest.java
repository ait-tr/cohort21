import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    @Test
    void initialsNameTest() {
        Person[] people = {
                new Person("Vasili","qwe",20),
                new Person("Anne-Katrin","qwe",20),
                new Person("Luise Franka","qwe",20)
        };

        String[] expectedResult = {"V.","A.","L.F."};
        String[] actualResult = new String[3];

        for (int i = 0; i < people.length ; i++) {
            actualResult[i]= people[i].initialsName();
        }
        //List<String> expectedList =Arrays.asList(expectedResult);


        Assertions.assertEquals(Arrays.asList(expectedResult),Arrays.asList(actualResult));

    }

    @Test
    public void youngerAgeTest() {

        Person p1 = new Person("Иванов", "Сергей", 45);
        Person p2 = new Person("Петрова- Сидорова", "Юлия", 10);
        Person p3 = new Person("Lost", "James", 98);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        List<Person> expectedList = new ArrayList<>();
        expectedList.add(p1);
        expectedList.add(p2);

        ListAction listAction = new ListAction();
        List<Person> actualResult = listAction.youngerThan(personList,50);

        Assertions.assertEquals(expectedList,actualResult);
    }

    @Test
    void  getPersonsAsStringListTest1(){
        Person p1 = new Person("Иванов", "Сергей", 45);
        Person p2 = new Person("Петрова- Сидорова", "Юлия", 33);
        Person p3 = new Person("Lost", "James", 98);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("(Иванов ,И., 45)");
        expectedList.add("(Петрова- Сидорова ,П., 33)");


        ListAction listAction = new ListAction();

        List<Person> people = listAction.youngerThan(personList, 50);
        List<String> personsAsStringList = listAction.getPersonsAsStringList(people);

        Assertions.assertEquals(expectedList,personsAsStringList);

    }





}

