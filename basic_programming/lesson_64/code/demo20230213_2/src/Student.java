public class Student {
    private String name;
    private int age;
    private int quantityOfMissedClasses;

    public Student(String name, int age, int quantityOfMissedClasses) {
        this.name = name;
        this.age = age;
        this.quantityOfMissedClasses = quantityOfMissedClasses;
    }

    @Override
    public String toString() {
        return name + " " + age + " MissedClasses=" + quantityOfMissedClasses;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getQuantityOfMissedClasses() {
        return quantityOfMissedClasses;
    }
}
