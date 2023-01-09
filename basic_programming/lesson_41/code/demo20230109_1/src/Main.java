

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 2147483647 - (-2147483648) = 2147483647 + 2147483648   +1

        int min = Integer.MIN_VALUE;
        int max= Integer.MAX_VALUE;
        System.out.println("MAX_VALUE " +  max + "      0" + Integer.toBinaryString(max) );

        System.out.println("MIN_VALUE " +min +  "     " + Integer.toBinaryString(min));
        System.out.println("MAN_VALUE + 1 " +max+1 +  " " + Integer.toBinaryString(max+1));
        System.out.println((max - min) +":                       " + Integer.toBinaryString(max - min));

        int intNum=(int) (min + Math.random() * ((long)max - min +1 ));
        System.out.println("intNum: " + intNum);

//

        Random rnd= new Random(System.currentTimeMillis());
        rnd.nextInt();
        rnd.nextInt(max);
        System.out.println(max+1);

        /*
        -1193959466
        -1139614796
        837415749
        -1220615319
         */
        Random random = new Random(System.currentTimeMillis());
        for (int i=0;i<3;i++) {
            System.out.println("------------------------");
            System.out.println(getRnd(random, -10,10));
        }



        /*

        f(y) = x1
        f(x1) = x2
        f(x2) = x3
        f(x3)= x4




         */




        //System.out.println("Hello world!");
    }

    public static  int getRnd(Random random, int min , int max){

        return   random.nextInt(max-min+1)+min;

    }


}