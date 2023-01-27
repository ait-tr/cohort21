import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    public void isResultCorrectWithDuplicate() {
        List<Panda> listOfPanda = new ArrayList<>();
        listOfPanda.add(new Panda("Glasha", true));
        listOfPanda.add(new Panda("Rosa", true));
        listOfPanda.add(new Panda("Klusha", true));
        listOfPanda.add(new Panda("Klusha", true));
        listOfPanda.add(new Panda("Klusha", true));
        listOfPanda.add(new Panda("Olga", false));
        listOfPanda.add(new Panda("Olga", false));

        Map<Panda, Boolean> expectedMap = new HashMap<>();
        expectedMap.put(new Panda("Glasha", true), false);
        expectedMap.put(new Panda("Rosa", true), false);
        expectedMap.put(new Panda("Klusha", true), true);
        expectedMap.put(new Panda("Olga", false), true);

        boolean result = Main.checkedPandas(listOfPanda).equals(expectedMap);
        Assertions.assertTrue(result);
    }

    @Test
    public void isResultCorrectWithoutDuplicate() {
        List<Panda> listOfPanda = new ArrayList<>();
        listOfPanda.add(new Panda("Glasha", true));
        listOfPanda.add(new Panda("Rosa", true));
        listOfPanda.add(new Panda("Klusha", true));
        listOfPanda.add(new Panda("Olga", false));

        Map<Panda, Boolean> expectedMap = new HashMap<>();
        expectedMap.put(new Panda("Glasha", true), false);
        expectedMap.put(new Panda("Rosa", true), false);
        expectedMap.put(new Panda("Klusha", true), false);
        expectedMap.put(new Panda("Olga", false), false);

        boolean result = Main.checkedPandas(listOfPanda).equals(expectedMap);
        Assertions.assertTrue(result);
    }
}
