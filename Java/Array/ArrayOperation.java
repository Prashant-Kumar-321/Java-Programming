import java.util.*; 

class ArrayOperation{
    
    public static void main(String[] args){

        ArrayOperation aop = new ArrayOperation(); 

        // aop.insertionArray(); 

        int[] arr = new int[10]; 
        float[] distances = new float[10];
        String[] cars = new String[10]; 

        for (int e: arr){
            System.out.printf("%d ", e); 
        }
        System.out.println(); 

        for (float distance: distances){
            System.out.printf("%f ", distance); 
        }

        System.out.println();
        
        for (var car: cars){
            System.out.printf("%s ", car); 
        }
        System.out.println(); 
    }

    public void insertionArray(){
        int[] arr = new int[8]; 
        int pos, val; 

        Scanner sc = new Scanner(System.in); 

        // Ask user to enter 7 numbers 
        System.out.println("Enter 7 elements : "); 
        for (int i=0; i<arr.length-1; ++i){
            arr[i] = sc.nextInt(); 
        }

        // Print user input data 
        System.out.println("User input data"); 
        for (int i=0; i<arr.length-1; ++i){
            System.out.println("  " + arr[i]); 
        }

        System.out.println("Enter postition in which data to be entered"); 
        pos = sc.nextInt(); 

        // validate the pos 
        if (pos >= arr.length){
            System.out.println("Invalid Position"); 
            System.exit(0); 
        }

        System.out.println("Enter value to be entered"); 
        val = sc.nextInt(); 


        // pos, val 
        for (int i=6; i>=pos-1; --i){
            arr[i+1] = arr[i]; 
        }

        arr[pos-1] = val;  


        // print the final array 
        for (int i=0; i<arr.length; ++i){
            System.out.println(arr[i]); 
        }


        sc.close(); 

    }
}
