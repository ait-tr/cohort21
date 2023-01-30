public class Main {
    public static void main(String[] args) {
       methodA(2);
    }

    static void methodA(int p){
        if (p==0) {
            return;
        } else {
            int temp =p;
            System.out.println("Начали " +temp);
            p--;
            methodA(p);
            System.out.println("завершили " + temp);
        }
    }


}