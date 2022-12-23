import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringsList = new ArrayList<>(1000);
        stringsList.add("hello");
        stringsList.add("hello1");
        stringsList.add("hello2");
        System.out.println(stringsList);
        System.out.println(stringsList.size());





        // iterate
        System.out.println("iterate stringsList ");
        for (int i = 0; i < stringsList.size() ; i++) {
            System.out.println(stringsList.get(i));
        }
        System.out.println("iterate stringsList with for each ");
        for (String str: stringsList){
            System.out.println(str);
        }



        System.out.println("iterate personList ");
        Person p = new Person("werty",77,"fghj",8.0);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p);
        personList.add(new Person("sdfg",88,"fghj",0.9));
        for (int i = 0; i < personList.size() ; i++) {
            System.out.println(personList.get(i).getName());
        }
        System.out.println("iterate personList with forEach ");
        for (Person person:personList){
            System.out.println(person.getName());
        }
        printStringList(stringsList);

    }

    public static void printStringList(ArrayList<String> list){
        System.out.println("------------ printStringList ----------------");
        System.out.println("size: "+list.size());
        for (String str:list){
            System.out.println(str);
        }
    }
}