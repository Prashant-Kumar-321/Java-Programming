// Thread using Runnable Intergace
/* Runnable Interface
        ^
        |
      Counter
*/ 

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
    public static void main(String[] args){
        MyCounter mycounter = new MyCounter("My Counter");
        mycounter.start(); 


        try{
            int val = 0; 
            do{
                val = mycounter.getCounterValue(); 
                System.out.println("Counter Value read by main thread: " + val);
                Thread.sleep(1000);

            }while(val < 5); 
        }
        catch(Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Main Thread finishes");
    }
}
