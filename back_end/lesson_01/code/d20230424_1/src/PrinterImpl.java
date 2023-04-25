public class PrinterImpl implements Printer{
    @Override
    public void print(String msg) {
        System.out.println("Реализация принетера в классе " );
        System.out.println(msg);
    }
}
