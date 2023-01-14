/*
Предположим, ваша программа предоставляет пользователю возможность отослать письмо одним из 3 возможных способов: DHL, E-Mail, Owl. Вам необходимо реализовать один общий метод отправки почты, который в качестве параметра получает способ отправки почты. Реализация каждого из способов, должна быть выполнена отдельным методом (каждый метод может просто выводить на экран соответствующее сообщения, например, в случае DHL, что то типа: «кладу письмо в конверт, клею марку, иду на  почту»). Выбор способа отправки определяется пользователем, например через Scanner

 */

public class Main {
    public static void main(String[] args) {


        MailDeliveryService[] services={
                new DHL(1.10),
                new EMail(),
                new Owl(),
                new Hermes()
        };

        Sender defSender = new Sender(services[1]);


        MenuSelectMailService menu = new MenuSelectMailService(services);
        MailDeliveryService mailDeliveryService = menu.select();
        if (mailDeliveryService!=null){ // use static method send()
            Sender.send(mailDeliveryService);
        } else {  // use non static method send()
            defSender.send();
        }
    }
}