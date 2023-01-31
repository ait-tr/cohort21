public class Main {
    public static void main(String[] args) {
        printArray(new int[]{1,8,-3,4});
    }

    public static void recursionMethod(int i, int target ){
        if (i==target){        //  базовый случай
            System.out.println("   Базовый случай. i="+i + " Цель достигнута. Завершаем");
        } else {              //   рекурсивный случай
            System.out.println("Старт: ("+i+")");
            recursionMethod(i+1,target);     // рекурсивный вызов метода
            System.out.println("Финиш: ("+i+")");
        }
    }

    public  static void printArray(int[] arr){
        printArray(0,arr);
    }

    private static void printArray(int i, int[] arr ){
        if (i==arr.length){    // базовый случай
            return;
        } else {              //   рекурсивный случай
            System.out.println("arr["+i+"]= " +arr[i]);
            printArray(i+1,arr);
        }
    }

}