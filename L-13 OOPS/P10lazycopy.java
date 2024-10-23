public class P10lazycopy {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "puneeth";
        s1.rollno = 75;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 99;

        // Creating a lazy copy of s1
        Student s2 = new Student(s1);
        s2.password = "xyz"; // Changing password should not affect s1

        // s1.marks[2] = 100; -> shallow copy

        // Changing marks in s1
        s1.setMark(2, 100); // Modify the marks array of s1

        System.out.println("Marks in s2 (before modification):");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]); // Initially shares reference with s1
        }

        // Changing a mark in s2
        s2.setMark(0, 95); // This should trigger a deep copy if marks array is not yet copied

        System.out.println("\nMarks after modifying s2:");
        for (int i = 0; i < 3; i++) {
            System.out.println("s2.marks[" + i + "] = " + s2.marks[i]);
        }

        System.out.println("\nMarks in s1 after s2 modification:");
        for (int i = 0; i < 3; i++) {
            System.out.println("s1.marks[" + i + "] = " + s1.marks[i]); // because of 19th line
        }
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];
    boolean isCopied = false; // Flag to check if deep copy has occurred

    // DEFAULT CONSTRUCTOR
    Student() {
        marks = new int[3];
    }

    // COPY CONSTRUCTOR (shallow copy)
    Student(Student s1) {
        this.name = s1.name;
        this.rollno = s1.rollno;
        this.password = s1.password;
        this.marks = s1.marks; // Initially share the same reference
    }

    // Method to set marks (this simulates a modification)
    void setMark(int index, int value) {
        if (!isCopied) {
            // Perform deep copy since we are going to modify the marks
            marks = new int[3];
            for (int i = 0; i < 3; i++) {
                marks[i] = this.marks[i]; // Deep copy of the array
            }
            isCopied = true; // Mark as copied
        }
        marks[index] = value; // Modify the marks
    }
}
