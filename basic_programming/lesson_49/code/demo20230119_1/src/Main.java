import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        int index =1;
        int index2 =10;
        Scanner scanner = new Scanner(System.in);
        //getElementByIndex(arr,index);

        try {
            //scanner.nextInt();
            //getElementByIndex(arr,index);
            System.out.println(Arrays.toString(subArray(arr, index, index2)));

        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception обработан!");
        }

    }


    public static int[] subArray(int[] array, int i1, int i2){
        int res[]= new int[i2-i1];
        int j=0;
        try {
            for (int i = i1; i < i2 ; i++) {
                res[j++]=getElementByIndex(array,i);
            }
        } catch (ArrayIndexOutOfBoundsException e){
           throw new GetSubArrayException(e);
        }
        return res;
    }

    public static int getElementByIndex(int[] array, int index){
        /*
        if (index<0 || index>= array.length) {
            throw new IndexOutOfBoundsException();
        }
        */
        return array[index];
    }

}