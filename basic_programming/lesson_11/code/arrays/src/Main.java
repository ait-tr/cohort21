public class Main {
    public static void main(String[] args) {
        // создали массивы
        int[] myNumbers = {6, 7, 8, 9, 10, 11};
        // .length - чтобы узнать длину массива
        System.out.println("Длина массива: " + myNumbers.length);
        // печатаем второй элемент массива (с индексом 1)
        System.out.println("Элемент под индексом 1: " + myNumbers[1]);

        System.out.println("Элемент с индексом 2 до: " + myNumbers[2]);
        // присвоить новое значение элементу массива под индексом 2
        myNumbers[2] = 22;
        System.out.println("Элемент с индексом 2 после: " + myNumbers[2]);
        int[] friends15 = new int[15]; // создали новый массив, но что в нем лежит?
        System.out.println("Что лежит в массиве по умолчанию? " + friends15[0]);
        System.out.println(friends15);
        System.out.println("__________________");
        String[] fruits = {"apple", "orange", "mango", "lemon", "banana"};
        // напишите цикл - который выводит значения массива в печать
        // вам поможет длинна массива - ее можно получить fruits.length
        // здесь выведем вручную
        System.out.println(fruits[0]); // apple
        System.out.println(fruits[1]); // orange
        System.out.println(fruits[2]); // mango
        System.out.println(fruits[3]); // lemon
        System.out.println("_________");
        // а здесь через цикл for
        for(int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println("_________");
        // выведем в обратном порядке тот же самый массив
        for(int i = fruits.length -1; i >= 0; i--){
            System.out.println(fruits[i]);
        }
        System.out.println("_________");
        // выведем без первого и последнего
        for(int i = 1; i < fruits.length-1; i++) {
            System.out.println(fruits[i]);
        }


    }
}


/*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран. Перед созданием массива подумайте, какого он будет размера.
2 4 6 … 18 20
2
4
6
…
20

 */


