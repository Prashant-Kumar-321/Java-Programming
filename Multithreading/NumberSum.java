import java.util.Scanner;
import java.util.concurrent.*;

import java.util.ArrayList; 
import java.util.List; // List Interface 

public class NumberSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = readInput(sc);

        // Thread pool of 3 size 
        ExecutorService executor = Executors.newFixedThreadPool(10);
        
        List<Callable<Integer>> tasks = new ArrayList<Callable<Integer>>(10); // vector<int> vec(10)
        // create tasks
        for(int i=0; i<nums.length; ++i){
            tasks.add(i, new EvenNumberSum(nums[i], i)); // vec.at(i) = vec[i] = EvenNumberSum(nums[i])
        }

        List<Future<Integer>> futures = new ArrayList<Future<Integer>>(tasks.size());

         
        // Submit tasks to the thread 
        for (int i=0; i<tasks.size(); ++i){
            futures.add(i, executor.submit(tasks.get(i))); 
        }

        int[] results = new int[10];

        // get the result from threads 
        try{
           for(int i=0; i<futures.size(); ++i){
                System.out.println("Waiting for data from taks " + i); 
                results[i] = futures.get(i).get(); 
           }
        }
        catch(InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        } 
        // This code is executed if no exception occurs
        finally{
            System.out.println("Finally block executed");
            executor.shutdown();     
        }

        int finalResult = 0;

        for(var res: results){
            finalResult += res; 
        }

        System.out.println("Final result = " + finalResult); 
    }

    private static int[] readInput(Scanner sc){
        int[] nums = new int[10]; 
        System.out.println("Enter 10 numbers: "); 
        
        for(int i=0; i<nums.length; ++i){
            nums[i] = sc.nextInt(); 
        }

        return nums; 
    }
}
