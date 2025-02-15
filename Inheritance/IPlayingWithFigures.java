// Interface class 
interface Figure{
    final static double PI = 3.141426;
    
    private void utility(){System.out.println("This is utilit method");}
    default void showUtility(){utility();}

    double area(); // by default public abstract method
    void draw(); 
}

// Concrete class
class Circle implements Figure{
    private double radius; 
    final String type; 

    Circle(double r) {
        type = "Circle"; 
        this.radius = r; 
    }

    public double area(){
        return PI * radius * radius; 
    }

    public void draw(){
        System.out.println("Draw Circle"); 
    }
}

class Rectangle implements Figure{
    private double length; 
    private double breadth; 

    Rectangle(double len, double br){
        length = len; 
        breadth = br; 
    }

    @Override
    public double area() {
       return length * breadth; 
    }

    @Override
    public void draw() {
        System.out.println("Draw Rectangle"); 
    }
}

public class IPlayingWithFigures {
    public static void main(String[] agrs){
        Circle circle = new Circle(7); 
        Rectangle rect = new Rectangle(10, 4); 

        // compute Area of figures
        System.out.println("Area of Circle : " + computeFigArea(circle)); 
        System.out.println("Area of Reactangle: " + computeFigArea(rect)); 

        // Draw the figure 
        drawFigure(circle); 
        drawFigure(rect);

        // Accessing final static variable 
        System.out.println(Circle.PI + " " + Rectangle.PI);
        
        // show utility method 
        circle.showUtility();
        rect.showUtility();
    }

    private static void drawFigure(Figure fig){
        fig.draw(); 
    }

    private static double computeFigArea(Figure fig){
        return fig.area(); 
    }
}
