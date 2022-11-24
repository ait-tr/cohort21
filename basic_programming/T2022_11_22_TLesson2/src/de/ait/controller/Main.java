package de.ait.controller;

import de.ait.arraytools.ArrayTools;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int [] array = new int[10];
        ArrayTools.fillArray(array, 10,100);
        ArrayTools.printArray(array);
        int [] array2 = new int [100];
        ArrayTools.fillArray(array2, -100,200);
        ArrayTools.printArray(array2);




    }
}