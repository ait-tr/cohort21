import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMain3 {


    @Test
    public void test_findMaxValue(){
        List<Integer> dataIn = new ArrayList<>();
        dataIn.add(-5);
        dataIn.add(14);
        dataIn.add(45);
        dataIn.add(16);
        dataIn.add(78);
        dataIn.add(17);
        dataIn.add(234);
        dataIn.add(-34);

        int expectedRes= 234;
        int realResult= Main3.findMaxValue(dataIn);

        Assertions.assertEquals(expectedRes,realResult);


    }

    @Test
    public void test_findMaxValue1(){
        List<Integer> dataIn = new ArrayList<>();
        dataIn.add(-5);
        dataIn.add(-6);
        dataIn.add(-7);
        dataIn.add(-45);

        int expectedRes= -5;
        int realResult= Main3.findMaxValue(dataIn);

        Assertions.assertEquals(expectedRes,realResult);


    }

}
