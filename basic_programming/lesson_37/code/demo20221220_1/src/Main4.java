import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        MyDate[] array = {
           new MyDate(1,2,2003),
           new MyDate(10,3,2004),
           new MyDate(4,5,2003),
           new MyDate(1,2,2022),
        };
        sort(array);
        System.out.println(Arrays.toString(array));

    }

/*
       Дан массив объектов MyDDate(int day, int month, int year). Написать метод, который сортирует данный массив от самой ранней даты до самой поздней. Использовать любой известный вам алгоритм сортировки. Подсказка: естественно вам придется написать метод сравнения двух дат. (Для решения данной задаче нельзя использовать встроенные методы сортировки Java, и встроенные способы сравнения объектов)



     */

    public static void sort(MyDate[] arr) {
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

    private static boolean isSwapNeeded(MyDate[] arr, int i1, int i2){
        if (arr[i1].getYear() == arr[i2].getYear()) {
            if (arr[i1].getMonth() == arr[i2].getMonth()){
                return arr[i1].getDay() < arr[i2].getDay();
            } else {
                return arr[i1].getMonth() < arr[i2].getMonth();
            }
        } else {
            return arr[i1].getYear() < arr[i2].getYear();
        }
    }



    private static void swap(MyDate[] arr, int i1, int i2) {
        MyDate temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }




}
