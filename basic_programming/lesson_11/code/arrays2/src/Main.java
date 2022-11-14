public class Main {
    public static void main(String[] args) {
//        int[] myNumbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int count = 0;
        for(int i = 2; i <= 20; i+=2){
            System.out.println(i);
            count++;
        }
        System.out.println("We have " + count + " elements");
        int[] myNumbers = new int[count];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[7]); // сейчас у нас есть массив из нулей с длинной 10

        System.out.println("_______"); // записываем значения
        // myNumbers[0] = 2;
//        myNumbers[1] = 4;
//        myNumbers[2] = 6;
//        myNumbers[3] = 8;
        int index = 0;
        for(int i = 2; i <= 20; i++) {
            if(i % 2 == 0) {
                System.out.print(index + " ");
//                System.out.println(i);
                myNumbers[index] = i; // здесь должно быть все ок
                System.out.println(myNumbers[index]); // вывели значение в консоль
                index++;
            }
        }
        System.out.println("_______final_______"); // еще раз выведем в консоль

        for(int i = 0; i < myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }
    }
}
//    Создайте массив из всех чётных чисел от 2 до 20
//    и выведите элементы массива на экран,
//    Перед созданием массива подумайте, какого он будет размера.
//        2
//        4
//        6
//        …
//        20
// ПОДСКАЗКИ
// сначала напишите просто цикл  - который бы выводил бы эти числа в консоль
// посчитайте сколько чисел было в массиве
// (сделайте переменную которая увеличивалась бы в цикле, ее нужно создать до цикла
// создайте массив длинной равный этой переменной  int[] name = new int[count];
// и запишите в него значения, используя еще один массив