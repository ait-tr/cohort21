package entity;

import java.util.*;

public class Group {

    private final Set<Student> students = new HashSet<>();

    public Group(Student... students) {
        add(students);
    }

    public void add(Student... students) {
        this.students.addAll(Arrays.asList(students));
    }

    public int getGroupSize() {
        return students.size();
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students); //

    }
}
