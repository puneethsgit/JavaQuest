/* Find the Correct statement to assign name to object
 (a) s->name = "aman" [C++ syntax, aroow opearator, java dont have arrow operator]
 (b) Student.name = "aman" 
 [using class name Student, if the variable was static then it will work access through class name]
 (c) s.name = "aman" [CORRECT]
 */

class Student {
    String name;
    int marks;
}

public class Q1oops {
    public static void main(String[] args) {
        Student s = new Student();
        // Fill here
        s.name = "aman";
    }
}
