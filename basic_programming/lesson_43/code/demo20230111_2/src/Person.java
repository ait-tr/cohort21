public class Person {
    private static int count=0;
    private String name;
    private int number;

    public Person(String name) {
        this.name = name;
        this.number=++count;
    }

    @Override
    public String toString() {
        return number+". "+name;
    }
}
