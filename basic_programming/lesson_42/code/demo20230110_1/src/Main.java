/*
Получить List из N случайных целых чисел
* Заполнить лист так, что бы числа шли в не убывающем порядке
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random rnd= new Random(System.nanoTime());

    public static void main(String[] args) {
        //System.out.println(generateSortedList(10));
    }

    public static List<Integer> generateSortedList(int size){
        List<Integer> resList=new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            insert(resList, getNextValue());
        }
        return  resList;
    }

    public static void insert(List<Integer> list, int value){
        if (list.isEmpty() || list.get(list.size()-1)<=value){
            list.add(value);
        } else {
            int indexToInsert=getIndexToInsert(list,value);
            list.add(indexToInsert,value);
        }
    }


    // 15 , 25 , 40, 48, 50    value: 12   -> 0
    // 15 , 25 , 40, 48, 50    value: 22   -> 1
    // 15 , 25 , 40, 48, 50    value: 44  ->  3
    public static int getIndexToInsert(List<Integer> list, int value){
        int resIndex=0;
        while (list.get(resIndex)<value){
            resIndex++;
        }
        return resIndex;
    }


    public static int getNextValue(){
        int min=-100;
        int max=100;
        return rnd.nextInt(max-min+1)+min;
    }
/*
        1.) size of list
        2.) sorted
 */

}