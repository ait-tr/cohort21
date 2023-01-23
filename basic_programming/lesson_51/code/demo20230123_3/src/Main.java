import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();


       Box box = new Box("это строка");
       Box box2 = new Box(2);
       Box box3 = new Box(new Person("Jack"));

        Box[] boxes = {box, box2, box3};
        String s=(String)boxes[0].getValue();

        Box2<String> boxStrings = new Box2<>("qwerty");
        System.out.println(boxStrings);

        Box2<Person> personBox2 = new Box2<>(new Person("qwerty"));
        personBox2.getValue().getName();






    }
}