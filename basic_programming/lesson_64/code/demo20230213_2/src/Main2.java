import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
// Реализация компаратора с помощью лямбда выражений
public class Main2 {
    public static void main(String[] args) {
        List<Student> student = List.of(
                new Student("Jack", 20, 1),
                new Student("Nick", 23, 4),
                new Student("Lena", 30, 9),
                new Student("Igor", 18, 0),
                new Student("John", 16, 2),
                new Student("Ann", 32, 2)
        );

        Comparator<Student> comparatorByAge= (Student o1, Student o2) ->{return o1.getAge()-o2.getAge();};
        Comparator<Student> comparatorByMissedClasses= (Student o1, Student o2) -> {return o1.getQuantityOfMissedClasses()-o2.getQuantityOfMissedClasses();};
        Comparator<Student> comparatorByName= (Student o1, Student o2) -> {return o1.getName().compareTo(o2.getName());};
        Comparator<Student> selectedComparator=null;

        int choice=3;
        switch (choice){
            case 1: selectedComparator = comparatorByAge;break;
            case 2: selectedComparator = comparatorByMissedClasses;break;
            case 3: selectedComparator = comparatorByName;break;
            default: selectedComparator = comparatorByAge;
        }
        System.out.println(sortStudents(student,selectedComparator));

    }

    public static List<Student> sortStudents(List<Student> list, Comparator<Student> comparator){
        List<Student> studentList = new ArrayList<>(list);
        studentList.sort(comparator);
        return studentList;
    }
}