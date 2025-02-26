// Race condition
/* class Counter{
    private int counter = 0; 

    public void increment(){counter++;}
    public void decrement(){counter--;}

    public int getCounter(){return counter;}
}

public class RaceCondition {
    public static void main(String[] args){
        Counter counter = new Counter(); 

        Thread th1 = new Thread(()->{
            for(int i=0; i<1000; ++i){
                counter.increment(); 
            }
        }); 

        Thread th2 = new Thread(()->{
            for(int i=0; i<1000; ++i){
                counter.decrement(); 
            }
        }); 

        th1.start(); 
        th2.start(); 
        
        try{
            th1.join(); 
            th2.join(); 
        }
        catch(InterruptedException inEx){
            inEx.printStackTrace();
        }

        // expected Counter Value: 200, may be different due to race condition
        System.out.println("Counter Value: " + counter.getCounter()); 
    }
} */

// Solution of race condition
class Counter{
    private int counter = 0; 

    synchronized public void increment(){counter++;}
    synchronized public void decrement(){counter--;}

    public int getCounter(){return counter;}
}

public class RaceCondition {
    public static void main(String[] args){
        Counter counter = new Counter(); 

        Thread th1 = new Thread(()->{
            for(int i=0; i<1000; ++i){
                counter.increment(); 
            }
        }); 

        Thread th2 = new Thread(()->{
            for(int i=0; i<1000; ++i){
                counter.decrement(); 
            }
        }); 

        th1.start(); 
        th2.start(); 
        
        try{
            th1.join(); 
            th2.join(); 
        }
        catch(InterruptedException inEx){
            inEx.printStackTrace();
        }

        // expected Counter Value: 200, may be different due to race condition
        System.out.println("Counter Value: " + counter.getCounter()); 
    }
}
