public class Main {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s4="hello1";
        String s3= new String("hello");
        //s3=s3.intern();

        System.out.println("s1==s2 :" + (s1==s2));
        System.out.println("s1.equals(s2) :" + (s1.equals(s2)));
        System.out.println();
        System.out.println("s1==s3 :" + (s1==s3));
        System.out.println("s1.equals(s3) :" + (s1.equals(s3)));

        System.out.println("-----------------------------------");
        Person p1= new Person("Jack",20);
        Person p2= new Person("Jack",20);
        Person p3= new Person("John",20);

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

    }
}