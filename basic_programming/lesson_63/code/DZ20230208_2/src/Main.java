/*
Предположим у нас есть класс Task{int num, String title, String priority}.
Поле priority может принимать следующие значения: “high”  “low”  “the boss said urgently”.
Вам необходимо объединить задачи в очередь, так и написать метод getTask,
чтобы  программист забирал задачи в порядке очереди но, в первую очередь,
задачи  “the boss said urgently”, потом “high”, потом “low”.
При этом важно, если есть несколько задач  например, “boss said urgently”
они решаются в порядке очереди.
 */
public class Main {
    public static void main(String[] args) {
        TasksQueue tasksQueue=new TasksQueue();
        tasksQueue.addTask(new Task("task_1","low"));
        tasksQueue.addTask(new Task("task_2","high"));
        tasksQueue.addTask(new Task("task_3","boss said urgently"));
        tasksQueue.addTask(new Task("task_4","boss said urgently"));
        tasksQueue.addTask(new Task("task_5","low"));
        tasksQueue.addTask(new Task("task_6","high"));
        tasksQueue.addTask(new Task("task_7","high!!!"));

        System.out.println(tasksQueue);
        method(Priority.HIGH);
        method(Priority.LOW);

    }

    public static void method(Priority priority){
        System.out.println(priority.name());
    }
}