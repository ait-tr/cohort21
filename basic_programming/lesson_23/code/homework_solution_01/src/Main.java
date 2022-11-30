import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        endlessCalculator();
        experiment(9, 10); // здесь аргументы
    }

    public static void experiment(int a, int b) { // здесь параметры // сигнатура метода - типы и имя
        System.out.println(a * 2 + b * 2);
    }

    // метод, который повторяет калькулятор, если пользователь пишет "да"
    public static void endlessCalculator() {
        calculator();
        boolean indicator = true;
        Scanner cs = new Scanner(System.in);
        while (indicator) {
            System.out.println("Хотите посчитать еще?");
            String answer = cs.next();
            if (answer.equalsIgnoreCase("да")) {
                calculator();
            } else {
                indicator = false;
            }
        }
    }

    public static void calculator() {
        Scanner cs = new Scanner(System.in);
        System.out.println("Введите число");
        double x1 = cs.nextDouble();

        System.out.println("Введите оператор +, -, /, *, %");
        String operator = cs.next();

        System.out.println("Введите второе число");
        double x2 = cs.nextDouble();
        switch (operator) {
            case "+":
                System.out.println(x1 + x2);
                break;
            case "-":
                System.out.println(x1 - x2);
                break;
            case "*":
                System.out.println(x1 * x2);
                break;
            case "/":
                System.out.println(x1 / x2);
                break;
            default:
                System.out.println("Error, wrong operator");
        }
    }
}