public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1,"Jack", 20);
        Person p2 = new Person(2,"John");
        //Person p3 = new Person();  //!!!Error

        System.out.println(p1);
        System.out.println(p2);
    }
}