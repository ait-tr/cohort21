import java.util.Scanner;

public class InputNumbers {
    int qwe;
    /*
    //final - фиксирует значение константной переменной,
    и в дальнейшем система не позволит поменять значение LIMIT на другое значение
     */

    private final String MSG="[%d] input integer or 0 to exit %n";

    public NumbersProcessing getNumbers(){
        Scanner scanner=new Scanner(System.in);
        NumbersProcessing res = new NumbersProcessing();
        int num;
        int counter = 1;
         do{
            System.out.printf(MSG,counter++);
            num = scanner.nextInt();
            if(num!=0){
                res.add(num);
            }
        }while (num!=0);
        return res;
    }
}
