import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Main3 {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-5, 2, 3));
        list.add(List.of(-5));
        list.add(List.of(4, 5, 18));
        list.add(List.of(-8,-7,0, 11, 17,22,25));
        list.add(List.of(-17,8, 16,28,30,33));

        System.out.println(marge5(list));
    }


    public static List<Integer> marge5(List<List<Integer>> list){

        PriorityQueue<Node> queue = new PriorityQueue<>();
        List<Integer> res = new ArrayList<>();

        for (List<Integer> integerList : list) {
            Node temp = new Node(integerList);
            if (temp.next()) queue.offer(temp);
        }

        while (queue.size() > 0) {
            Node temp = queue.poll();
            res.add(temp.getValue());
            if (temp.next()) {
                queue.offer(temp);
            }
        }
        return res;
    }
}


class Node implements Comparable<Node> {
    private final Iterator<Integer> iterator;
    private Integer value;

    public Node(List<Integer> list) {
        this.iterator = list.iterator();
    }
    public Integer getValue() {
        return value;
    }
    public boolean next() {
        if (iterator.hasNext()) {
            value = iterator.next();
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int compareTo(Node o) {
        // если null может быть значением и он меньше любого значения
        if (o.value == null) return 1;
        if (this.value == null) return -1;

        return this.value - o.value;
    }
}
