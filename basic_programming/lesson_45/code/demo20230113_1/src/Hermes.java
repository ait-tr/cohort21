public class Hermes implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Send by Hermes");
    }

    @Override
    public String name() {
        return "Hermes";
    }
}
