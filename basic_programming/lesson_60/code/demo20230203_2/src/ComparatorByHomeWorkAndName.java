import java.util.Comparator;
public class ComparatorByHomeWorkAndName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        int hoWo=o2.getHomeWorkCount()-o1.getHomeWorkCount();

        return hoWo==0? o2.getName().compareTo(o1.getName()):hoWo;

    }
}
