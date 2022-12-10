import java.util.Scanner;

public class App {
    private NumbersProcessing processing;

    public App(NumbersProcessing processing) {
        this.processing = processing;
    }

    public void userAction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: 0. exit  1.sum  2.average or num for find");
        int choice=scanner.nextInt();

        switch (choice){
            case 0: return;
            case 1: sum(); break;
            case 2: avg(); break;
            default: find(choice);
        }

    }

    private void avg() {
        System.out.println("The average is "+processing.avg());
    }

    private void sum() {
        System.out.println("The sum is "+ processing.sum());
    }
    private void find(int num){
        String msg= num + (processing.find(num)?" найдено ":"не найдено");
        System.out.println(msg);
    }

}
