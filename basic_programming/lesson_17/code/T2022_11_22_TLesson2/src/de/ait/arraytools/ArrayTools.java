package de.ait.arraytools;

public class ArrayTools {

    public static void fillArray(int array[], int min, int max){
        for(int i=0; i<array.length; i++){
            array[i]=(int)(min+Math.random()*(max+1-min));
        }
    }

    public static void printArray(int array[]){
        for(int i=0; i<array.length; i++){
            System.out.println("Arr ["+i+"]"+"="+array[i]);
        }
    }

    //bubbleSort
    //selectionSort
    //simpleSearch
    //binarySearch
    //maxIndexInArray
    //minIndexInArray
    //maxDigitInArray
    //minDigitInArray



}
