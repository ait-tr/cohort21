import java.util.Objects;

public class Person {
    private String name;
   private int age;
   private int hashcode;



    private  void generateHashCode(){
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        hashcode= result;
    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        generateHashCode();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
