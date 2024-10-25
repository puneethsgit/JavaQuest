/* RUN TIME POLYMORPHISM METHOD OVERRIDING 
 Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class.
 */

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    @Override
    /*
     * In Java, the @Override annotation is optional. It is not required, but it’s a
     * good practice to include it when you override a method in a subclass.
     * The @Override annotation helps to ensure that you’re actually overriding a
     * method in the superclass and not accidentally creating a new method with a
     * similar signature.
     */
    void eat() {
        System.out.println("eats grass");
    }
}

public class P17overriding {
    public static void main(String[] args) {
        Deer d1 = new Deer();
        d1.eat();
    }
}
