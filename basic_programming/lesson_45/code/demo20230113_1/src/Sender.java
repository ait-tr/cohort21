import java.util.Arrays;

public class Sender {
    MailDeliveryService mailDeliveryService;

    public Sender(MailDeliveryService mailDeliveryService) {
        this.mailDeliveryService = mailDeliveryService;
    }

    public static void send(MailDeliveryService mailDeliveryService){
        System.out.printf("Отправляю почту (%s) .......%n", mailDeliveryService.name());
        mailDeliveryService.sendMail();
    }

    public void send(){
        System.out.printf("Отправляю почту (%s) .......%n", mailDeliveryService.name());
        mailDeliveryService.sendMail();
    }



}
