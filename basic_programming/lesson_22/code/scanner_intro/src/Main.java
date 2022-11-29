import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создали объект класса сканер
        // если хотим получить строку
        System.out.println("Напишите ваше любимое животное \n");
        String text2 = sc.nextLine();
        System.out.println("Любимое животное - " + text2);
        //
        System.out.println("Введите число");
        // метод nextInt() - если хотим получить int
        // получаем число из консоли и сохраняем в переменную
        int number = sc.nextInt();
        System.out.println("Вы написали " + number);
        // если хотим получить строку
        // nextLine() - получаем данные типа String из консоли
        // next() - только первое слово
        System.out.println("Напишите ваш любимый фрукт");
        sc.nextLine(); // иногда перескакивает - чтобы этого не было можно использовать пустую строку
        String text = sc.next(); // только первое слово
        System.out.println("Ваш любимы фрукт " + text);
        System.out.println("Введите дабл");
        double number2 = sc.nextDouble();// вводим через запятую 123123,12
        System.out.println("Вы ввели " + number2);
        System.out.println("Введите булеан true/false");
        boolean bool1 = sc.nextBoolean();
        System.out.println("Вы ввели " + bool1);
        sc.close(); // закрываем сканнер
    }
}