public class DHL implements MailDeliveryService {
    double price;

    public DHL(double price) {
        this.price = price;
    }

    @Override
    public void sendMail() {
        System.out.println("Отправили почту через DHL. Цена: " +price);
    }

    @Override
    public String name() {
        return "DHL";
    }

    @Override
    public String toString() {
        return "DHL";
    }
}
