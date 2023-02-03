import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MainTest {

    @Test
    @DisplayName("homeWorkListTest = лист сортиировка по домашки")
    void homeWorkList(){
        List<Student>testList=List.of(
                new Student("Alex", 5),
                new Student("Wanja", 2),
                new Student("Alla", 3),
                new Student("Wasja", 2)
        );
        List<Student>actualList=Main.homeWorkList(testList);
        List<Student> expected=List.of(
                new Student("Alex", 5),
                new Student("Alla", 3),
                new Student("Wasja", 2),
                new Student("Wanja", 2)
        );
        Assertions.assertEquals(expected,  actualList);

    }
}