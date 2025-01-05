package Java.Array;

public class ArrayParameter implements Cloneable {
    public int x; 

    public ArrayParameter(int x){
        this.x = x; 
    }

    public ArrayParameter(){
        this.x = 0; 
    }

    static public void main(String args[]) throws CloneNotSupportedException
    {
        ArrayParameter main = new ArrayParameter();

        ArrayParameter obj = new ArrayParameter(5); 
        ArrayParameter obj1 = (ArrayParameter) obj.clone(); 
        obj.print(); 
        obj1.print(); 

        //System.out.println("Before = " + obj.x); 
        // passing obj as value 
        // main.copyObject(new ArrayParameter(obj));

        // System.out.println("After = " + obj.x); 

        //int nums[] = new int[5]; 
        //for(int i=0; i<nums.length; ++i){
        //    nums[i] = i * 3 + 3; 
        //}

        // main.print(nums); 
        // main.doubleValuesOfArray(nums); 
        // main.print(nums);

    } 

    private void print(int nums[]){
        for(int num: nums){
            System.out.printf("%d ", num); 
        }
        System.out.println(); 
    }

    private void doubleValuesOfArray(int nums[]){
        for(int i=0; i<nums.length; ++i){
            nums[i] *= 2; 
        }
    }

    private void change(ArrayParameter obj){
        obj.x = 10; 
    }

    private void copyObject(ArrayParameter obj){
        obj.x *= 10; 
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone(); 
    }

    public void print(){
        System.out.println(x); 
    }

}
