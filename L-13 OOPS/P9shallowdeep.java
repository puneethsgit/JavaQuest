/* Shallow Copy: Copies references of objects. Both original and copy share the same reference.
Deep Copy: Copies the actual objects, meaning changes to the original object don't affect the copy. */
public class P9shallowdeep {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "puneeth";
        s1.rollno = 75;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 89;
        s1.marks[2] = 99;

      
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
       
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[];

    // DEFAULT CONSTRUCTOR
    Student() {
        marks = new int[3];
    }

    // COPY CONSTRUCTOR
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.rollno = s1.rollno;
    //     this.marks = s1.marks;
    // }

    //DEEP COPY CONSTRUCTOR
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}