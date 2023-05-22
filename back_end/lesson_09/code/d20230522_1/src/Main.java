public class Main {
    public static void main(String[] args) {
        // coupling
        Connection connection = new UdpConnection();
        DeliveryService deliveryService = new MessageDeliveryByNet(connection);
        Messenger messenger = new Messenger(deliveryService);
        messenger.sendMessage("hello message");
    }
}