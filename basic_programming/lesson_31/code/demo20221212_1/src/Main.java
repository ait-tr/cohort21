public class Main {
    public static void main(String[] args) {
        Programmer programmer1= new Programmer("Jack", 4000);
        Programmer programmer2= new Programmer("John", 4500);
        QAEngineer qaEngineer1= new QAEngineer("Nick",4300);
        QAEngineer qaEngineer2= new QAEngineer("Lena",4600);
        Manager manager1= new Manager("Klod",4000,2000);

        Employee[] employees = {programmer1,programmer2,qaEngineer1,qaEngineer2,manager1, new Lazzy("llll",10000)};


        for (int i=0; i< employees.length; i++) {
            employees[i].doWork();
        }


        for (int i=0; i< employees.length; i++) {
            System.out.println(employees[i]);
        }

        for (int i=0; i< employees.length; i++) {
            employees[i].paySalary();
        }
    }
}