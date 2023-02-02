/*Дан список машинн (нмарка, год выпуска, пробег, цена) Необходимо получить:
1) список машин старше определенного год
2) список машин с моделью на букву
*/

import java.util.Objects;

public class Car {

    private String model;
    private int year;
    private int mileage;
    private double price;

    public Car(String model, int year, int mileage, double price) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && mileage == car.mileage && Double.compare(car.price, price) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, mileage, price);
    }
}
