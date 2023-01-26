import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("qwer",4);
        map.put("qwerqw",6);
        map.put("r",1);
        map.put("rtyt",4);

        System.out.println(map);
        Integer r = map.get("r");

        Set<String> keys = map.keySet();/// set of Keys
        for (String str: keys){
            System.out.println(str +"=" +map.get(str));
        }


    }
}