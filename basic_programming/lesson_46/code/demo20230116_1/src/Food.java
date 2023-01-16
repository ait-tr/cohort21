public class Food extends Product{
    private boolean isVegan;


    public Food(String name, double price, String vendorCode, boolean isVegan) {
        super(name, price, vendorCode);
        this.isVegan = isVegan;
    }

    @Override
    public String toString() {
        return super.toString() + " [isVegan=" + isVegan + "]";

    }
}
