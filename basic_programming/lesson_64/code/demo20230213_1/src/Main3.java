import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<String> listOfString= List.of("Hello","World","3","34");

        System.out.println(stringToInteger(listOfString));

    }
    public static List<Integer> stringToInteger(List<String> listOfString){
        List<Integer> vowelList = new ArrayList<>();
        String vowels = "aeiou";
        for (String s : listOfString) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.indexOf((int)s.charAt(i))>0) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;

    }





}