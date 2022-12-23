import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(new Integer(5));
        list.add(19);
        list.add(3);
        System.out.println(list);
        int i=list.get(0).intValue();
        int sum=0;
        for (Integer num:list){
            sum+=num.intValue();
        }
    }
}