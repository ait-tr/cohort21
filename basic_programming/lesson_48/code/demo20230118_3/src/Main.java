import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int index = -4;
        try {
            System.out.println(div(a,b));
        } catch (Exception e){
            System.out.println("на ноль делить нельзя!");
            e.printStackTrace();
        }
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        String s;
        try {
            s = list.get(index);
        } catch (Exception e ){

            s="";
        }
        System.out.println(s);
    }

    public static double div(int a, int b){

        double res;
        res = a/b;
        return res;
    }


}