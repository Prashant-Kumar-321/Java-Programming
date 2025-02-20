public class World extends Thread {
    @Override
    public void run(){
        WhatsUp whatsup = new WhatsUp(); 
        whatsup.start(); 

        System.out.println(Thread.currentThread().getName());
        
        try{
            whatsup.join(); 
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }

        for(int i=0; i<5; ++i){
            System.out.println("World"); 
        }
    }
}
