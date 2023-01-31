public class Main2 {
    //0 1 1 2 3 5 8 13 21 .....
    //fib(n)= fib(n-1)+fib(n-2);


    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n){
        if(n<0) throw new IllegalArgumentException();
        if(n<=1) return n;
          return fibonacci(n-1) + fibonacci(n-2);
        }
    }



