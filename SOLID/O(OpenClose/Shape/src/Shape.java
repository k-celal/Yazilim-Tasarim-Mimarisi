public class Shape {
    private IShape shape;
    public Shape(IShape _shape){
        this.shape=_shape;     
    }
    public void calculateArea(){
        shape.calculateArea();
    }
    
}