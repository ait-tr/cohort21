public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        Rectangle rectangle = new Rectangle(10,50);
        //rectangle.m();
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public double area(){
        return side*side;
    }
}
