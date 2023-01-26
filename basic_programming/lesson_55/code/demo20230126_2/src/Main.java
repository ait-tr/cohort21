/* Дано 2 листа. Сформировать лист из элементов, которые есть и в первом и во втором листе.
        ["1","2","3"]
        ["0","2","6", "1"]   -> ["1","2"]

 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
       List<String> list1 = List.of("Jack","Nick","Ann","Lena", "Lena");
       List<String> list2 = List.of( "John","Nick","Lena");
        List<String> intersection = getIntersection(list1, list2);

        Iterator<String> iterator = intersection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        ListIterator<String> stringListIterator = intersection.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

    }




   public static List<String> getIntersection(List<String> list1, List<String> list2){

        HashSet<String> set = new HashSet<>(list1);
        set.retainAll(new HashSet<>(list2));
        return new ArrayList<>(set);
   }

}