import java.util.Objects;

public class Car {

    private  String model;
    private String number;
    private int yearOfRelease;

    public Car(String model, String number, int yearOfRelease) {
        this.model = model;
        this.number = number;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfRelease == car.yearOfRelease && Objects.equals(model, car.model) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, yearOfRelease);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }
}
