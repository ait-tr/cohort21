public class Car {


    private String model;
    private int price;
    private String engineType;
    private final int hash;


    public Car(String model, int price, String engineType) {
        this.model = model;
        this.price = price;
        this.engineType = engineType;
        hash=calcHashCode();

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (getPrice() != car.getPrice()) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        return getEngineType() != null ? getEngineType().equals(car.getEngineType()) : car.getEngineType() == null;
    }


    private int calcHashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + getPrice();
        result = 31 * result + (getEngineType() != null ? getEngineType().hashCode() : 0);
        return result;
    }

    @Override
    public int hashCode() {
        return hash;
    }

}


