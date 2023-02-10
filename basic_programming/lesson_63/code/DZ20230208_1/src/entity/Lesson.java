package entity;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private final int num;
    private final String theme;
    private List<Student> presentStudents;
    private List<Student> absentStudents;
    private final Group group;

    public Lesson(int num, String theme, List<Student> presentStudents, Group group) {
        this.num = num;
        this.theme = theme;
        this.presentStudents = presentStudents;
        this.group=group;
        createListOfAbsentStudent();
    }

    private void createListOfAbsentStudent() {
        absentStudents=group.getStudents();
        absentStudents.removeAll(presentStudents);
    }

    @Override
    public String toString() {
        return num + ". " + theme + ": " + presentStudents;
    }

    public int getNumberOfPresentStudents() {
        return presentStudents.size();
    }
    public int getNumberOfAbsentStudents() {
        return absentStudents.size();
    }

    public List<Student> getPresentStudents() {
        return new ArrayList<>(presentStudents);
    }
    public List<Student> getAbsentStudents() {
        return new ArrayList<>(absentStudents);
    }

}