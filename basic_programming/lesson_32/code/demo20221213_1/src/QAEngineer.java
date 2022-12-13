public class QAEngineer extends Employee {

    public QAEngineer(String name, int salary) {
        super(name,salary);
    }
    public void doWork(){
        System.out.printf("I am QA Engineer %s. I test code %n", super.getName());
    }
}
