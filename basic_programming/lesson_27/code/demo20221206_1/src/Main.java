public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.add(new Person("Jack",10));
        System.out.println("------------- 1 ---------------");
        System.out.println(people);

        people.add(new Person("John",15));
        System.out.println("------------- 2 ---------------");
        System.out.println(people);

        people.add(new Person("Nick",20));
        System.out.println("------------- 3 ---------------");
        System.out.println(people);


        people.add(new Person("Sten",25));
        System.out.println("------------- 4 ---------------");
        System.out.println(people);

        System.out.println("------------- selectPersonOlderThan ---------------");
        System.out.println(people.selectPersonOlderThan(1));


    }
}