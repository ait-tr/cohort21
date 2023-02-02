import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Deque<String> str = new LinkedList<>();

        strings.add("aaaaaaaaaaa");
        strings.add("abbb");
        strings.add("ddddddd");
        strings.add("aab");

        strings.sort(
                new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length()-o2.length();
                    }
                }
        );

        System.out.println(strings);


    }
}

