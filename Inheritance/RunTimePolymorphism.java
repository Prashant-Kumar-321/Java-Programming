// Base Class 
class A {
    public void callme(){
        System.out.println("A's callme is called");     
    }
}

// Drived Class 
class B extends A{

    @Override
    public void callme(){
        System.out.println("B's callme is called");
    }
}

// Derive Class 
class C extends A{
    
    @Override
    public void callme(){
        System.out.println("C's callme is called");
    }    

}


class RunTimePolymorphism {

    public static void main(String[] args) {
        A a = new A(); 
        B b = new B(); 
        C c = new C();

        a.callme(); // A's version of callme will be invoked
        b.callme(); // B's version of callme will be invoked 
        c.callme(); // C's version of callme will be invoked 

        // Run time Polymorphism Using "Dynamic method Dispatch"
        A ref; // Reference object of parent class 
        
        ref = a;    
        ref.callme(); // A's version of callme will be invoked 
        
        ref =  b; // referring to B's object 
        ref.callme(); // B's version of callme will be invoked 
        
        ref = c; // referring to C's object 
        ref.callme(); // C's version of callme will be invoked  
         
    }
    
}














