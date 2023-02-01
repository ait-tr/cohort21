/*
Есть список машин (номер, модель, год выпуска),
нужно написать метод, которая вернет мапу,
где ключом является "возраст" маашины, а значением список машин этого года.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MainTest {
    @Test
    void listOfCars() {
        List<Car> list = List.of(
                new Car("Audi", "BR87", 2018),
                new Car("Opel", "F01", 2012),
                new Car("BMW", "G12", 2018),
                new Car("Mercedes", "A747", 2015)
        );
        Map<Integer, HashSet<Car>> actualResult = Main.listOfCars(list);

        Map<Integer, HashSet<Car>> expectedResult = new HashMap<>();
        HashSet<Car> cars2018 = new HashSet<>();
        HashSet<Car> cars2012 = new HashSet<>();
        HashSet<Car> cars2015 = new HashSet<>();
        cars2015.add(new Car("Mercedes", "A747", 2015));
        cars2012.add(new Car("Opel", "F01", 2012));
        cars2018.add(new Car("Audi", "BR87", 2018));
        cars2018.add(new Car("BMW", "G12", 2018));
        expectedResult.put(5, cars2018);
        expectedResult.put(11, cars2012);
        expectedResult.put(8, cars2015);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}