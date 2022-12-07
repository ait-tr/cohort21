import java.util.Arrays;

public class Student {
    private String name;
    private int missedClasses;

    private double[] rate;

    public Student(String name, int missedClasses) {
        this.name = name;
        this.missedClasses = missedClasses;
    }

    public Student(String name, int missedClasses, double[] rate) {
        this(name,missedClasses);
        this.rate=rate;
    }
    public void setRate(double[] rate){
        this.rate= rate;
    }


    @Override
    public String toString() {
        String temp= "";
        if(rate!=null) {
            for (int i = 0; i < rate.length; i++) {
                temp+=rate[i]+" ";
            }
        }
        temp=temp.equals("")?" /оценки отсутствуют":" /"+temp;
        return String.format("%s (missed classes: %d)%s", name,missedClasses,temp);
    }

    public int getMissedClasses() {
        return missedClasses;
    }
}
