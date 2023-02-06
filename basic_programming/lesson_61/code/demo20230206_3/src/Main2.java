import java.util.Comparator;
import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        // Очередь будет обрабатываться в следующем порядке: сначала строки
        // начинающиеся на "vip_", затем в порядке очереди.
        PriorityQueue<String> queue2 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.startsWith("vip_") && o2.startsWith("vip_")) {
                    return 0;
                } else if (o1.startsWith("vip_")){
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        queue2.offer("John");
        queue2.offer("Jack");
        queue2.offer("vip_ Ann");
        queue2.offer("Nick");
        queue2.offer("vip_ Marry");

        while (queue2.size()>0){
            System.out.println(queue2.poll());
        }
    }
}
