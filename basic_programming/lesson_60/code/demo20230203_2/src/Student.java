import java.util.Objects;

public class Student {
    private String name;
    private  int homeWorkCount;

    public Student(String name, int homeWorkCount) {
        this.name = name;
        this.homeWorkCount = homeWorkCount;
    }

    public String getName() {
        return name;
    }

    public int getHomeWorkCount() {
        return homeWorkCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return homeWorkCount == student.homeWorkCount && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, homeWorkCount);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", homeWorkCount=" + homeWorkCount +
                '}';
    }
}