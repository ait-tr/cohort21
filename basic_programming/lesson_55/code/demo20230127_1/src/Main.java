/*
Дана Map<String, String>, если в ней есть ключ "a" и "b",
то нужно создать новый ключ "ab" с суммой значений от ключей a и b.
​
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"a": null, "b": "There"}) → {"ab": "nullThere"}
mapAB({"b": "There"}, {"f": "Yo"}, {"e": "Panda"}, {"d": "Kungfu"},) → ...)
 */

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Nikolay");
        hashMap.put("b", "old");
        hashMap.put("b", "Testmap");
        concatKeys(hashMap);
        System.out.println(hashMap);
    }

    public static void concatKeys(HashMap<String, String> testMap) {
        try {
            if (testMap.containsKey("a") && testMap.containsKey("b")) {
                testMap.put("ab", testMap.get("a") + testMap.get("b"));
            }
        } catch (NullPointerException e) {
            //System.err.println(e.getMessage());
        }
    }
}