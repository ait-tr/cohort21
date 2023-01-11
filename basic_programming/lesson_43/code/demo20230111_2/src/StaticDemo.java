public class StaticDemo {
    public int nonStaticField;
    public  static  int staticField;


    public static void staticMethod(){
        System.out.println(" StaticDemo: staticMethod");
    }


    public  void nonStaticMethod(){
        System.out.println(" StaticDemo: nonStaticMethod");
    }

    @Override
    public String toString() {
        return "StaticDemo{" +
                "nonStaticField=" + nonStaticField +
                "  staticField=" + staticField +
                '}';
    }
}
