import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        method(Priority.HIGH);
        method(Priority.URGENTLY);
        method(Priority.LOW);



        Task task = new Task(1,Priority.LOW);
        System.out.println(task);
        task.getPriority().getPrinter().print();

        //Priority2.HIGH.sendMsg();
        Priority2.URGENTLY.sendMsg();
        System.out.println("----------------------");
        for (var v: Priority.values()){
            System.out.println(v);
        }
        System.out.println("--------------------------------");
        Priority low = Priority.valueOf("LOW1");
        System.out.println(low.getStrValue());

    }

    public static void method(Priority priority){
        System.out.println(priority.name() + "= "+ priority.getValue() +
                " "+ priority.getStrValue());

    }
}