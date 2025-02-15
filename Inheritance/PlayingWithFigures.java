// Define Abstract Class 
abstract class Figure {
    protected double dim1, dim2;
    
    Figure(double dim1, double dim2){
        this.dim1 = dim1; 
        this.dim2 = dim2;
    }

    abstract public double area(); 
}

// Concrete classes 
class Circle extends Figure{
    final static double PI = 3.141526; 

    Circle(double radius){
        super(radius, -1); 
    }

    public double area(){
        return Circle.PI * this.dim1 * this.dim1; // PI * r * r
    }
}

class Rectangle extends Figure{
    Rectangle(double len, double width){
        super(len, width); 
    }

    public double area(){
        return dim1 * dim2; 
    }
}



public class PlayingWithFigures{
    public static void main(String[] args){
        Circle circle = new Circle(7); 
        Rectangle rect = new Rectangle(10, 5); 

        System.out.println("Area of Circle : " + computeFigureArea(circle)); 
        System.out.println("Area of Rectangle : " + computeFigureArea(rect));  
    }

    public static double computeFigureArea(Figure fig){
        return fig.area(); 
    }
}