public class App {
    public static void main(String[] args) throws Exception {
        Circle circle1= new Circle(5.0);
        Shape shape1= new Shape(circle1);
        shape1.calculateArea();
        Rectangle rectangle1= new Rectangle(10, 25);
        Shape shape2=new Shape(rectangle1);
        shape2.calculateArea();
    }
}
