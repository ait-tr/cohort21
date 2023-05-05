import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 33);
        Person p2 = new Person("Ann", 24);
        Person p3 = new Person("Mike", 19);


        List<Account> accounts = List.of(
                new Account(p1, "DE01", 150.34),
                new Account(p2, "DE02", 7692.54),
                new Account(p1, "DE06", 450.42),
                new Account(p3, "DE14", 2450.59),
                new Account(p1, "DE11", 194.39),
                new Account(p3, "DE08", 765.23),
                new Account(p1, "DE23", 1656.10)
        );

        /// 1.

        Map<Person, List<Account>> collect = accounts.stream().collect(Collectors.groupingBy(a -> a.getPerson()));
        System.out.println(collect);

        Map<Person, List<Account>> map = accounts.stream()
                .collect(Collectors.toMap(o -> o.getPerson(),
                        o -> {
                            List<Account> acc = new ArrayList<>();
                            acc.add(o);
                            return acc;
                        },
                        (o1, o2) -> {
                            o1.addAll(o2);
                            return o1;
                        }));

        System.out.println(map);

        //2
        List<Person> persons = List.of(p1, p1, p1, p1, p1, p1, p2, p2, p2, p3);
        Map<Person, Integer> collect1 = persons.stream()
                .collect(Collectors.toMap(person -> person, p -> 1,  Integer::sum));
        System.out.println(collect1);

        //v2
        Map<Person, Long> persons2 = persons.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(persons2);


        Map<Person, Long> personsw = Stream.of(
                        new Person("Кирилл", 35),
                        new Person("Кирилл", 35),
                        new Person("Толя", 16),
                        new Person("Толя", 16),
                        new Person("Виктор", 44),
                        new Person("Виктор", 60),
                        new Person("Вика", 54)
                )
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(personsw);


        List<GameInfo> gamesList = List.of(
                new GameInfo("Boston", "Florida", 6, 8),
                new GameInfo("Seattle", "Colorado", 1, 4),
                new GameInfo("Edmonton", "Florida", 4, 3),
                new GameInfo("Colorado", "Carolina", 5, 7),
                new GameInfo("Edmonton", "Los Angeles", 6, 2)
        );


        Map<String, Integer> statistic = gamesList.stream()
                .flatMap(gi -> Stream.of(new GameTeamInfo(gi.getTeam1(), gi.getGoalsTeam1()), new GameTeamInfo(gi.getTeam2(), gi.getGoalsTeam2())))
                .collect(Collectors.toMap(gi -> gi.getNameTeam(), gi -> gi.getGoalsTeam(), Integer::sum));
        System.out.println(statistic);
        //{private String nameTeam1; private int goalsTeam1;}


    }
}
