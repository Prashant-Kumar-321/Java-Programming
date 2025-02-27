// Thread using Runnable Interface
/* Runnable Interface
        ^
        |
      Counter
*/ 

/* // Runnable -> Functional Interface doesn't return any result
class MyCounter implements Runnable {

    private int counterValue; 
    private Thread w;

    public MyCounter(String threadName){
        counterValue = 0; 
        w = new Thread(this, threadName);
        System.out.println(w); 
    }

    public int getCounterValue(){return counterValue;}

    public void start(){
        w.start(); 
    }

    public void run(){
        try{
            while(counterValue < 5){
                System.out.println(w.getName() + " : "+ counterValue); 
                counterValue++; 

                Thread.sleep(250); 
            }
        }   
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally {
            System.out.println("Run Finishes"); 
        }
    }
}


public class Counter{
    public static void main(String[] args) {
        MyCounter mycounter = new MyCounter("My Counter");
        mycounter.start(); 


        try{
            int val = 0; 
            do{
                val = mycounter.getCounterValue(); 
                System.out.println("Counter Value read by main thread: " + val);
                Thread.sleep(1000);

            } while(val < 5); 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Main Thread finishes");
    }
}
 */

 // Multithreaded program by extending Thread class 

 final class MyCounter extends Thread {
    private int counterValue = 0;

    public MyCounter(String threadName){
        super(threadName); 
    }

    public int getCounter(){
        return counterValue; 
    }

    final public void run(){
        try{
            while(counterValue < 5){
                System.out.println(getName() + " : " + counterValue);
                counterValue++; 

                Thread.sleep(250);
            }
        }catch(InterruptedException inEx){
            inEx.printStackTrace();
        }
    }
 }

 public class Counter {
    public static void main(String[] args){
        MyCounter mc = new MyCounter("counter"); 
        mc.start(); 

        try{
            do {
                System.out.println("Counter read from Main thread: " + mc.getCounter()); 
                Thread.sleep(750);

            } while(mc.getCounter() < 5); 
             
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
 } 