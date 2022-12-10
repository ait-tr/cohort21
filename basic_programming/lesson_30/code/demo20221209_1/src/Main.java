/*
Пользователь с клавиатуры вводит целые числа.
 Максимально можно ввести 10 чисел.
 0 - прекращаем ввод чисел.
 Спрашиваем:
 0 - завершаем программу совсем
 1 - сумма всех чисел
 2 - средднее значение
 любое другое число - проверяем есть ли оно среди введенных.

 Ввод чисел

 Процессинг

 Диалог с полльзователем
 */

public class Main {
    public static void main(String[] args) {
        InputNumbers inputNumbers = new InputNumbers();
        NumbersProcessing processing = inputNumbers.getNumbers();
        System.out.println(processing);
        App app=new App(processing);
        app.userAction();
 }
}