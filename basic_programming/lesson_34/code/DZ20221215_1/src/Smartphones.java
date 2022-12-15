package HW221214;

public class Smartphones extends Electronics{

    public Smartphones(int articleNumber, String title, double basePrice) {
        super(articleNumber, title, basePrice);
    }

    public void contract() {
        additionalPrice = 50;
        System.out.println("A contract has been signed with GMBH Telecom");
    }

    @Override
    public void sellProduct(int sellCount) {
        if (getCount() >= sellCount) {
            warranty();
            contract();
            cashReceipt(sellCount);
        } else {
            notEnoughProductsInStock();
        }
    }

}
