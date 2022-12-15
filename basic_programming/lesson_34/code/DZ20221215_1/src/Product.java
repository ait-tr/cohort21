package HW221214;

public abstract class Product {
    private final int articleNumber;
    private String title;
    private double basePrice;
    protected double additionalPrice;
    protected double discount;
    private double price;
    private int count;

    public Product(int articleNumber, String title, double basePrice) {
        this.articleNumber = articleNumber;
        this.title = title;
        this.basePrice = basePrice;
    }

    public void sellProduct(int sellCount) {
        if (count >= sellCount) {
            cashReceipt(sellCount);
        } else {
            notEnoughProductsInStock();
        }
    }

    public void cashReceipt(int sellCount) {
        System.out.println("=== Cash receipt ===");
        System.out.println("-----" + title + "-----");
        System.out.println("Base price = " + basePrice + " $");
        System.out.println("Additional price = " + additionalPrice + " $");
        if (discount > 0) System.out.println("Discount = " + discount + "%");
        System.out.println("Final price = " + getPrice() + " $");
        System.out.println(sellCount + " " + title + " sold for " + getPrice() * sellCount + " $\n");
        count -= sellCount;
    }

    public double getPrice() {
        calculateFinalPrice();
        return price;
    }

    private void calculateFinalPrice() {
        checkDiscount();
        price = (basePrice + additionalPrice) * (100 - discount) / 100;
    }

    public void checkDiscount() {
        discount = 0;
    }

    public void addCount(int count) {
        this.count += count;
    }

    @Override
    public String toString() {
        return String.format("%10s = %7.2f $.   Available (%d)", title, getPrice(), count);
    }

    public void notEnoughProductsInStock() {
        System.out.println("-------------------------------------------");
        System.out.println("We don't have enough " + title + " in stock");
        System.out.println("-------------------------------------------\n");
    }

    public int getCount() {
        return count;
    }

    public String getTitle() {
        return title;
    }
}
