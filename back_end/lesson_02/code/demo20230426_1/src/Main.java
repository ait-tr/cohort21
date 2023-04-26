import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> ee = List.of("1gsg", "4ss", "6aaa", "2www", "1", "")
                .stream()
                .filter(s->s.length()>10)
                .limit(10)
                .map(s -> {
                    return s.length();
                });
        System.out.println();


        /// flatMap

        List<Person> people = List.of(
                new Person("p1", 13, List.of("acc1", "acc2", "acc3")),
                new Person("p2", 20, List.of("bcc4", "acc5", "bcc6")),
                new Person("p3", 19, List.of("acc9", "bcc8", "acc7")),
                new Person("p4", 6, List.of("acc10", "acc11", "acc13")),
                new Person("p5", 18, List.of("acc456"))
        );

        people.stream()
                .filter(p->p.getAge()>16)
                .filter(p->p.getAccounts().size()>2)
                .flatMap(person -> person.getAccounts().stream())
                .filter(acc->acc.startsWith("b"))

                .forEach(a-> System.out.println(a));

                Stream.concat(List.of(1,3,4).stream(),List.of(6,98,0).stream()); // объединение
        /*
        System.out.println(Stream.iterate(10, s->s+10)
                        .limit(20)
                        .reduce((acc,i)->acc+i));


         */

        System.out.println(Stream.of(1,2,4,5)
                .reduce(100,(acc,i)->acc+i)); // acc=100 i=1
                                            // acc=1  i=2
                                            // acc=3  i=4
        System.out.println(Stream.of("qwe", "qwa",  "uyte")
                .reduce("", (acc, str) -> (str.startsWith("a") ? str : acc)));

        Stream.of("qwe", "qwa",  "uyte").collect(Collectors.toSet());
    }





}