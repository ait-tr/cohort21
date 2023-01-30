import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String,Integer> map= new HashMap<>();
        map.put("Jack",20);
        map.put("Nick",20);
        map.put("Ann",20);
        map.put("Lena",20);

        Set<String> keys = map.keySet();
        for (String str: keys){
            System.out.println(str + " " + map.get(str));
        }

        System.out.println("------------------------------------------");

        //  Map.Entry<String, Integer>
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries ){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }





    }
}