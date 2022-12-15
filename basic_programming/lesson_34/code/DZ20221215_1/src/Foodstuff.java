package HW221214;

public class Foodstuff extends Product {
    int storageLife;

    public Foodstuff(int articleNumber, String title, double basePrice, int storageLife) {
        super(articleNumber, title, basePrice);
        this.storageLife = storageLife;
    }

    public void checkDiscount() {
        if (storageLife < 2) {
            discount = 30;
        } else {
            discount = 0;
        }
    }
}
