abstract class Figure{
    protected double dim1, dim2;

    Figure(double dim1, double dim2){
        this.dim1 = dim1; 
        this.dim2 = dim2;
    }

    public abstract double area();
}

class Circle extends Figure{
    public static final double PI = 3.141526; 

    Circle(double radius){
        super(radius, -1); 
    }

    public double area(){
        return PI * dim1 * dim1; 
    }
}

class Rectangle extends Figure{
    Rectangle(double len, double br){
        super(len, br); 
    }

    public double area(){
        return dim1 * dim2;            
    }
}


// Main-Class (driver-class)
public class PlayingWithFigures {
    // driver function 
    public static void main(String[] args){
        Circle circle = new Circle(3.14); 
        Rectangle rectangle = new Rectangle(1.3, 3.6); 

        Figure fig;
        
        fig = circle; 
        System.out.println("Area of Circle: " + fig.area()); // Circle area version method will be called

        fig = rectangle; 
        System.out.println("Area of Rectangle: " + fig.area()); // Rectangle area version method will be called

    }

}
