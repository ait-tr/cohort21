public class Main {
    public static void main(String[] args) {
       Circle circle= new Circle(10);
       Square square= new Square(10);
       Rectangle rectangle = new Rectangle(10,20);
       Triangle triangle= new Triangle(10,10,6);

       Shape[] shapes ={circle,rectangle,square,triangle};
        for (int i = 0; i < shapes.length ; i++) {
            System.out.println(shapes[i]);
            System.out.println(shapes[i].area());
        }

        Shape shape = new Square(13);
        shape.area();



    }

}