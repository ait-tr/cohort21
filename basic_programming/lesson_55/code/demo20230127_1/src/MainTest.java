import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class MainTest {

    @Test
    @DisplayName("MAP should return value \"HiThere\"")
    public void concatKeys() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Hi");
        hashMap.put("b", "There");
        Main.concatKeys(hashMap);
        String actualResult = hashMap.get("ab");
        String expectedResult = "HiThere";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("MAP doesn't contain key a or b")
    public void concatKeysMissedAB() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Hi");
        Main.concatKeys(hashMap);
        boolean actualResult = hashMap.containsKey("ab");
        Assertions.assertFalse(actualResult);
    }

    @Test
    @DisplayName("MAP contain value null")
    public void concatKeysNullValue() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", null);
        hashMap.put("b", "Bobr");
        Main.concatKeys(hashMap);

        String actualResult = hashMap.get("ab");
        String expectedResult = "nullBobr";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
