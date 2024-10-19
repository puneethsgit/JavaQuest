/* Parameterized, Non-Parameterized, Copy Constructor */
public class P7typesconstructor {

    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "puneeth";
        s1.rollno = 75;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 99;

        //consider an example when student s1 forgets the password and s2 wants data of s1
        Student s2 = new Student(s1);
        s2.password = "xyz";

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    /* The default constructor allows you to create a Student object with no arguments, initializing its fields (like marks) to a default state. If we don't provide a default constructor, Java will generate a default no-argument constructor only if no other constructors are present. However, since we defined the copy constructor, we must also define a default constructor to handle object creation when no arguments are passed.      */

    Student(){
        marks = new int[3];  
        //here array needs to be initialized, otherwise it will be null by default, and attempting to assign values to the array (s1.marks[0] = 100;) will throw a NullPointerException.
    }

   //COPY CONSTRUCTOR
   Student(Student s1){
    marks = new int[3];
    this.name = s1.name;
    this.rollno = s1.rollno;
    this.marks = s1.marks;
   }
}
