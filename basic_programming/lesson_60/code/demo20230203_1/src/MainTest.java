import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTest {
    @Test
    void optimisedPath() {
        List<String> list = List.of("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST");
        List<String> actualList = Main.optimisedPath(list);
        List<String> expectedList = List.of("WEST");

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    void notOptimisedPath() {
        List<String> list = List.of("NORTH", "WEST", "SOUTH");
        List<String> actualList = Main.optimisedPath(list);
        List<String> expectedList = List.of("NORTH", "WEST", "SOUTH");
        Assertions.assertEquals(expectedList, actualList);
    }
}
