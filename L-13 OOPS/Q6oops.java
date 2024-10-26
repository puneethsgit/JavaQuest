/* what will be the output of this code? (both classes in same package) */
public class Q6oops {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print1(); 
        //ERROR because in vehicle obj1 (reference) it doesnt recognize the print1() func itself although car obj has both print & print1 func in previous it was possible because both method were same in name
        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle {
    void print() {
        System.out.println("Base class(Vehicle)");
    }
}

class Car extends Vehicle {
    void print1() {
        System.out.println("Derived class(car)");
    }
}

/* Q7 which of the following is not OOPs component ? inheritance, encapsulation, polymorphism, aggregation 
 * ANS : aggregation
 */