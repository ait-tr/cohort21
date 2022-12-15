package HW221214;

public class Electronics extends Product {

    private int monthsWarranty = 12;
    public Electronics(int articleNumber, String title, double basePrice) {
        super(articleNumber, title, basePrice);
    }

    public void warranty() {
        System.out.println("Product warranty - " + monthsWarranty + " months");
    }

    @Override
    public void sellProduct(int sellCount) {
        if (getCount() >= sellCount) {
            warranty();
            cashReceipt(sellCount);
        } else {
            notEnoughProductsInStock();
        }
    }
}
