package Java.OOPs.Class_Objects;

public class Student {
    private String name; 
    private String department; 

    public Student(String name, String department){
        this.name = name; 
        this.department = department; 
    }

    public static void swap(Student st1, Student st2){
        // swapping name 
        String temp = st1.getName(); 
        st1.setName(st2.getName()); 
        st2.setName(temp); 

        // swapping department 
        temp = st1.getDepartment(); 
        st1.setDepartment(st2.getDepartment()); 
        st2.setDepartment(temp); 
    }

    public static void sortStudents(Student[] students){
        // sorting criteria 
        //      ascending order of their name 
        int i=0; 
        while(i < students.length-1){
            for(int j=i+1; j<students.length; ++j){
                if(students[j].getName().compareTo(students[i].getName()) < 0){
                    swap(students[i], students[j]); 
                }
            }

            ++i; 
        }
    }

    // @Override
    // String representation of object
    // public String toString(){
    //     return "Student{name='" + name + "', subject='" + department + "'}";
    // }


    public void display() {
        System.out.printf("Name: %s\n", name); 
        System.out.printf("Department = %s\n", department); 
        System.out.println(); 
    }

    public String getName(){
        return name; 
    }

    public void setName(String newName){
        this.name = newName; 
    }

    public String getDepartment(){
        return department; 
    }

    public void setDepartment(String newDepartment){
        this.department = newDepartment; 
    }
}

