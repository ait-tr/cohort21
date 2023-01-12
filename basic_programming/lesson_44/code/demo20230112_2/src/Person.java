public class Person implements Swimable,Runing{
    private String name;

    public Person(String name) {
        this.name = name;
    }


    public void swim(){
        System.out.println(name + " поплыл");
    }
    public void run(){
        System.out.println(name + " бежит");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
