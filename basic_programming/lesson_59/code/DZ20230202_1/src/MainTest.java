import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class MainTest {

    @Test
    void listOfAccounts (){
        List<BankAccountWithOwner> list = List.of(
                new BankAccountWithOwner("DE01", new Person("Adam")),
                new BankAccountWithOwner("DE02", new Person("Eve")),
                new BankAccountWithOwner("DE03", new Person("Mark")),
                new BankAccountWithOwner("DE04", new Person("Adam")),
                new BankAccountWithOwner("DE05", new Person("Shilen")),
                new BankAccountWithOwner("DE06", new Person("Adam")),
                new BankAccountWithOwner("DE07", new Person("Shilen"))
        );

        Map<Person, HashSet<String>> actualResult = Main.listOfAccounts(list);

        Map<Person, Set<String>> expectedResult = new HashMap<>();
        Set<String> adamIbans = Set.of("DE01", "DE04", "DE06");
        Set<String> eveIbans = Set.of("DE02");
        Set<String> markIbans = Set.of("DE03");
        Set<String> shilenIbans = Set.of("DE05", "DE07");
        expectedResult.put(new Person("Adam"), adamIbans);
        expectedResult.put(new Person("Eve"), eveIbans);
        expectedResult.put(new Person("Mark"), markIbans);
        expectedResult.put(new Person("Shilen"), shilenIbans);

        Assertions.assertEquals(actualResult, expectedResult);

    }
}
