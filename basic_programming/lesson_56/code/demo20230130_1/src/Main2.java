import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {


        Car car1= new Car("abc8080", "BMW",2005);
        Car car4= new Car("abc8080", "",1);
        Car car2= new Car("abc9090", "Audi",2016);
        Car car3= new Car("sdf1010", "Lada",2020);

        Person p1 = new Person("Jack", 30);
        Person p2 = new Person("John", 36);
        Person p3 = new Person("Ann", 26);



        Map<Car, Person> map = new HashMap<>();
        map.put(car1, p1);
        map.put(car2,p2);
        System.out.println(map);

        System.out.println(map.containsKey(car4));

    }
}
