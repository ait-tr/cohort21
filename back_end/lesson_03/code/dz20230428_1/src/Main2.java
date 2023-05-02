/*
Дана строка вида ключ1:значение1;ключ2:значение2;ключ1:значение2;ключ3:значение1 ..... Написать метод, который возвращает последнее значение заданного ключа.
Например: "Jack:room 10;Nick:room 20;Jack:room 1;Mike:room3", "Jack" -> "room 1"
Если в строке нет заданного ключа возвращается пустая строка.

 */

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

    }

    public static String valueFromString(String string, String key) {
        if(string==null || key==null) return "";
        return Arrays.stream(string.split(";"))
                .filter(s -> s.startsWith(key + ":"))
                .reduce((acc, s) -> s.substring(s.indexOf(':') + 1))
                .orElse("");
    }

}