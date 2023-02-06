import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Temp<T> {

    public  boolean checkCycling(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size() || list1.isEmpty()) return false;
        Queue<T> deque1= new LinkedList<>(list1);
        Queue<T> deque2= new LinkedList<>(list2);

        for (int i = 0; i < deque1.size() ; i++) {
            if(deque1.equals(deque2)) return true;
            deque2.offer(deque2.poll());
        }


        return false;
    }
}
