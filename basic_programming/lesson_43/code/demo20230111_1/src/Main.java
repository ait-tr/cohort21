/*
Дан лист из Person (fName, lName, age). Необходимо получить лист из строк вида (Иванов И., 45)
для всех людей, младше заданного возраста.
В рамках данной задачи считаем, что исходный list не содержит значения null. Необходимо реализовать тесты.

 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*1. Создать Класс Персона

        2. Создать Лист из Персон
        Создать Тест
        проверка на скоращение
        проверка на возраст


        3. Создать метод  Сокращение слова до одной буквы
        4. Создать проверку на возраст
        5. Собираем Лист Вместе

        *
        * */
        Person p1 = new Person("Иванов", "Сергей", 45);
        Person p2 = new Person("Петрова- Сидорова", "Юлия", 33);
        Person p3 = new Person("Lost", "James", 98);


        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);


        ListAction listAction = new ListAction();

        List<Person> people = listAction.youngerThan(personList, 50);
        List<String> personsAsStringList = listAction.getPersonsAsStringList(people);
        System.out.println(personsAsStringList);


    }

}