/*
# 1
Давайте представим, что мы реализовываем банковское приложение. Вам необходимо создать класс Client, со следующими полями: String firstName, String lastName.
Реализуйте конструктор, toString, геттеры. Создайте класс Account со следующими атрибутами String IBAN, Client client, double balance. Напишите методы конструктора, toString и геттеры.
Создайте массив из объектов Account, распечатайте все счета.

# 2
В классе Account напишите метод secureToString, который работает как обычный toString, но вместо IBAN помещает в результирующую строку что-то вроде DE45*********35 (заменяет все символы строки IBAN на char '*', кроме четырех первых и двух последних).

#3
Напишите метод, который получает массив Account и увеличивает баланс каждого счета на 10%

 */

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("Иван", "Иванов");
        Account a1 = new Account("DE123456789", c1, 1000.10);

        Account[] accounts = {
                new Account("DE1234567890", new Client("Ивван", "Иванов"), 9991.10),
                new Account("DE1234567891", new Client("Петр", "Петров"), 10002.10),
                new Account("DE1234567892", new Client("Олга", "Иванова"), 103.10),
                new Account("DE1234567893", new Client("Светлана", "Винтер"), 6379.10)
        };
        AccountsArray accountsArray=new AccountsArray(accounts);

        System.out.println(accountsArray);
        System.out.println("---------------- secure print -----------------");
        System.out.println(accountsArray.secureToString());
        System.out.println("---------------------------------");
        accountsArray.increase();
        System.out.println(accountsArray);

    }



}