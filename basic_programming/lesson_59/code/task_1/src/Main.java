/*
Дан список машинн (нмарка, год выпуска, пробег, цена) Необходимо получить:
1) список машин старше определенного года
2) список машин с моделью на букву
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> list = List.of(
                new Car("Audi", 2012, 35_000, 12_000),
                new Car("BMW", 2016, 85_500, 8_000),
                new Car("Opel", 2020, 11_800, 20_500),
                new Car("Mercedes", 2022, 5_000, 120_000)
        );

        System.out.println(getNewListOfCars(list, new MyPredicateByYear(2020)));

    }

    public static List<Car> listOfCarsByYear(List<Car> list, int year) {
        List<Car> result = new ArrayList<>();
        for (Car car : list) {
            if (car.getYear() <= year) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> listOfCarsByLetter(List<Car> list, char letter) {
        List<Car> result = new ArrayList<>();
        for (Car car : list) {
            if (car.getModel().charAt(0) == letter) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> getNewListOfCars(List<Car> list, MyPredicate myPredicate) {
        List<Car> result = new ArrayList<>();
        for (Car car : list) {
            if (myPredicate.test(car)) {
                result.add(car);
            }
        }
        return result;
    }

}