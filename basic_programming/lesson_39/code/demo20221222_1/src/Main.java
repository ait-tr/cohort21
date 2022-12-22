/*
1) Допустим, у вас есть класс Account со следующими полями String IBAN, double balance, Person client.
Person имеет следующие поля: String firstName, String lastName.
Вам дан массив из Account.
Вам необходимо реализовать метод findAccountsByPerson, который принимает объект
Person и выводит на экран все Account принадлежащие данному пользователю.

2) Доработать этот метод таким образом, что бы он возвращал массив String c номерами IBAN для заданного пользователя
 */



/*
Используя код написанный в классе, добавить в проекте про Accaunt (ДЗ 2022-12-16) сортировку массива Account по значению поля balance

2
Используя код написанный в классе, добавить в проекте про Accaunt (ДЗ 2022-12-16) сортировку массива Account по возрасту клиента





 */


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Person p1 = new Person("James", "Bond");

        Account[] accounts = {
                new Account("DE9999000001", 1000, new Person("Jack1", "Jonson1")),
                new Account("DE9999000002", 1010, new Person("Jack2", "Jonson2")),
                new Account("DE9999000007", 1010, p1),
                new Account("DE9999000003", 1020, new Person("Jack3", "Jonson3")),
                new Account("DE9999000004", 1030, new Person("Jack4", "Jonson4")),
                new Account("DE9999000004", 1030, new Person("Jack4", "Jonson4")),
                new Account("DE9999000005", 1040, new Person("Jack5", "Jonson5")),
                new Account("DE9999000006", 1050, p1)
        };

        System.out.println("------------- AccountsArray ---------------------------");
        AccountsArray accountsArray = new AccountsArray();
        accountsArray.add(new Account("DE9999000010", 1040, new Person("John", "Jonson5")));
        accountsArray.add(new Account("DE9999000011", 1040, new Person("John", "Jonson5")));
        accountsArray.add(accounts);
        accountsArray.print1();
        System.out.println("---- find by person " + p1 + " :");
        System.out.println(Arrays.toString(accountsArray.findAccountsByPerson(p1)));

        System.out.println("-------------------------------------------------------------------------");

/*        for (int i = 0; i < accounts.length ; i++) {
            System.out.println(accounts[i]);
        }
        */

        printAccountsByPerson(accounts, p1);
        System.out.println("------------------------------------------------");
        printAccountsByPerson(accounts, new Person("James", "Bond"));

    }


    public static void printAccountsByPerson(Account[] accounts, Person person) {
        for (Account acc : accounts) {
            if (acc.getClient().equals(person)) {
                System.out.println(acc);
            }
        }
    }

    public static Account[] findAccountsByPerson(Account[] accounts, Person person) {

        // считаем
        int count = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(person)) {
                count++;
            }
        }

        Account[] res = new Account[accounts.length];

        // заполняем массив результата
        count = 0;
        for (Account acc : accounts) {
            if (acc.getClient().equals(person)) {
                res[count++] = acc;
            }


        }
        return res;

    }

    public static Account[] findAccountsByPerson2(Account[] accounts, Person person) {
        AccountsArray res = new AccountsArray();
        for (Account acc : accounts) {
            if (acc.getClient().equals(person)) {
                res.add(acc);
            }
        }
        return res.getAsArray();
    }




}