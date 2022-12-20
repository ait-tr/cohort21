import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] array = {"qwe","qwert", "rt", "wertyuio","fghj"};
        sort(array);
        System.out.println(Arrays.toString(array));

    }

/*
    Дан массив строк. Написать метод, который сортирует данный массив в порядке возрастания длин строк, от самой короткой до самой длинной. Использовать любой известный вам алгоритм сортировки. (Для решения данной задаче нельзя использовать встроенные методы сортировки Java )

     */

    public static void sort(String[] arr) {
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

    private static boolean isSwapNeeded(String[] arr, int i1, int i2){
        return arr[i1].length() < arr[i2].length();
    }



    private static void swap(String[] arr, int i1, int i2) {
        String temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }




}
