package entity;

import java.util.Objects;

public class Student {
    private final String name;
    private int counterMissingLesson;


     void addMissingLesson(){
        counterMissingLesson++;
    }

    public int getCounterMissingLesson() {
        return counterMissingLesson;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
