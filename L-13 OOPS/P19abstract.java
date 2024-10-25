/* ABSTRACTION -> HIDING ALL THE UNNNECESSARY DETAILS AND SHOWING ONLY THE IMPORTANT PARTSS TO THE USER */
/* abstraction is similar to encapsulation in encapsulation data and function stored in a capsul (class) and using access specifiers and modifiers (getter and setter) we were hiding data using private, protected, default and abstraction is similar to data hiding
 * ABSTRACTION -> HIDE UNIMPORTANT THINGS AND SHOWING IMPORTANT THINGS TO THE USER
 * ENCAPSULATION -> WRAP UP DATA AND RELATED FUNCTION AND IT HELPS IN IMPLEMENTING DATA HIDING 
 ABSTRACTION CAN BE IMPLEMENTED IN 2 WAYS - abstract class (giving only idea but not the implementation part meaning of abstract) OR interfaces 
 *-------------------------------------------------------------------------------------------------------*/
/* abstract :
-> CANNOT CREATE AN INSTANCE (OBJECT) OF ABSTRACT CLASS
-> CAN HAVE ABSTRACT / NON ABSTRACT METHOD
-> CAN HAVE CONSTRUCTOR 
 */
public class P19abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
        System.out.println(c.color);
        h.changeColor();
        c.changeColor();
        System.out.println(h.color);
        System.out.println(c.color);
       // Animal a = new Animal(); //gives error cant create object(intstance) for abstract class
    }
}

abstract class  Animal {
    String color; 
    //constructor
    Animal() {
        color = "brown";
    }
    void eat() {
        System.out.println("Animal eats");
    }

    /* The @SuppressWarnings("unused") annotation in Java is used to inform the compiler to ignore specific warnings related to unused code elements. When you apply this annotation, it tells the compiler not to generate warnings for the elements it decorates, which can include variables, methods, or classes that are declared but not used anywhere in the code. */

    @SuppressWarnings("unused")
    abstract void walk();
     //abstract method dont have implementation & for this method sub-class defines the implementation
}

class Horse extends Animal {

    void changeColor() {
        color = "darkbrown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("walks on 2 legs"); //different implementation
    }
}