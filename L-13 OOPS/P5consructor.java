/* CONSTRUCTOR IS A SPECIAL METHOD WHICH IS INVOKED AUTOMATICALLY AT THE TIME OF OBJECT CREATION
  1) constructor have the same name as class or structure (structure refer to c ++) ie if we create a Pen class means
  then there will be constructor with the same name Pen()
  2) constructor dont have return type not even void
  3) constructor are only called once at object creation
  4) memory allocation happens when constructor is called


  DESTRUCTOR - JAVA DONT HAVE DESTRUCTOR IT USE GARBAGE COLLECTOR TO DELETE UNWANTED VARAIBALES AND METHODS AUTOMATICALLY
 */
public class P5consructor {
    
    public static void main(String[] args) {
        Student s1 = new Student("Puneeth"); //from this Student name will be initalized
        System.out.println(s1.name);
        s1.name = "hello";
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int rollno;

    //constructor - even though we wont define constructor means java automatically defines the constructor but in java automatic constructor there is no initalization
    Student(String name) {
        this.name  = name; 
        System.out.println("constructor is called");
    }
}