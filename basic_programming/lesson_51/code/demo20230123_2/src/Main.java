import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person persoForDelete= new Person("Nick",18);

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(new Person("1",20));
        linkedList.add(new Person("2",30));
        linkedList.add(persoForDelete);
        linkedList.add(new Person("3",40));
        System.out.println("Size= "+linkedList.size());
        System.out.println(linkedList);
        linkedList.add(new Person("5",50));
        System.out.println("-----------------------");
        System.out.println(linkedList);;
        //System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList.get(2));

        System.out.println("--------------------------------");
        System.out.println(linkedList);
        System.out.println("-------- addFirst -----");
        linkedList.addFirst(new Person("Jack",35));
        linkedList.addFirst(new Person("John",45));

        System.out.println(linkedList);
        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addFirst(new Person("Ann",45));
        System.out.println(linkedList2);
        System.out.println("--------- test Remove ----");
        //System.out.println(linkedList.find().getValue());

        /*
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите имя:");
        String name =sc.nextLine();
        System.out.println("Введите возраст:");
        int age  =sc.nextInt();
        Person p = new Person(name,age);
        System.out.println("Удаляем "+p);
        linkedList.remove(p);
        */


        linkedList.remove(3);
        linkedList.remove(persoForDelete);
        System.out.println(linkedList);



    }

    public static List<String> qwe(List<String> list){

        return list;
    }
}