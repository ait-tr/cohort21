import java.util.Comparator;

public class PersonComparatorByWeight implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getWeight() > o2.getWeight()) return 1;
        if(o1.getWeight() < o2.getWeight()) return -1;
        return 0;
    }
}
