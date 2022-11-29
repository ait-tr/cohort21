import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создали новый объект класса сканер
        System.out.println("Сколько зубов у панды?");
        int answer1 = sc.nextInt(); // здесь получаем ответ от пользователя
        if (answer1 == 38) {
            System.out.println("Правильно, молодец, ты настоящий пандовед!");
        } else {
            System.out.println("Панды смотрят на тебя с осуждением");
        }
        System.out.println("Являются ли панды медведями?");
        String answer2 = sc.next();
        // метод сравнивает строки, не обращая внимания на регистр символов
        if (answer2.equalsIgnoreCase("Да")){
            System.out.println("Панды могли бы вами гордиться");
        } else {
            System.out.println("Панды пытаются скрыть слезы, но не получается");
        }
    }
}