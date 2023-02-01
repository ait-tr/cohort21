import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopWords {

    public static List<String> getTopWords(List<String> text, int limit) {
        List<String> words = textToWordsList(text);
        Map<String, Integer> wordCount = getFrequencyMap(words);
        List<String> topWords = getTopWordsList(wordCount, limit);

        return topWords;
    }

    private static List<String> getTopWordsList(Map<String, Integer> wordCount, int limit) {

        Comparator<Map.Entry<String, Integer>> comparatorByValue
                = new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        };
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        Collections.sort(sortedWords, comparatorByValue);

        List<String> topWords = new ArrayList<>();
        for (int i = 0; i < limit && i < sortedWords.size(); i++) {
            topWords.add(sortedWords.get(i).getKey());
        }
        return topWords;
    }

    public static List<String> textToWordsList(List<String> text) {
        List<String> words = new ArrayList<>();
        for (String line : text) {

            String[] split = line.split(" ");
            for (String word : split) {
                words.add(word);
            }
        }
        return words;
    }

    public static Map<String, Integer> getFrequencyMap(List<String> words){
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

}
