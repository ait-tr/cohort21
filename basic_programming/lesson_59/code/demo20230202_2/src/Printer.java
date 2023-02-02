import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Printer {
    private String msg;

    public Printer(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void print(){
        System.out.println(msg);
    }

    public static void main(String[] args) {

        Map<String, Map<Integer, List<Map<String, Set<String>>>>> map = new HashMap<>();
        var entries
                = map.entrySet();
        for (var k:entries){}

        Printer printer = new Printer("Hello");
        printer.print();

        Printer extraPrinter = new Printer("Error"){ //Printer$1 extends Printer

            @Override
            public void print() {
                super.print();
                System.out.println(" (Override)");
            }

            void printMsgAsError(){
                System.err.println(super.getMsg());
            }
        };
        extraPrinter.print();
        //extraPrinter.printMsgAsError();
        System.out.println(extraPrinter.getClass());

    }
}
