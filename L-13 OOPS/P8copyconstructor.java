/* Parameterized, Non-Parameterized, Copy Constructor */
/* A copy constructor in Java is a constructor used to create a new object by copying the attributes of an existing object. Since Java doesn't provide a default copy constructor, you have to define it explicitly. */
public class P7typesconstructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "puneeth";
        s1.rollno = 75;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 99;

        // consider an example when student s1 forgets the password and s2 wants data of
        // s1
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        // Here in s2 already copied s1 and now we have made change but this
        // change should be reflected in s2 but we can see the changes this is because
        // in copy constructor we wrote a statement this.marks = s1.marks here it doesnt
        // copied whole array it just copied the array reference (Pointing)
       // System.out.println(s1.password);
       // System.out.println(s2.password);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
       // System.out.println(s1.marks[2]);
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    /*
     * The default constructor allows you to create a Student object with no
     * arguments, initializing its fields (like marks) to a default state. If we
     * don't provide a default constructor, Java will generate a default no-argument
     * constructor only if no other constructors are present. However, since we
     * defined the copy constructor, we must also define a default constructor to
     * handle object creation when no arguments are passed.
     */

    Student() {
        marks = new int[3];
        // here array needs to be initialized, otherwise it will be null by default, and
        // attempting to assign values to the array (s1.marks[0] = 100;) will throw a
        // NullPointerException.
    }

    // COPY CONSTRUCTOR
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.marks = s1.marks;
    }
}
