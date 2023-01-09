import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(14);
        list.add(45);
        list.add(16);
        list.add(78);
        list.add(17);
        list.add(234);
        list.add(-34);

        System.out.println("1 задача");
        System.out.println(list);
        System.out.println(findMaxValue(list));
    }


    public static int findMaxValue(List<Integer> list) {
        if(list==null || list.size()==0){
            /// new Exception
        }

        int res= Integer.MIN_VALUE;
        //System.out.println(res);
        for (Integer num : list) {
            if (num != null){
                if (num > res ){
                    res = num;
                }
            }
        }
        return res;
    }

}
