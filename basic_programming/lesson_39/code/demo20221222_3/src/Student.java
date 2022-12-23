import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<String> subjects;

    public Student(String name) {
        this.name = name;
        subjects=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void addSubject(ArrayList<String> subjects){
        this.subjects.addAll(subjects);
    }

}
