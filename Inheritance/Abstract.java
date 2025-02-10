
abstract class Figure {
    // abstract method 
    // Concrete method 

    double dim1; 
    double dim2; 

    public Figure(double a, double b){
        dim1 = a; 
        dim2 = b;     
    }

    public abstract double area(); // abstract method
    
}

class Rectangle extends Figure{
    
    // Parameterized constructor 
    public Rectangle(double dim1, double dim2){
        super(dim1, dim2);     
    }


    public double area() {
        return dim1 * dim2;     
    }

}


class Triangle extends Figure{

   public Triangle(double height, double base){
    super(height, base);     
   } 


    public double area(){
        return 0.5 * dim1 * dim2; 
    }

}




public class Abstract {
    public static void main(String[] args){
        Figure figure; // object reference

        Rectangle rect = new Rectangle(10, 30); 

        Triangle tri = new Triangle(10, 5); 

        figure = rect; 
        double rectArea = figure.area(); // Rectangle version of area is called 
        System.out.println("Rectangle Area: " + rectArea);         

        figure = tri; 
        double triArea = figure.area(); // Triangle vesion of area is called
        System.out.println("Triangle Area: " + triArea); 

        
    }
        
}













