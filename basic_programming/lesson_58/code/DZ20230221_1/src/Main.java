/*
Дан List<String> содержащий какой то текст.
Необходимо получить список из 10 самых часто встречающихся слов из этого текста.*

  *В контексте данной задачи все слова разделены 1 пробелом и текст не содержит знаков препинания.
   Для тех, кому чуть сложнее,можете решить используя реальный текст, содержащий знаки препинания.

 */


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of(
                "pаз два три четыре пять",
                "pаз два три четыре пять",
                "pаз два три четыре",
                "pаз два три четыре",
                "pаз два три",
                "pаз два три",
                "pаз два",
                "pаз два",
                "pаз",
                "да нет не зная почему два а не шесть",
                "служили служили да не выслужили"
        );
        System.out.println(TopWords.getFrequencyMap(TopWords.textToWordsList(list)));
        System.out.println("------------------ ");
        System.out.println(TopWords.getTopWords(list,3));
    }
}