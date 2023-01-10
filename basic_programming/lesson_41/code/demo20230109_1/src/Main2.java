import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        //System.out.println((long)Integer.MAX_VALUE-Integer.MIN_VALUE);
        long range = (long)Integer.MAX_VALUE-Integer.MIN_VALUE;
        System.out.println(range);
        double rnd= range*Math.random()+ Integer.MIN_VALUE;
        System.out.println((int)rnd);

        int min=-10;
        int max=20;
        Random random=new Random(System.nanoTime());
        int randomValue = random.nextInt(max-min+1)+min;
    }
}
