import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {

        List<String> listOfString= List.of("Hello","World","3","34");

        System.out.println(stringToInteger(listOfString));

    }
    public static List<Integer> stringToInteger(List<String> listOfString){
        List<Integer> listOfInteger = new ArrayList<>();
        for (String string : listOfString) {
            if (string != "" && string != null) {
                listOfInteger.add(string.split(" ").length);
            } else {
                listOfInteger.add(0);
            }
        }
        return listOfInteger;

    }




}