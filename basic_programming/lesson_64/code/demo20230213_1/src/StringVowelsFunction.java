import java.util.List;

public class StringVowelsFunction implements StringToIntFunction{
    private List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
    @Override
    public int transform(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) counter++;
        }
        return counter;
    }
}
