import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<String> listOfString= List.of("Hello","World","3","34");

        System.out.println(stringToInteger(listOfString));

    }
    public static List<Integer> stringToInteger(List<String> listOfString){
        List<Integer> vowelList = new ArrayList<>();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        for (String s : listOfString) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;
    }








}