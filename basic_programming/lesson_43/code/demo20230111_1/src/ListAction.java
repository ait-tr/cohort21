import java.util.ArrayList;
import java.util.List;

public class ListAction {

    public List<Person> youngerThan(List<Person> personList, int age) {
        List<Person> ageListPerson = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() < age) {
                ageListPerson.add(person);
            }

        }
        return ageListPerson;

    }

    public List<String> getPersonsAsStringList(List<Person> people){
        List<String> list = new ArrayList<>();
        for (Person person:people) {
            list.add(person.toString());
        }
        return list;
    }



}

