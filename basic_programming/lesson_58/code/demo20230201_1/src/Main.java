import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Переменная comparatorByAge содержит объект ананимного класса,
        // котопый реализует интерфейс Comparator<Person>
        Comparator<Person> comparatorByAge =new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        };


        Set<Person> set = new TreeSet<>(comparatorByAge);

        // Переменные implementation1 и  implementation1 содержит объект ананимного
        // класса, котопый реализует интерфейс MyInterface()
        MyInterface implementation1= new MyInterface() {
            @Override
            public void print() {
                System.out.println("Hello!");
            }
        };

        MyInterface implementation2 = new MyInterface() {
            public void print() {
                System.out.println("Anonimus");
            }
        };


        // Переменные extraPerson содержит объект ананимного класса,
        // котопый реализует наследует от Person
        Person extraPerson = new Person("Jack",10){ //  new X extends Person
            @Override
            public String getName() {
                return "работае метод getName() " + super.getName();
            }
            public String qweqwe() {
                return "работае метод getName() ";
            }

        };

        Person p1 = new Person();
        System.out.println(p1.getName());

        System.out.println(extraPerson.getName());


    }
}

class XAZ001 implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}

