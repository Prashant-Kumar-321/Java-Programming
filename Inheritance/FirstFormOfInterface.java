class Student {
    protected int rollNo; 

    public void setRollno(int rollno){
        if(rollno >= 0){
            rollNo = rollno; 
        }else{
            rollNo = 0; 
        }
    }

    public void printRollno(){
        System.out.println("Roll Number: " + this.rollNo);
    }
}

class Test extends Student{
    protected double marks1, marks2;
    
    public void setMarks(double m1, double m2){
        marks1 = m1; 
        marks2 = m2;
    }

    public void printMarks(){
        System.out.printf("Marks1: %f \nMarks2: %f\n", marks1, marks2); 
    }
}

interface Sports {
    double score = 120; 

    void printScore(); 
}

class Result extends Test implements Sports{

    public void printScore(){
        System.out.println("Score: " + score);
    }

    public void displayTotalMarks(){
        double total = marks1 + marks2 + score; 
        System.out.println("Total marks Scored: " + total); 
    }
}


public class FirstFormOfInterface {
    public static void main(String[] args){
        Result result = new Result(); 
        result.setRollno(100); // coming from [Student]
        result.setMarks(199, 300); // comming from [Test]

        result.printRollno(); // coming from [Student]
        result.printMarks(); // coming from [Test]
        result.printScore(); // coming from [Result]

        result.displayTotalMarks(); // coming from [Result]
    }
}
