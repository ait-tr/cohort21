public class Main {
    public static void main(String... args) {
        method("sstr1");
        method("atr1","str2");
        method("atr1","str2","str3","str4","str5");
        method(new String[]{"1","3","4"});

        sum(456,73,87);
        sum(32,8,8,2,1,3,4,2);
    }

    static public void method(String... args){
        for (String s:args){
            System.out.println(s);
        }
    }
    static public void method(String args){
            System.out.println(args);

    }


    static public long sum(int... args ){
        long res=0;
        for (int s:args){
            res+=s;
        }
        return res;
    }


    static public void method1(String[] args){
        for (String s:args){
            System.out.println(s);
        }
    }

}