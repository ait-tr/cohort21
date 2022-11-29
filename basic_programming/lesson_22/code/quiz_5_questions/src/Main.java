import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // создайте викторину на пять вопросов
        // чтобы программа выдавала feedback молодец/ неправильно
        // дополнительно
        // создайте счетчик/рейтинг - который бы увеличивался при правильных ответах
        // вы ответили правильно на 4 вопроса из 5
        // при неверном ответе - покажите какой ответ был правильным

        // подсказки
        // answer2.equalsIgnoreCase("Да")
        Scanner sc = new Scanner(System.in); // создали новый объект класса сканер
        int score = 0;
        System.out.println("_________________________");
        System.out.println("Когда создается новый объект, программа использует для этого функцию, которая называется?");
        String answer1 = sc.next();
        String rightAnswer1 = "конструктор";
        if ( answer1.equalsIgnoreCase(rightAnswer1)) {
            System.out.println("Правильно!");
            score++;
        } else {
            System.out.println("Неверно, правильный ответ: " + rightAnswer1);
        }

        System.out.println("_________________________");
        System.out.println("С именем чего совпадает имя конструктора?");
        String answer2 = sc.next();
        String rightAnswer2 = "класса";
        if ( answer2.equalsIgnoreCase(rightAnswer2)) {
            System.out.println("Правильно!");
            score++;
        } else {
            System.out.println("Неверно, правильный ответ: " + rightAnswer2);
        }
        System.out.println("_________________________");
        System.out.println("Если не создать конструктор, будет ли пустой констуктор создан автоматически?");
        String answer3 = sc.next();
        String rightAnswer3 = "да";
        if ( answer3.equalsIgnoreCase(rightAnswer3)) {
            System.out.println("Правильно!");
            score++;
        } else {
            System.out.println("Неверно, правильный ответ: " + rightAnswer3);
        }
        System.out.println("_________________________");
        System.out.println("Может ли конструктор быть переопределен?");
        String answer4 = sc.next();
        String rightAnswer4 = "да";
        if ( answer4.equalsIgnoreCase(rightAnswer4)) {
            System.out.println("Правильно!");
            score++;
        } else {
            System.out.println("Неверно, правильный ответ: " + rightAnswer4);
        }
        System.out.println("_________________________");
        System.out.println("Если был создан конструктор с параметрами, а еще нужен без параметров, нужно прописывать его отдельно?");
        String answer5 = sc.next();
        String rightAnswer5 = "да";
        if ( answer5.equalsIgnoreCase(rightAnswer5)) {
            System.out.println("Правильно!");
            score++;
        } else {
            System.out.println("Неверно, правильный ответ: " + rightAnswer5);
        }
        System.out.println("_________________________");
        System.out.println("Вы ответили правильно на "+ score + " вопросов из 5");

    }
}