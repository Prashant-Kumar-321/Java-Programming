
class Box{
    private double length; 
    private double width; 
    private double height; 

    // Default Constructor (Explicit)
    public Box(){
        length = 10; 
        width = 20; 
        height = 30;     
    }

    // Parameterized constructor 
    public Box(double len, double wid, double he){
        length = len; 
        width = wid; 
        height = he; 
    }

    // Copy Constructor using other Box object reference 
    public Box(Box other){
        if(other == null){
            length = 10; 
            width = 20; 
            height = 30; 
        } 
        else{
            length = other.length; 
            width = other.width; 
            height = other.height;
        } 
    }

    // Concrete method 
    public double volume(){
        return length * width * height;     
    }    
}



class BoxWeight extends Box{
    private double weight; 

    // Default explicit Constructor 
    public BoxWeight(){
        super(); // Parent class default constructor

        weight = 20;    
    }

    // Parameterized Constructor
    public BoxWeight(double len, double wid, double he, double we){
        super(len, wid, he); // Parent class constructor 

        weight = we;    
    }

    // Copy Constructor using Object reference 
    public BoxWeight(BoxWeight other){
        super(other); 

        weight = other.weight;     
    }

    public double density(){
        return  weight / super.volume();    
    }
    
}


class Shipment extends BoxWeight{
    private double cost; 

    // Default explicity Constructor 
    public Shipment(){
        super(); // Calling BoxWeight default constructor

        cost = 0;     
    }

    // Parameterized Constructor 
    public Shipment(double len, double wid, double he, double we, double cost){
        super(len, wid, he, we); // calling BoxWeight parameterized constructor 

        this.cost = cost;
    }

    // Copy Constructor
    public Shipment(Shipment other){
      super(other); 

      this.cost = other.cost;   
    }  
    
}


public class SuperKeyword {

    public static void main(String args[]){
        Shipment ship1 = new Shipment(); // default constructor 
        Shipment ship2 = new Shipment(10, 20, 30, 40, 50); // parameterized constructor 
        Shipment ship3 = new Shipment(ship2); // Copy constructor 

        System.out.println("Volume of shipment 1: " + ship1.volume()); 
        System.out.println("Volume of shipment 2: " + ship2.volume()); 
        System.out.println("Volume of shipment 3: " + ship3.volume());


        System.out.println("Density of shipment 1: " + ship1.density()); 
        System.out.println("Density of shipment 2: " + ship2.density()); 
        System.out.println("Density of shipment 3: " + ship3.density()); 
    }
}































