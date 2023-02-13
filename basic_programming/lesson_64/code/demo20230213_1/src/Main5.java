import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main5 {
    public static void main(String[] args) {

        List<String> listOfString= List.of("Hello","World","123","34", "Java");

        System.out.println(stringToInteger(listOfString, new StringLengthFunction()));
        System.out.println(stringToInteger(listOfString, new StringVowelsFunction()));

        // реализация интерфейса StringToIntFunction с помощью анонимного класса
        StringToIntFunction func = new StringToIntFunction() {
            @Override
            public int transform(String s) {
                return s.length();
            }
        };

        // реализация интерфейса StringToIntFunction с помощью лямбда выражения
        StringToIntFunction stringLengthFunction = (String s) -> {   return s.length();  };

        System.out.println(stringToInteger(listOfString, func ));
        System.out.println(stringToInteger(listOfString, stringLengthFunction ));
        System.out.println(stringToInteger(listOfString,  (String s) -> {   return s.length();} ));


        System.out.println(stringToInteger(listOfString,  (String s) -> {
            List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vowels.contains(s.charAt(i))) counter++;
            }
            return counter;
        } ));

        System.out.println(stringToInteger(listOfString, (String s)->{return s.hashCode();}));


        System.out.println(stringToInteger(listOfString, new StringToIntFunction() {
            @Override
            public int transform(String s) {
                return s.hashCode();
            }
        }));




    }
    public static List<Integer> stringToInteger(List<String> listOfString,StringToIntFunction function ){
        List<Integer> listOfInteger= new ArrayList<>();

        for (String string:listOfString) {
            listOfInteger.add(function.transform(string));
        }
        return listOfInteger;

    }

}