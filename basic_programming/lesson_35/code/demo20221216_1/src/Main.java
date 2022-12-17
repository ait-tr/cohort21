import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println(pow3(100_000_000));

        //2
        System.out.println(getLastDigit(-18));

        //3
        System.out.println(Arrays.toString(getEven(7, 4)));
        System.out.println(Arrays.toString(getEven(7, 5)));
        System.out.println(Arrays.toString(getEven(-7, 5)));

        //4
        System.out.println("Task 4: " + getMaxValueIndex(new int[]{1, 4, -3, 5, 1, 0}));


    }

    // 1. Написать метод, который принимает параметр типа int и возвращает третью степень этого числа.

    public static long pow3(int a) {
        long b = (long) a;
        return b * b * b;
    }

    // 2. Написать метод, который возвращает значение последнего разряда числа.
    // Например: getLastDigit(175) -> 5, getLastDigit(17) -> 7, getLastDigit(1529) -> 9

    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }

// 3. Написать метод, который создает массив из n целых четных чисел больше или равных заданному числу a
    // Например: getEven(n=7, a=4) -> {4,6,8,10,12,14,16}

    public static int[] getEven(int n, int a) {
        if (n <= 0) {
            return new int[0];
        }
        int[] res = new int[n];
        a = a % 2 != 0 ? a + 1 : a;
        for (int i = 0; i < res.length; i++) {
            res[i] = a;
            a += 2;
        }
        return res;
    }

    // 4. Написать метод, который принимает массив целых чисел и возвращает индекс наибольшего числа в этом массиве.
// Например: {5, 9, -1, 6, 10, 1, 8} -> 4
    public static int getMaxValueIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    // 5. Написать метод, который принимает массив строк и возвращает самую длинную строку в этом массиве.
// Например: {“John”, “Nicolaus”, “Ann”} -> “Nicolaus”

    public static String getLongestString(String[] array) { //{null,"dfghjkl;", null ,"dfgh"}
        if (array == null || array.length == 0) {
            return null;
        }
        String longestString = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].length() > longestString.length()) {
                    longestString = array[i];
                }
            }
        }
        return longestString;
    }

// 6. Написать метод, который принимает массив Person(String name, int age) и возвращает самого взрослого человека в этом массиве.
// Например: {John 23, Nicolaus 45, Ann 21} -> Nicolaus 45

    public static Person getOldestPerson(Person[] array){
        if (array == null || array.length == 0) {
            return null;
        }
        Person oldestPerson =array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                if (array[i].getAge() > oldestPerson.getAge()) {
                    oldestPerson = array[i];
                }
            }
        }
        return oldestPerson;
    }

    // 7. Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия,
// а в качестве результата возвращает массив строк вида «И.Иванов».
// Например: {“Иван Иванов”, “Николай Николаев”, “Петр Петров”} -> {“И.Иванов”, “Н.Николаев”, “П.Петров” "Мария Луиза Хосе Гомес"}

    public static String[] shorFirstName(String[] names){
        String[] res = new String[names.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getShortName(names[i]);
        }
        return res;
    }

    private static String getShortName(String name){
        String[] words=name.split(" ",1);
        String res="";
        if(words.length>=2) {
            res = String.valueOf(words[0].charAt(0)) + "." + words[1];
        } else {
            res=name;
        }
        return res;
    }



}