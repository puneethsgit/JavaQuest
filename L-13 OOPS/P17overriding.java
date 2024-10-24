/* RUN TIME POLYMORPHISM METHOD OVERRIDING 
 Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class.
 */

 class Animal {
    void eat() {
        System.out.println("eats anything");
    }
 }

 class Deer extends Animal {
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
