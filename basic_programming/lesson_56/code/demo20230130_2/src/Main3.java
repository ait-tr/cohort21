// a^b = a * a^(b-1)
//.....
// 3^4 = 3*3*3*3 = 3 * 3^3
// 3^3 =   3*3*3 = 3 * 3^2
// 3^2 =     3*3 = 3 * 3^1
// 3^1 =       3 = 3 * 3^0
// 3^0 = 1
public class Main3 {
    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }

 public static int pow(int a, int b){
     if (b==0) {
         return 1;
     } else {
         return a * pow(a, b - 1);
     }
 }

}


