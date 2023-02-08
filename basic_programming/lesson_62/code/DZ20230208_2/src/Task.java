import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Task {
    private static int counter=1;
    private int num;
    private String title;
    private String priority;
    private int priorityValue;

    private static final Map<String,Integer> MAP_OF_PRIORITY= new HashMap<>();
    static  { // блок инициализации статический
        System.out.println("static block");
        MAP_OF_PRIORITY.put("boss said urgently",1);
        MAP_OF_PRIORITY.put("high",2);
        MAP_OF_PRIORITY.put("low",3);
    }

    public Task( String title, String priority) {
        this.num = counter;
        this.title = title;
        this.priority = priority;
        this.priorityValue= MAP_OF_PRIORITY.getOrDefault(priority,100);
        counter++;
    }

    public int getNum() {
        return num;
    }
    public String getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return String.format("%d. %s [%s]",num,title,getPriority());
    }

    public static Comparator<Task> getComparatorByPriority(){
        return new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return o1.priorityValue - o2.priorityValue;
            }
        };
    }

    public static Comparator<Task> getComparatorByNum(){
        return (o1, o2) -> o1.num-o2.num;
    }
}