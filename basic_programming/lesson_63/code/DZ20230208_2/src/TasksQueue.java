import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class TasksQueue {

    private PriorityQueue<Task> queue = new PriorityQueue<>(Task.getComparatorByPriority()
            .thenComparing(Task.getComparatorByNum()));

    public void addTask(Task task){
        queue.offer(task);
    }
    public Task getTask(Task task){
        if(!queue.isEmpty()){
            return queue.poll();
        }
        return null;
    }

    @Override
    public String toString() {
        String res="";
        ArrayList<Task> list = new ArrayList<>();
        while(!queue.isEmpty()){
            Task temp = queue.poll();
            list.add(temp);
        }
        queue.addAll(list);
         return list.toString();
    }
}
