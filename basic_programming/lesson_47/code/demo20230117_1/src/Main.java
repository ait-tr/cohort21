import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println("Size= "+linkedList.size());
        System.out.println(linkedList);
        linkedList.add("5");
        System.out.println("-----------------------");
        System.out.println(linkedList);;
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList.get(2));








    }

    public static List<String> qwe(List<String> list){

        return list;
    }
}