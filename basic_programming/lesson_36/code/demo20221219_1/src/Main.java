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

        //7
        System.out.println(getShortName("Иван Иванов"));
        System.out.println(getShortName("ИванИванов"));
        System.out.println(getShortName("Иван Иванов FGH0K"));
        //System.out.println(getShortName(null));

        //8
        System.out.println("----------- #8 -------------");
        // "Jack Jonson" -> f:Jack l:Jonson
        System.out.println(getStudentByName("Jack Jonson"));
        // Jack Nick Jonson -> f: Jack Nick  l: Jonson
        System.out.println(getStudentByName("Jack Nick Jonson"));
        // Jack-Nick Jonson -> f: Jack-Nick  l: Jonson
        System.out.println(getStudentByName("Jack-Nick Jonson"));
        // J.Nick Jonson-Gray -> f: J.Nick  l: Jonson-Gray
        System.out.println(getStudentByName("J.Nick Jonson-Gray"));
        // Jonson -> f:  l: Jonson
        System.out.println(getStudentByName("Jonson"));
        // "" -> null
        System.out.println(getStudentByName(""));

        String[] names = {"Jack Jonson", "Jack Nick Jonson", ""};
        System.out.println(Arrays.toString(stringsArrayToStudentsArray(names)));

        System.out.println("-------------- 9 ---------------------");

        System.out.println(sumDigits(3459)); // 21
        System.out.println(sumDigits(-3459)); //21
        System.out.println(sumDigits(3)); //3
        System.out.println(sumDigits(0)); //0

        System.out.println("-------------- 10 ---------------------");
        getPrimeNumbers(10);

        System.out.println("-------------------- 11 ----------------");
        String[] arr1=  {"John", "Nicolaus", "Ann"}; // true -> {“John”, “Ann”} , false -> {“Nicolaus”}
        System.out.println(Arrays.toString(getNewStringArray(arr1,true)));
        System.out.println(Arrays.toString(getNewStringArray(arr1, false)));
        String[] arr2=  {"Ann"};
        System.out.println(Arrays.toString(getNewStringArray(arr2,true)));
        System.out.println(Arrays.toString(getNewStringArray(arr2, false)));

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

    public static Person getOldestPerson(Person[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        Person oldestPerson = array[0];

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

    public static String[] shorFirstName(String[] names) {
        String[] res = new String[names.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getShortName(names[i]);
        }
        return res;
    }

    private static String getShortName(String name) {   // Иван Иванов
        String[] words = name.split(" ", 2);
        String res = "";
        if (words.length >= 2) {
            res = String.valueOf(words[0].charAt(0)) + "." + words[1];
        } else {
            res = name;
        }
        return res;
    }

//  Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия, а в качестве результата возвращает массив объектов типа Student{String firstName, String lastName} .

    public static Student[] stringsArrayToStudentsArray(String[] names) {
        Student[] res = new Student[names.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = getStudentByName(names[i]);
        }

        return res;
    }

    // "Jack Jonson" -> f:Jack l:Jonson
    // Jack Nick Jonson -> f: Jack Nick  l: Jonson
    // Jack-Nick Jonson -> f: Jack-Nick  l: Jonson
    // J.Nick Jonson-Gray -> f: J.Nick  l: Jonson-Gray
    // Jonson -> f:  l: Jonson

    private static Student getStudentByName(String name) {
        // name != null
        String firstName = "";
        String lastName = "";
        String[] words = name.trim().split(" ");
        //!name.isEmpty()
        if (!words[words.length - 1].isEmpty()) {
            lastName = words[words.length - 1];
            for (int i = 0; i < words.length - 1; i++) {
                firstName += words[i] + " ";
            }
            return new Student(firstName.trim(), lastName);
        } else {
            return null;
        }
    }

    //  Дано целое число num. Необходимо написать метод, который посчитает сумму разрядов этого числа.
    //  Например: 3459 -> 21
    //  num%10 ->9
    //  3459/10 -> 345

    public static int sumDigits2(int num) {
        int res = 0;
        num = Math.abs(num);
        while (num != 0) {
            res += num % 10;
            num = num / 10;
        }
        return res;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        num = Math.abs(num);
        String str = String.valueOf(num); //3547 ->"3547"
        for (int i = 0; i < str.length(); i++) {
            //sum += Character.getNumericValue(str.charAt(i));
            sum += getNumericValue(str.charAt(i));
        }
        return sum;
    }

    private static int getNumericValue(char ch) {
        switch (ch) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                return 0;
        }
    }

    // 10.   Число называется простым, если делиться без остатка только на единицу или на само себя.Реализовать  //метод, который выводит n простых чисел. Например:
    //getPrimeNumbers(10) -> 1   2   3   5   7   11   13   17    19	23

    public static void getPrimeNumbers(int n){
        int num=1;
        while (n>0){
           if(isPrime(num)) {
               System.out.println(num);
               n--;
           }
           num++;
        }
    }

    public static boolean isPrime(int num){         //11   2 3 4 5 6 7 8 9 10
        if (num != 2 && num%2==0) return false;
        for (int i = 3; i < num/2+1 ; i+=2) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
/*
    11.    Дан массив строк. Написать метод, который принимает данный массив и параметр boolean flag. Метод должен возвращать новый массив строк, но, в зависимости от значения flag, метод должен возвращать либо массив, содержащий все элементы исходного массива с четными индексами, либо, наоборот, с нечетными индексами.
            Например:
    {“John”, “Nicolaus”, “Ann”}, true -> {“John”, “Ann”}
    {“John”, “Nicolaus”, “Ann”}, false -> {“Nicolaus”}

    flag == true - четные индексы
    flag == false - не четные индексы

    1) в массиве нечетное количество
            flag==true
                array.lenth/2+1
            flag == false
                array.lenth/2

    2) в массиве четное количество
        flag==true
            array.lenth/2
        flag == false
            array.lenth/2

*/

    public static String[] getNewStringArray(String[] array, boolean flag){
        int len= array.length/2;
        if(flag && array.length%2!=0) {
            len++;
        }
        String[] res = new String[len];
        int index=0;
        if(!flag){
            index=1;
        }
        for (int i=0; i<res.length; i++){
            res[i]= array[index];
            index+=2;
        }

        return res;
    }

}