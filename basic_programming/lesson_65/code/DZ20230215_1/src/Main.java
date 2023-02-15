/*
В программе задан список Person{String fName, String lName, String email, String phone, Address address}.
Address{String postcode, String city, String street, String house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.
*/

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();


        personList.add(new Person("Sergey", "Fedorov", "seregaFFF@gmail.com", "+4567854641",
                new Address("01547", "Detroit", "Linkoln Street", 23)));

        personList.add(new Person("Nikita", "Kucherov", "nekit77@gmail.com", "+5484121581",
                new Address("48572", "Tampa", "Palm Beach", 112)));

        personList.add(new Person("Alex", "Ovechkin", "alexthebest@gmail.com", "+8888888888",
                new Address("78542", "Washington", "Main Street", 15)));

        System.out.println(getList(personList, p -> p.getFullName()));
        System.out.println("-----------------------");
        System.out.println(getList(personList, (Person p) -> p.getEmail()));
        System.out.println("-----------------------");
        System.out.println(getList(personList, p -> p.getPhone()));
        System.out.println("-----------------------");
        System.out.println(getList(personList, p -> p.getAddressAsString()));
        System.out.println(getList(personList, new MyImplPersonToString("(",")")));
        System.out.println(getList(personList, new MyImplPersonToString("",";")));


    }
    public static List<String> getList(List<Person> list, PersonToStringFunction personToStringFunction) {
        List<String> res = new ArrayList<>();
        for (Person person : list) {
            res.add(personToStringFunction.processing(person));
        }
        return res;
    }


}