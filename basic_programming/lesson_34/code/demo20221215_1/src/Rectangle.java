

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    protected int getSideA() {
        return sideA;
    }

    protected int getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +

                '}';
    }


    public double area(){
        return sideA*sideB;
    }



}
