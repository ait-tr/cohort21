/*
Дано List< List<Integer>> , каждый элемент этого листа -
отсортированный лист Integer. Необходимо объединить
все листы в один отсортированный лист.
 */

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-5, 2, 3));
        list.add(List.of(-5));
        list.add(List.of(4, 5, 18));
        list.add(List.of(-8,-7,0, 11, 17,22,25));
        list.add(List.of(-17,8, 16,28,30,33));

        System.out.println(marge3(list));
        System.out.println(marge4(list));

    }

    public static List<Integer> marge3(List<List<Integer>> listsOfNumbers) {
        List<Integer> resultList = new ArrayList<>();
        int totalSize = getResultSize(listsOfNumbers);
        int[] indexesOfLists = new int[listsOfNumbers.size()];
        int actualIndex;
        while (resultList.size() < totalSize) {
            Integer minValue = Integer.MAX_VALUE;
            int listWithMinValue = 0;
            int listNumber = 0;
            for (List<Integer> list : listsOfNumbers) {
                actualIndex = indexesOfLists[listNumber];
                if (actualIndex == list.size()) {
                    listNumber++;
                    continue;
                }
                Integer actualValue = list.get(actualIndex);
                if (actualValue < minValue) {
                    minValue = actualValue;
                    listWithMinValue = listNumber;
                }
                listNumber++;
            }
            actualIndex = indexesOfLists[listWithMinValue];
            indexesOfLists[listWithMinValue] = actualIndex + 1;
            resultList.add(minValue);
        }
        return resultList;
    }

    public static List<Integer> marge4(List<List<Integer>> listsOfNumbers) {
        int resultSize = getResultSize(listsOfNumbers);
        List<Integer> resultList = new ArrayList<>(resultSize);

        int[] indexesOfLists = new int[listsOfNumbers.size()];
        for (int i = 0; i < indexesOfLists.length ; i++) {
            indexesOfLists[i]=0;
        }

        while (resultList.size() < resultSize) {
            int actualListIndex
                    = getIndexOfListWithCurrentlyMinValue(listsOfNumbers,indexesOfLists);

            List<Integer> actualList = listsOfNumbers.get(actualListIndex);

            Integer actualElement = actualList.get(indexesOfLists[actualListIndex]++);

            resultList.add(actualElement);
        }
        return resultList;
    }

    private static int getIndexOfListWithCurrentlyMinValue(
            List<List<Integer>> listsOfNumbers,
            int[] indexesOfLists
    ){
        int minValue=Integer.MAX_VALUE;
        int listOfMinValue =0;
        for (int i = 0; i < indexesOfLists.length ; i++) {
            List<Integer> currentList=listsOfNumbers.get(i);
            if (indexesOfLists[i]< currentList.size()){
                int currentValue= currentList.get(indexesOfLists[i]);
                if(currentValue<minValue){
                    minValue=currentValue;
                    listOfMinValue=i;
                }
            }
        }
        return listOfMinValue;
    }
    private static int getResultSize(List<List<Integer>> listsOfNumbers) {
        int totalSize = 0;
        for (List<Integer> list : listsOfNumbers) {
            totalSize += list.size();
        }
        return totalSize;
    }

}

