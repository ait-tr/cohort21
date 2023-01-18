import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int LIMIT = 50_000;
    private static final Random RND=new Random();
    private static long start;
    private static long finish;


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        startTimer();
        addNumbersToRndPosition(list);
        stopTimer();
        //System.out.println(list);
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());

    }


    public static void startTimer(){
        start= System.nanoTime();
    }

    public static void stopTimer(){
        finish= System.nanoTime();
    }
    public static long getTimer(){
        long time = finish-start;
        return TimeUnit.MILLISECONDS.convert(time,TimeUnit.NANOSECONDS);
    }


    public static void addNumbers(List<Integer> list){
        for (int i = 0; i < LIMIT; i++) {
            list.add(RND.nextInt());
        }
    }

    public static void addNumbersToRndPosition(List<Integer> list){
        list.add(RND.nextInt());
        for (int i = 1; i < LIMIT; i++) {
            list.add(RND.nextInt(list.size()),RND.nextInt(100));
        }
    }

    public static void addNumbersToRndPosition2(List<Integer> list){
        List<Integer> arr = new ArrayList<>(LIMIT);
        for (int i = 0; i < LIMIT ; i++) {
            arr.add(i);
            list.add(null);
        }

        for (int i = 0; i < LIMIT;  i++) {
            int rndIdx = RND.nextInt(LIMIT - i);
            int rndFromList = arr.remove(rndIdx);
            list.set(rndFromList, RND.nextInt());
        }

    }

}