/*
1. Дан список Account{Person person, String iban, double balance}.
Необходимо сформировать Map, где ключом будет Person, а значением список его счетов.
2. Дан список Person(name,age) необходимо написать метод, который возвращает Map<Person,Integer>,
где ключ это сам Person, а значение – сколько раз он встретился в списке.
3. Допустим, Вы пишите программу для отображения статистики по играм НХЛ (привет Алексею 😀 ).
Допустим, у вас есть объект GameInfo {String team1, String team2, int goalsTeam1, int goalsTeam2}
(соответственно, goalsTeam1 – количество голов забитых командой Team1).
Естественно дан список таких объектов.
Необходимо получить Map, где ключом будет название команды, а значением, количество забитых голов.
*/
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jack", 33);
        Person p2 = new Person("Ann", 24);
        Person p3 = new Person("Mike", 19);

        //----------------- Задача 1 -----------------
        List<Account> accounts = List.of(
                new Account(p1, "DE01", 150.34),
                new Account(p2, "DE02", 7692.54),
                new Account(p1, "DE06", 450.42),
                new Account(p3, "DE14", 2450.59),
                new Account(p1, "DE11", 194.39),
                new Account(p3, "DE08", 765.23),
                new Account(p1, "DE23", 1656.10)
        );

        Map<Person, List<String>> map1 = accounts.stream()
                .collect(Collectors.groupingBy(Account::getPerson, Collectors.mapping(Account::getIban, Collectors.toList())));
        System.out.println(map1);

        //----------------- Задача 1 ----------------- (2й вариант)
        Map<Person, String> map2 = accounts.stream()
                .collect(Collectors.toMap(Account::getPerson, Account::getIban, (iban1, iban2) -> (iban1 + "|" + iban2)));
        System.out.println(map2);

        //----------------- Задача 2 -----------------
        System.out.println(personsCount(List.of(p1, p1, p1, p1, p1, p1, p2, p2, p2, p3)));

        //----------------- Задача 3 -----------------
        // (не корректно работает, если одна и таже команда была в поле team1 и team2)
        List<GameInfo> gamesList = List.of(
                new GameInfo("Boston", "Florida", 6, 8),
                new GameInfo("Seattle", "Colorado", 1, 4),
                new GameInfo("Edmonton", "Florida", 4, 3),
                new GameInfo("Colorado", "Carolina", 5, 7),
                new GameInfo("Edmonton", "Los Angeles", 6, 2)
        );

        Map<String, Integer> team1GoalsMap = gamesList.stream()
                .collect(Collectors.toMap(GameInfo::getTeam1, GameInfo::getGoalsTeam1, Integer::sum));
        Map<String, Integer> team2GoalsMap = gamesList.stream()
                .collect(Collectors.toMap(GameInfo::getTeam2, GameInfo::getGoalsTeam2, Integer::sum));

        Map<String, Integer> allTeamsGoals = new HashMap<>();
        allTeamsGoals.putAll(team1GoalsMap);
        allTeamsGoals.putAll(team2GoalsMap);

        System.out.println(allTeamsGoals);

        //----------------- Задача 3 ----------------- (без стримов, с помощью merge)

        Map<String, Integer> allTeamsGoals2 = new HashMap<>();
        for (GameInfo game : gamesList) {
            allTeamsGoals2.merge(game.getTeam1(), game.getGoalsTeam1(), Integer::sum);
            allTeamsGoals2.merge(game.getTeam2(), game.getGoalsTeam2(), Integer::sum);
        }

        System.out.println("с помощью merge(): " + allTeamsGoals2);
    }

    public static Map<Person, Integer> personsCount(List<Person> personList) {
        return personList.stream()
                .collect(Collectors.groupingBy(person -> person, Collectors.summingInt(person -> 1)));
    }
}