import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PrinterImpl printer = new PrinterImpl();
        theMethodUsePrinter(printer,"Hello");
        ////////////////////////////////////////////////

        Printer printer1 = (String str) -> {
            System.out.println("Лямбда");
            System.out.println(str);
        };

        theMethodUsePrinter(printer1,"Hello");

        theMethodUsePrinter(str-> System.out.println("str: "+str),"Еще раз");

        theMethodUseConsumer(str-> System.out.println("str: "+str),"Еще раз но уже с Consumer");


        System.out.println("------------------------------------");
        List.of("1","2","3").forEach((s)-> System.out.println(s));

        System.out.println("--------- stream -------------");
        System.out.println(List.of("1","2","3","asf","jjhgfd", "hhk","jjhgfd").stream()
                        .filter((s)->s.length()<=3)
                        .map((s)-> s+"qwertyui")
                        .toList());
    }

    public static void theMethodUsePrinter(Printer printer, String msg){
        printer.print(msg);
    }

    public static void theMethodUseConsumer(Consumer<String> printer, String msg){
        printer.accept(msg);
    }



}