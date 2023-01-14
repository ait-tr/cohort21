public class EMail implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Отправили E-Mail");
    }

    @Override
    public String name() {
        return "E-mail";
    }
}
