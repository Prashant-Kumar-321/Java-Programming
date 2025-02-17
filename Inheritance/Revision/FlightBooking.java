// ==============================================
// INTERFACE (CONTRACT)
interface Flight {
    static final String name = "Flight";
    
    boolean bookFlight(); 
    boolean cancelFlight();
}

// ==========================================================
// CONCRETE METHODS

class AirIndia implements Flight{

    public boolean bookFlight(){
        System.out.println("Your airIndia flight has been booked"); 
        return true; 
    }

    public boolean cancelFlight(){
        System.out.println("Your airIndia flight can not be canceled it is too late to be canceled"); 
        return false; 
    }
}

class Indigo implements Flight{

    public boolean bookFlight() {
        System.out.println("Indigo: Sorry all seat is already booked"); 
        return false; 
    }

    public boolean cancelFlight() {
        System.out.println("Your Indigo flight has been canceled"); 
        return true; 
    }
       
}

public class FlightBooking{

    public static void main(String[] args){
        AirIndia ai = new AirIndia(); 
        Indigo ig = new Indigo(); 

        Flight flight;

        flight = ai; 
        flight.bookFlight(); 
        flight.cancelFlight(); 

        flight = ig; 
        flight.bookFlight(); 
        flight.cancelFlight();
    }

}