public class WhatsUp extends Thread{
    @Override 
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
