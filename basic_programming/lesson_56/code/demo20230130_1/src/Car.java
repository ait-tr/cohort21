import java.util.Objects;

public class Car {
    private String number;
    private String model;
    private int age;

    public Car(String number, String model, int age) {
        this.number = number;
        this.model = model;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        return Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }
}
