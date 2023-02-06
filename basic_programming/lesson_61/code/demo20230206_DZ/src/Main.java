/*
Дано два списка Student-ов. Необходимо определить,
является ли один список циклической перестановкой другого.
Например:
list1{s1,s2,s3,s4,s5},  list2{s3,s4,s5,s1,s2} ->true
list1{s1,s2,s3,s4,s5},  list2{s2,s4,s5,s1,s3} ->false
Решить задачу всеми известными вам способами.
*/


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list1 = List.of("s1", "s2", "s3", "s4", "s5");
        List<String> list2 = List.of("s5", "s1", "s2", "s3", "s4"); // true
        List<String> list3 = List.of("s4", "s5", "s1", "s2", "s3"); // true
        List<String> list4 = List.of("s3", "s4", "s5", "s1", "s2"); // true
        List<String> list5 = List.of("s2", "s3", "s4", "s5", "s1"); // true
        List<String> list6 = List.of(); // false
        List<String> list7 = null; // false
        List<String> list8 = List.of("s1", "s2", "s3"); // false
        List<String> list9 = List.of("s2", "s5", "s1", "s4", "s3"); // false

        List<String> list1a = List.of("s1", "s2", "s1", "s4", "s5");
        List<String> list2a = List.of( "s1", "s4", "s5","s1","s2");
        System.out.println("-----should be all TRUE-----");
        System.out.println(checkCycling(list1, list2));
        System.out.println(checkCycling(list1, list3));
        System.out.println(checkCycling(list1, list4));
        System.out.println(checkCycling(list1, list5));
        System.out.println("-----should be all FALSE-----");
        System.out.println(checkCycling(list1, list6));
        System.out.println(checkCycling(list1, list7));
        System.out.println(checkCycling(list1, list8));
        System.out.println(checkCycling(list1, list9));
        System.out.println("------------------");
        //System.out.println(checkCycling(list1a, list2a));
    }

    public static boolean checkCycling(List<String> list1, List<String> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size() || list1.isEmpty()) return false;
        String firstStr = list1.get(0);
        if (!list2.contains(firstStr)) return false;
        int startIndex = list2.indexOf(firstStr);
        for (String s : list1) {
            if (!s.equals(list2.get(startIndex))) return false;
            if (startIndex + 1 == list2.size()) {
                startIndex = 0;
            } else {
                startIndex++;
            }
        }
        return true;
    }
}
