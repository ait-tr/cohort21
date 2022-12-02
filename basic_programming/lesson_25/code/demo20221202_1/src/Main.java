public class Main {
    public static void main(String[] args) {
       int a=10;
       int b;
       b=a;

       Person p= new Person("Jack");
       p.getName();
       Person p1 = new Person("Oleg");
       //p1=p;
       //--------------
        System.out.println(p);
        System.out.println(p1);
        p.setName("John");
        System.out.println(p);
        System.out.println(p1);
        qwe(p1);
        System.out.println(p1);

    }

    public static void qwe1(int a){
        a=100;
    }
    public static void qwe(Person p){
        p.setName("Nick");
    }

}