/* Parameterized, Non-Parameterized, Copy Constructor */
public class P7typesconstructor {

    public static void main(String[] args) {
        Student s1 = new Student(); 
        Student s2 = new Student("puneeth"); 
        Student s3 = new Student(123);
        //Student s4 = new Student("ram",1); 
        //this will give us error because there is no constructor that match this parameters
        System.out.println(s3.rollno);
        System.out.println(s3.name);
    }
}

class Student {
    String name;
    int rollno;

    /* WE CAN WRITE MULTIPLE CONSTRUCTOR */

    //Non - Parameterized Constructor
    Student() {
        System.out.println("constructor is called");
    } 

    //Parameterized Constructor
    Student(String name) {
        this.name = name;
    }
    Student(int rollno){
        this.rollno = rollno;
    }
}
