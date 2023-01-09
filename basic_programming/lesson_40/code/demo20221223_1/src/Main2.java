import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {

        List<Integer> list=null;// = new ArrayList<>();


        System.out.println(list);

        if(list!=null){
            System.out.println(findMaxValue(list));
        }
    }

    public static int findMaxValue(List<Integer> list) {
        if(list==null || list.size()==0){
          /// new Exception
        }

        int res= Integer.MIN_VALUE;
        System.out.println(res);
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
