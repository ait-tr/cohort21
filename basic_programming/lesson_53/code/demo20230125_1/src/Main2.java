import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        String car1="qwert";
        String car2="Lada";

        List<String> list1 = new ArrayList<>();

        list1.add(car1);
        list1.add(car2);
        Set<String> set1= new HashSet<>(list1);
        set1.remove(car1);
        car1=car1.toUpperCase();
        list1.set(0,car1);



        List<String> list2 = new LinkedList<>(list1);


        System.out.println(car1 + " hashCode: " + car1.hashCode());

        System.out.println(car1 + " hashCode: " + car1.hashCode());



        System.out.println("list1=" + list1);
        System.out.println("list2=" + list2);
        System.out.println("set1=" + set1);

        System.out.println();

        System.out.println("is " + car1 +" contains: "+set1.contains(car1));


    }
}