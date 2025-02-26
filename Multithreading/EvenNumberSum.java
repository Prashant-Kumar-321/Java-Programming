import java.util.concurrent.Callable; 

public class EvenNumberSum implements Callable<Integer> {
    private int num; 
    private int taskNumber; 
    
    EvenNumberSum(int num, int taskNo){
        this.num = num;
        taskNumber = taskNo; 
    }

    public Integer call() throws Exception {
        System.out.println("Task " + taskNumber + " is executing"); 
        Thread.sleep(2000);

        int sum = 0; 
        for(int i=1; i<=num; ++i){
            if(i%2 == 0){
                sum += i; 
            }
        }

        return sum; 
    }
}
