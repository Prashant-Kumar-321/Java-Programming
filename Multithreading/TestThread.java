public class TestThread{
    public static void main(String[] args){
        World world = new World(); 
        world.start();

        System.out.println(Thread.currentThread().getName());
        
        try{
            world.join(); 
        }
        catch(InterruptedException ex){
            ex.printStackTrace();
        }

        for(int i=0; i<5; ++i){
            System.out.println("Hello"); 
        }
    }
}