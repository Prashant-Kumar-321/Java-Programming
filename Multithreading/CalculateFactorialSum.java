import java.util.concurrent.*; 
import java.util.Scanner;


public class CalculateFactorialSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number"); 
        int num1 = input.nextInt(); 
        int num2 = input.nextInt(); 

        // Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // create two threads 
        Callable<Integer> fact1 = new Factorial(num1); 
        Callable<Integer> fact2 = new Factorial(num2); 

        // submit threads to the thread pool
        Future<Integer> FutureRes1 = executor.submit(fact1); 
        Future<Integer> FutureRes2 = executor.submit(fact2); 

        int res1=0, res2=0; 
        
        try{
            res1 = FutureRes1.get(); 
            res2 = FutureRes2.get();
             
        }catch(InterruptedException | ExecutionException ex){
            ex.printStackTrace();

        } finally {
            executor.shutdown(); 
        }

        int res = res1 + res2;
        
        System.out.printf("%d! + %d! = %d \n", num1, num2, res);

        input.close(); 
    }

}
