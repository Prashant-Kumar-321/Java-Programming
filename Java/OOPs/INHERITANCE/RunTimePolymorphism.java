package Java.OOPs.INHERITANCE;

// Parent Class 
class A {
    public void callme(){
        System.out.println("Call me function from A"); 
    }
}

// Child class 
class B extends A {

    @Override
    public void callme(){
        System.out.println("Call me function from B");
    }
}

class C extends A {

    @Override
    public void callme(){
        System.out.println("Call me function from C");
    }
}


public class RunTimePolymorphism {
    public static void main(String[] args){
        A a = new A(); 
        B b = new B(); 
        C c = new C(); 

        a.callme(); // Class A's callme would be called     

        b.callme(); // Class B's callme would be called 

        c.callme(); // Class C's callme would be called 
    }
}
