package Java.OOPs.Class_Objects;

import Java.OOPs.Class_Objects.Student; 

public class Main {
    public static void main(String[] args){

        Main main = new Main();
        main.students();  

    }

    private void students(){
        String names[] = {"Ram", "Shyama", "Nikita", "Kriti", "Ravi"}; 
        String deps[] = {"MCA", "BBA", "CSE", "Electronics", "IT"}; 
        Student students[] = new Student[5]; 

        for(int i=0; i<students.length; ++i){
            students[i] = new Student(names[i], deps[i]); 
        }

        Student.sortStudents(students);

        for(Student student: students){
            System.out.println(student); 
        }

        // testSwapping(students[0], students[1]); 
    }

    private void testSwapping(Student st1, Student st2){
        st1.display(); 
        st2.display(); 

        Student.swap(st1, st2); 

        st1.display(); 
        st2.display(); 
    }

}
