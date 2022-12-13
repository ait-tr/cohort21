public class JavaProgrammer extends Programmer{
    public JavaProgrammer(String name, int salary) {
        super(name, salary);
    }
    @Override
    public void doWork(){
        System.out.printf("I am Java programmer %s. I write backend %n", getName());
    }


    public  void  java(){

        System.out.println("Java Programmer: Java");
    }


}
