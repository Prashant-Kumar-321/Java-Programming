import java.util.concurrent.Callable; 

public class Factorial implements Callable<Integer> {
    private int num; 

    Factorial(int num){this.num = num;}

    public Integer call() throws Exception {
        int fact = 1; 
        
        while(num > 0){
            fact *= num; 
            num--; 
        }

        return fact; 
    }
}
