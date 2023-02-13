import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> listOfString= List.of("Hello","World","3","34");

        System.out.println(stringToInteger(listOfString));

    }
    public static List<Integer> stringToInteger(List<String> listOfString){
        List<Integer> listOfInteger= new ArrayList<>();

        for (String string:listOfString) {
            listOfInteger.add(string.length());
        }
        return listOfInteger;

    }

    public static List<Integer> countVowels(List<String> stringList) {
        List<Integer> vowelList = new ArrayList<>();
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        for (String s : stringList) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;
    }


    public static List<Integer> countVowels2(List<String> stringList) {
        List<Integer> vowelList = new ArrayList<>();
        String vowels = "aeiou";
        for (String s : stringList) {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.indexOf((int)s.charAt(i))>0) counter++;
            }
            vowelList.add(counter);
        }
        return vowelList;
    }



}