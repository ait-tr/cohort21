public class Person {
    private String name;
    private int age;
    private int id;


    public Person (int id, String name, int age){
       this.name = name;
       this.age = age;
       this.id=id;
    }
    public Person(int id, String name){
        this.name=name;
        this.id=id;
    }


    public String toString(){
        return name +
                (   age>0 ? " ("+ age+")" :  ""   );
    }

}
