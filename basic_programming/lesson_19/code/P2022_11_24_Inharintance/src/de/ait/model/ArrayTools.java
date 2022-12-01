package de.ait.model;

public class ArrayTools {

    public static void printArrayPerson(Person [] array){
        for(int i=0; i<array.length; i++){
            //System.out.println(array[i]);
            array[i].displayPerson();
        }
    }

}
