public class Main {
    public static void main(String[] args) {

        MyDate d1=new MyDate(10,11,2000);
        Student student1= new Student(1,"Jack", d1);

        //MyDate d2= new MyDate(2,4,2003);
        Student student2 = new Student(2,"Nick", new MyDate(2,4,2003));

        //student2.getBirthday().setDay(16);

        Student[] students = {student1,
                              student2,
                              new Student(3,"Olga", new MyDate(16,1,2005))
                            };

        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }

        System.out.println("-----------------------------------");
        students[0].getBirthday().setDay(17);
        System.out.println(student1);


    }
}