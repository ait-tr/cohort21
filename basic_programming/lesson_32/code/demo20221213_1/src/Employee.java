public abstract class Employee{
    private String name;
    private  int salary;

    public  void java(){
        System.out.println("Employee: java");
    };

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void doWork();



    @Override
    public String toString() {
        return name + "(" +  salary + ")";
    }

    public void paySalary(){
        System.out.printf("%s get salary %d %n",name,salary);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
