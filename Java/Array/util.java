
class util {

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
