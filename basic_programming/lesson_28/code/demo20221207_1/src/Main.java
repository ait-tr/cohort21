/*
#1
Реализовать класс Student  с полями имя, количество пропущенных занятий.  Создать класс Group, который «управляет» массивом студентов. В классе Group реализовать методы: добавить студента в группу, получить список студентов в виде нового объекта Group.
#2*
Добавить в класс Student поле-массив с оценками (double[] rate). Реализовать  в программе возможность получить имя самого успевающего (по среднему балу) студента.
 */
public class Main {
    public static void main(String[] args) {
        Group gr1= new Group();
        Student st1= new Student("Oleg",0);
        gr1.add(new Student("Jack",0));
        gr1.add(new Student("Nick",5));
        gr1.add(new Student("John",2));

        st1.setRate(new double[]{10,9.5,7.3});
        System.out.println(gr1);

        System.out.println("-------------------------------------");
        Group gr2= gr1.getStudentList();
        System.out.println(gr2);
        System.out.println("-------------------------------------");
    }
}