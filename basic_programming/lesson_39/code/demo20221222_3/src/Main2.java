import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Student student1 = new Student("Jack");
        Student student2 = new Student("John");

        student1.addSubject("Java");
        student1.addSubject("QA");
        student2.addSubject("QA");
        student2.addSubject("C++");
        student2.addSubject("Java");


        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);


        for (Student student:students) {
            System.out.println(student);
        }

        Student temp = students.get(1);
        students.set(1,students.get(0));
        System.out.println(students);
        students.set(0,temp);

        System.out.println("---------------------------");
        for (Student student:students) {
            System.out.println(student);
        }

        ArrayList<String> listOfSubjects = new ArrayList<>();
        listOfSubjects.add("Go");
        listOfSubjects.add("JavaScript");
        listOfSubjects.add("PhotoShop");


        student1.addSubject(listOfSubjects);
        student2.addSubject(listOfSubjects);

        System.out.println("---------------------------");
        for (Student student:students) {
            System.out.println(student);
        }


    }
}
