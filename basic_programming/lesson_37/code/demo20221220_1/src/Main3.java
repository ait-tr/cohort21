import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        Person[] array = {
           new Person("Jack",30),
           new Person("Nick", 36),
           new Person("Ann", 23),
           new Person("John", 29),
           new Person("Oleg", 22),
        };
        sort(array);
        System.out.println(Arrays.toString(array));

    }

/*
    Дан массив объектов Person(String name, int age). Написать метод, который сортирует данный массив по старшинству, от самого юного Person до самого взрослого. Использовать любой известный вам алгоритм сортировки. (Для решения данной задаче нельзя использовать встроенные методы сортировки Java )


     */

    public static void sort(Person[] arr) {
        boolean flag = true;

        for (int j = 0; j < arr.length - 1 && flag; j++) {

            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (isSwapNeeded(arr, i+1,i)) {
                    swap(arr, i, i + 1);
                    flag = true;
                }
            }
        }
    }

    private static boolean isSwapNeeded(Person[] arr, int i1, int i2){
        return arr[i1].getAge() < arr[i2].getAge();
    }



    private static void swap(Person[] arr, int i1, int i2) {
        Person temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }




}
