public class Main2 {
    public static void main(String[] args) {
        Programmer p = new Programmer("Jack",10);
        QAEngineer q = new QAEngineer("Jack",10);

        Employee e = new Programmer("Nick",10);

        Firma f = new Firma();
        System.out.println(f.toString());

    }
}
