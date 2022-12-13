public class Main {
    public static void main(String[] args) {
       Circle circle= new Circle(10);
       Square square= new Square(10);
       Rectangle rectangle = new Rectangle(10,20);

       Shape[] shapes={circle,rectangle,square};
        for (int i = 0; i <shapes.length ; i++) {
            System.out.println(shapes[i]);
            System.out.println(shapes[i].area());
        }
    }
}