import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(-5);
        set.add(9);
        set.add(6);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Person p1 = new Person("Jack",36);
        Person p2 = new Person("Nick",20);
        Person p3 = new Person("John",23);

        Set<Person> personSet = new TreeSet<>();
        personSet.add(p1);
        personSet.add(p2);
        System.out.println(personSet);

        System.out.println("------------sort with ComparatorPerson --------------");

        Set<Person> personSet2 = new TreeSet<>(new ComparatorPersonByName());
        personSet2.add(p1);
        personSet2.add(p2);
        System.out.println(personSet2);

        System.out.println("------------- Tree Demo------------------------------");
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(3);
        set2.add(-5);
        set2.add(9);
        set2.add(6);

        NavigableSet<Integer> integers = set2.descendingSet();
        System.out.println(integers);
        System.out.println(integers.higher(4));


        //System.out.println(set);

    }
}
class ComparatorPersonByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}