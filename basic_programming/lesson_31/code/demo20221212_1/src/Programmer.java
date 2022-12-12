public class Programmer extends Employee {

    public Programmer(String name, int salary) {
        super(name,salary);
    }


    public void doWork(){
        System.out.printf("I am programmer %s. I write code %n", getName());
    }

}
