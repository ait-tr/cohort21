import java.util.*;

public class Main3 {
    public static void main(String[] args) {
         Set<String> set = new HashSet<>(Set.of("str1", "str2", "str3"));
        List<String> list = new ArrayList<>(List.of("str1", "str2","str2", "str4","str2", "str3"));

        /* //java.util.ConcurrentModificationException
         for (String s:list){
             if(s.equals("str2")) {
                 list.remove(s);
             }
         }
*/
        /*
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).equals("str2")){
                list.remove(i--);

            }
        }

         */
        System.out.println(list);
        System.out.println("--------------------------------------------");

         Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equals("str2")){
                iterator.remove();
            }
        };
        System.out.println(list);




    }
}
