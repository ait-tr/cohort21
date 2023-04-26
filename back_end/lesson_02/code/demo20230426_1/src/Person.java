import java.util.List;

public class Person {
    private String name;
    private int age;

    private List<String> accounts;

    public Person(String name, int age, List<String> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return name + " " + age +  " " + accounts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getAccounts() {
        return accounts;
    }
}
