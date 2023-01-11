public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person(String fName, String lName, int age) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String initialsName() {
        return fName.charAt(0) + ".";
    }

    public static  String initialsName(String name) {
        return name.charAt(0) + ".";
    }


    @Override
    public String toString() {
        return String.format("(%s ,%s, %d)", fName, initialsName(), age);
    }
}
