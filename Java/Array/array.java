import java.util.*; 

class ArrayBasic {
    public static void main(String[] args){
        Scanner rd = new Scanner(System.in); 

        // String[] cars; // declare an array
        String[] cars = {"Volvo", "BMW", "Ford", "Maza"}; 

        System.out.println(cars.length); 

        System.out.println("Accessing all elements of cars ");

//        for(int i=0; i<cars.length; ++i){
//            System.out.println((i+1) + " " + cars[i]);
//         }      

        
        // Looping over array via For-Each loop 
        for(String car: cars){
            System.out.println(car); 
        }
        
        System.out.println(); 

        rd.close(); 
        

        AverageAge averageAge = new AverageAge(); 

        AverageAge.avgAge(); 
        AverageAge.lowestAge(); 
    }
}


class AverageAge {

    public void avgAge(){
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70}; 
         
        float avgAge, ageSum = 0; 

        for(int age: ages){
            ageSum += age;              
        }

        // Calculate average age 
        avgAge = ageSum / ages.length; 

        System.out.println("Average age of student " + avgAge); 
    }
    
    public static void lowestAge(){
            // We will pick greedly the lowest age from array
            
           int ages[] = {20, 22, 18, 35, 48, 26, 87, 70}; 

           int minAge = Integer.MAX_VALUE; 

           for(int age: ages){
                minAge = age < minAge ? age: minAge;             
            }              
        

            System.out.println("Lowest Age  = " + minAge); 
        }
}


































