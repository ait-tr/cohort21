import entity.Group;
import entity.Lesson;
import entity.Student;

import java.util.*;

/*
Дан список студентов группы.
Дан список занятий entity.Lesson {int num, String theme, List<entity.Student> students}
т.е. номер занятия, тема и  список присутствующих студентов.
1) Необходимо получить список занятий, где количество прогульщиков было больше заданного числа
2) Необходимо получить список “прогульщиков” отсортированный по количеству прогулов
 */
public class Main {
    public static void main(String[] args) {
        Student s1= new Student("Jack");
        Student s2= new Student("Jahn");
        Student s3= new Student("Ann");
        Student s4= new Student("Pit");
        Student s5= new Student("Nick");
        Student s6= new Student("Lena");
        Student s7= new Student("Nina");
        Group group= new Group(s1,s2,s3,s4,s5,s6,s7);


        List<Lesson> lessons= List.of(
                new Lesson(1, "Theme_1", List.of(s1,s2,s3,s4,s5,s6,s7),group),
                new Lesson(2, "Theme_2", List.of(s1,s2,s3,s4,s5,s6,s7),group),
                new Lesson(3, "Theme_3", List.of(s1,s2,s3,s4),group),
                new Lesson(4, "Theme_4", List.of(s1,s2,s3,s7),group),
                new Lesson(5, "Theme_5", List.of(s1,s2,s6,s7),group),
                new Lesson(6, "Theme_6", List.of(s1, s6,s7),group)
        );

        System.out.println(lessons);
        System.out.println(getLessonsByNumberOfMissingStudents(lessons,2));
        System.out.println(getListOfMissingStudents(lessons));

    }

    public static List<Lesson> getLessonsByNumberOfMissingStudents(List<Lesson> lessons, int limit){
        ArrayList<Lesson> result = new ArrayList<>();
        for (Lesson lesson:lessons){
            if(lesson.getNumberOfAbsentStudents()>limit){
                result.add(lesson);
            }
        }
        return result;
    }

    public static List<Student> getListOfMissingStudents(List<Lesson> lessons){
        Map<Student,Integer> map = new HashMap<>();

        for (Lesson lesson:lessons){
            for(Student student:lesson.getAbsentStudents()){
                map.put(student,map.getOrDefault(student,0)+1);
            }
        }
        Comparator<Map.Entry<Student, Integer>> comparator = new Comparator<>() {
            @Override
            public int compare(Map.Entry<Student, Integer> o1, Map.Entry<Student, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        };
        ArrayList<Student> result = new ArrayList<>();

        ArrayList<Map.Entry<Student, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(comparator);

        for (var e:list){
            result.add(e.getKey());
        }
        //System.out.println(map);
        return result;
    }



    public static List<Student> getListOfMissingStudents(List<Lesson> lessons, Group group){
        List<Student> result = group.getStudents();
        Comparator<Student> comparator= new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getCounterMissingLesson()-o1.getCounterMissingLesson();
            }
        };
        result.sort(comparator);
        return result;
    }




}