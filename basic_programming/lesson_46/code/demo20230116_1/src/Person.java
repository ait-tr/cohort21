public class Person {
    private String name;
    private  Person father;

    public Person(String name, Person father) {
        this.name = name;
        this.father = father;
    }

    public static void main(String[] args) {
        Person adam = new Person("Adam", null);
        Person jack = new Person("Jack", adam);
    }

}
