import java.util.Comparator;

public class ComparatorByHomeWork implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getHomeWorkCount()-o1.getHomeWorkCount();
    }
}
