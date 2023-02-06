import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


//PriorityQueue
public class Main {
    public static void main(String[] args) {

        // Очередь будет обрабатываться в следующем порядке: сначала короткие строки,
        // если длинна равна, то по алфавиту и только затем в порядке очереди.
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length()) return o1.length()-o2.length();
                return o1.compareTo(o2);
            }
        });

        queue.offer("nnn");
        queue.offer("a");
        queue.offer("jjjjj");
        queue.offer("bbbbb");
        queue.offer("kkkkkkk");

        System.out.println(queue);

        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------");

        while (queue.size()>0){
            System.out.println(queue.poll());
        }





    }
}