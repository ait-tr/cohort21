public class Main {
    public static void main(String[] args) {

        // написать метод, который выводит в консоль числа от 1 до 19 включительно
        // - только нечетные!!!
//        showNumbers(); // 1 3 5 .. 19
//        showNumbers2();
        String text = "Hello, I am a String"; // новый тип String
        String text2 = "I am also string";
        char a = 'a';
        int number; // объявление - выбираем имя переменной и указаем ее тип
        number = 267; // инициализация - даем initial value записываем в переменную значение
        int number2 = 18; // объявили + инициализировали

        System.out.println(text);
        System.out.println(text2);
        System.out.println(text + " "+ text2 );



    }
    public static void showNumbers() {
        for(int i = 1; i <= 19; i+=2) {
            System.out.println(i);
        }
    }
    public static void showNumbers2() {
        for(int i = 1; i <=19; i++){
            if (i % 2 != 0) {  // остаток от деления  - остаток равен 0
                //
                System.out.println(i);
            }
        }
        System.out.println(27%4);


    }


}