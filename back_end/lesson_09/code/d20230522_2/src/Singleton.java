public class Singleton {
    private static Singleton INSTANCE;


    private Singleton(){

    }

    static public Singleton getINSTANCE(){
        if (INSTANCE==null) {
            INSTANCE=new Singleton();
        }
        return INSTANCE;
    }

}
