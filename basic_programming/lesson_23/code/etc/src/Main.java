
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // опрос
        int[] numbers = {1, 23, 32, 9};
        System.out.println(numbers[2]);
        String[] words = {"blasda", "asdas", "asdas"};
        System.out.println(words[1]);
        String word = "John";
        System.out.println(word.charAt(2));
        char[] charArray = {'H', 'e', 'l', 'l'};
        String word2 = new String(charArray); // один способ
        System.out.println(word2);
        String word3 = Arrays.toString(charArray);  // совсем другой метод
        System.out.println(word3);
        String word4 = String.valueOf(charArray);
        System.out.println(word4); // второй способ
        String phrase = "Sun goes down every evening";
        String[] array2 = phrase.split(" "); // разделяем через указанный символ
        System.out.println(Arrays.toString(array2));
        String separator = "-__-";
        String phrase2 = String.join(separator, array2); // метод join от класса стринг
        System.out.println(phrase2);
        // replaceAll
        String phrase3 = phrase2.replaceAll(separator, ":)");
        System.out.println(phrase3);
        // trim удаляет пробельные символы по краям
        String phrase4 = "   John goes to the bar    ";
        String phrase5 = phrase4.trim();
        System.out.println(phrase4);
        System.out.println(phrase5);
        // substring метод для получения части строки
        System.out.println(phrase5.substring(3)); // до конца строки
        // от начального индекса включительно до указанного индекса не включительно
        System.out.println(phrase5.substring(7, 12));
        System.out.println(phrase4.length()); // длина строки
        System.out.println(array2.length);    // длина массива
    }
}