/* STATIC KEYWORD IN JAVA IS USED TO SHARE THE SAME VARIABLE OR METHOD OF A GIVEN CLASS
 WHAT CAN BE STATIC ?
 -> PROPERTIES  - variables
 -> FUNCTIONS 
 -> BLOCK - block of code (NOT SO IMPORTANT)
 -> NESTED CLASS - class inside a class (NOT SO IMPORTANT)
 */
/* EXAMPLE FOR STATIC :
 conside a student class contains properties of name, rollno, schoolname and methods of marks() & percentage()
 here for an object every value will be different but for schoolname it will be same for all object so we can make it as a static
 */
public class P22statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "kvv high School";
        Student s2 = new Student();
        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        s2.schoolName = "ruman school";
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
    }
}

class Student {

    // created only once and every obj refers the same from which saves memory and
    // also multiple creation
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }

    // Static block to initialize the static variable
    static {
        System.out.println("Static block executed!");
        int value = 42; // Initializing with a delightful default value
    }

    String name;
    int rollno;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setRoll(int rollno) {
        this.rollno = rollno;
    }

    int getRoll(int rollno) {
        return this.rollno;
    }
}
