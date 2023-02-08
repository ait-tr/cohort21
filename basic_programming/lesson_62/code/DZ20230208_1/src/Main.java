/*
Дано List< List<Integer>> , каждый элемент этого листа -
отсортированный лист Integer. Необходимо объединить
все листы в один отсортированный лист.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-5, 2, 3));
        list.add(List.of(4, 5, 18));
        list.add(List.of(-8,-7,0, 11, 17,22,25));
        list.add(List.of(-17,8, 16,28,30,33));

        System.out.println(marge1(list));
        System.out.println(marge2(list));
    }

    public static List<Integer> marge1(List<List<Integer>> lists){
        List<Integer> res=new ArrayList<>();
        for (List<Integer> iList:lists){
            res.addAll(iList);
        }
        Collections.sort(res);
        return res;
    }

    public static List<Integer> marge2(List<List<Integer>> lists){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (List<Integer> iList:lists){
            for (Integer i:iList){     //addAll() ?
                priorityQueue.offer(i);
            }
        }
        List<Integer> res=new ArrayList<>();
        while (priorityQueue.size()>0){
            res.add(priorityQueue.poll());
        }
        return res;
    }
}