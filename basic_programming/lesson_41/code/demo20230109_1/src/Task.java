/*

Получить List из N случайных целых чисел
* Заполнить лист так, что бы числа шли в не убывающем порядке

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task {
    public static Random random = new Random(System.nanoTime());


    public static void main(String[] args) {

        List<Integer> list = getRndList(2);
        System.out.println(list);
        System.out.println(getRndList(list,5));

        System.out.println(getRndList(20));
        System.out.println(getRndList(5));

    }

    public static List<Integer> getRndList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    // 1 ,5,4

    public static List<Integer> getRndList(List<Integer> list, int newSize) {
        int count = newSize - list.size();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

}
