public class Main {
    public static void main(String[] args) {
       Singleton singleton1 = Singleton.getINSTANCE();
       Singleton singleton2 = Singleton.getINSTANCE();
        System.out.println(singleton2);
        System.out.println(singleton1);
    }
}