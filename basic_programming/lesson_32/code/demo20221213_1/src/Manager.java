public class Manager extends Employee {
    private  int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " and bonus" +bonus +")";
    }
    @Override
    public void doWork(){
        System.out.printf("I am manager %s. I give tasks %n", getName());
    }

    public void paySalary(){
        super.paySalary();
        System.out.printf("bonus %d %n",bonus);
    }


}
