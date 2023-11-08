public class UymayanShape {
    public abstract static class Shape {
    }
    
    public static class CircleX extends Shape {
        private double radius;
    
        public CircleX(double radius) {
            this.radius = radius;
        }
        
        public double getRadius() {
            return radius;
        }
        
        public void setRadius(double radius) {
            this.radius = radius;
        }
    }
    
    public static class RectangleX extends Shape {
        private double width;
        private double height;
    
        public RectangleX(double width, double height) {
            this.width = width;
            this.height = height;
        }
        
        public double getWidth() {
            return width;
        }
    
        public void setWidth(double width) {
            this.width = width;
        }
    
        public double getHeight() {
            return height;
        }
    
        public void setHeight(double height) {
            this.height = height;
        }
    }
    
    public static class AreaCalculator {
        public double calculateArea(Shape shape) {
            if (shape instanceof CircleX) {
                CircleX circle = (CircleX) shape;
                return Math.PI * circle.getRadius() * circle.getRadius();
            } else if (shape instanceof RectangleX) {
                RectangleX rectangle = (RectangleX) shape;
                return rectangle.getWidth() * rectangle.getHeight();
            }
            return 0;
        }
    }
    
    public static void main(String[] args) {
        CircleX circle = new CircleX(5.0);
        RectangleX rectangle = new RectangleX(4.0, 6.0);
        
        AreaCalculator calculator = new AreaCalculator();
        
        double circleArea = calculator.calculateArea(circle);
        double rectangleArea = calculator.calculateArea(rectangle);
        
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }    
}
