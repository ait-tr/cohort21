/*
1 - 1
5 - 25
10 - 100
1000 - 1000000
1500 -2 250 000
O(1)
O(n)
O(n^2)
O(log n)


 */


// O(n^2)

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 1, 5, 8, 10, 0, 20, 23, 56, 57, 58, 60};
        int[] array2 = {2, 1, 5, 8, 10, 0, 20, 23, 56, 57, 58, 60};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

    //  Дан массив целых чисел. Написать метод, который сортирует данный массив в порядке возрастания. Использовать любой известный вам алгоритм сортировки.

    public static void sort(int[] arr) {
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

    private static boolean isSwapNeeded(int[] arr, int i1, int i2){
        return arr[i1] < arr[i2];
    }



    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }








}