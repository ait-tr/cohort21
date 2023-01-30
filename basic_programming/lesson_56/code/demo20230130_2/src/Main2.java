public class Main2 {
    //n! = n*factorial(n-1)

    // 5!= 5* 4*3*2*1  = 5*4!
    // 4!=   4* 3*2*1  = 4*3!

    // 3!=      3* 2*1 = 3*2!
    // 2!=         2*1!
    // 1!=1;
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        System.out.println("вызвали метод с n="+n);
        if(n==1){
            System.out.println("завершили 'базовый случай' с n="+n + " факториал =1");
            return 1;
        }
        int temp=n*factorial(n-1);
        System.out.println("завершили метод с n="+n + " факториал ="+temp);
        return temp;
    }

}

