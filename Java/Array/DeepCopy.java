package Java.Array;

import Java.Array.Comment;

public class DeepCopy implements Cloneable {
    int x, y; 
    Comment comment; 

    public DeepCopy(int x, int y, String comment, String userId, String created){
        this.x = x; 
        this.y = y; 
        this.comment = new Comment(comment, userId, created); 
    }


    public static void main(String[] args) throws CloneNotSupportedException{
        DeepCopy main = new DeepCopy(3, 6, "Your playlist is diamond mine for djanog developers", "777kuei-r5786", "23-12-2024"); 
        DeepCopy main1 = (DeepCopy)main.clone(); 
        main.comment.comment = "8478457457858"; 

        System.out.println(main); 
        System.out.println(main1); 

    }

    @Override 
    public Object clone() throws CloneNotSupportedException{
        // Crete a shallow copy fo the object using super.clone() metho 
        DeepCopy obj = (DeepCopy) super.clone();

        // Create a copy of comment object 
        obj.comment = new Comment(this.comment.comment, this.comment.userId, this.comment.created); 
        
        return obj; 
    }

    @Override 
    public String toString(){
        return "x = " + x + " y = " + y + " Comment = "+ this.comment.comment; 
    }
}
