public class Messenger {
    private DeliveryService deliveryService;

    public Messenger(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void sendMessage(String msg){
        System.out.println("Send new message: " + msg);
        System.out.println("start sending");
        deliveryService.deliveryMessage();
        System.out.println("ok");


    }
}
