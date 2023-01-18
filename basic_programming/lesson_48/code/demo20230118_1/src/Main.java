import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("1");
        myLinkedList.add("2");
        myLinkedList.add("3");
        myLinkedList.add("4");
        System.out.println("Size= "+myLinkedList.size());
        System.out.println(myLinkedList);
        myLinkedList.add("5");
        System.out.println("-----------------------");
        System.out.println(myLinkedList);;
        System.out.println(Arrays.toString(myLinkedList.toArray()));

        try {
            System.out.println(myLinkedList.get(99));
        } catch (IndexNotCorrectException e){
            System.out.printf("индекс %d не корректен", e.getIndex());
            System.out.printf(" размер листа %d %n",e.getSize());
            e.printStackTrace();
        }








    }

    public static List<String> qwe(List<String> list){

        return list;
    }
}