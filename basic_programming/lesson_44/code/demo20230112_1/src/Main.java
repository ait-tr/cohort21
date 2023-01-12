import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "jack";
        String s2 = "john";
        String s3 = "Nick";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);
        System.out.println("---------------------------------------------------");
        System.out.println(listHandler(list, new WordTransformerAddRoundBrackets()));
        System.out.println(listHandler(list, new WordTransformerAddSquareBrackets()));
        List<String> strings = listHandler(list, new WordTransformerToUpperCase());
        System.out.println(listHandler(strings, new WordTransformerAddRoundBrackets()));

        WordTransformer wt= new WordTransformerAddSquareBrackets();
        WordTransformerAddRoundBrackets wt2= new WordTransformerAddRoundBrackets();

        System.out.println(listHandler(list, new Person("qw","qw1",3)));



    }



    public static List<String> listHandler(List<String> list, WordTransformer obj) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resultList.add(obj.transform(list.get(i)));
        }
        return resultList;
    }



}