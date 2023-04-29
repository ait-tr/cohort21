/*
Дан список Programmer(String name, String city, List<Task>  tasks).
Каждый программист  имеет список задач
Task (int Number, String description, String status, int daysInProcessing) .
Используя Stream сформировать лист из 5 задач которые дольше всего находятся в работе.

 */
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Programmer> programmers = List.of(
                new Programmer("Pr.1", "Berlin", List.of(new Task(8, "testing", "in process", 2 ))),
                new Programmer("Pr.2", "Oslo", List.of(new Task(3, "tests coding", "finished", 5 ))),
                new Programmer("Pr.3", "Munich", List.of(new Task(1, "app develop", "in process", 30 ))),
                new Programmer("Pr.4", "Berlin", List.of(new Task(2, "updating", "finished", 2 ))),
                new Programmer("Pr.5", "Dubai", List.of(new Task(4, "data analise", "finished", 7 ))),
                new Programmer("Pr.6", "Hamburg", List.of(new Task(5, "visualisation", "in process", 15 ))),
                new Programmer("Pr.7", "Tallinn", List.of(new Task(6, "testing", "failed", 9 )))

        );

        Stream<Programmer> berlin = programmers.stream().filter(programmer -> programmer.getCity().equals("Berlin"));

        berlin.count();

        //berlin.sorted().limit(1).forEach(s-> System.out.println()); // IllegalStateException в этом стриме уже исполнен терминальный оператор в 29 строке


        List res = programmers.stream()
                .flatMap(programmer -> programmer.getTasks().stream())
                /*
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing)
                        .reversed())
                 */

                .sorted(Comparator.comparingInt((Task t)->t.getDaysInProcessing())
                        .reversed())
                .filter(t-> t.getDaysInProcessing()>0)
                .sorted((t1,t2)->t2.getDaysInProcessing()-t1.getDaysInProcessing())
                .limit(5)
                .collect(Collectors.toList());

        res.forEach(System.out::println);
        //res.forEach((s)-> System.out.println(s));

        int a=10;
        mm(a);   // Integer.valueOf(a)
    }

    public static   void mm(Integer i){

    }

}