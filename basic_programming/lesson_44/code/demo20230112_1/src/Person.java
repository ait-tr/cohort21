public class Person implements WordTransformer {
    private String name;
    private String name2;
    private int age;

    public Person(String name, String name2, int age) {
        this.name = name;
        this.name2 = name2;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String transform(String str) {
        return str+" "+name;
    }
}
