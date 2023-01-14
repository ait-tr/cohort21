public class Owl implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Привет Гарри Поттер");
    }

    @Override
    public String name() {
        return "сова";
    }
}
