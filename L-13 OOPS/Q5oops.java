/* what will be the output of this code? (both classes in same package) */
public class Q5oops {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print(); //method overriding
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
    void print() {
        System.out.println("Derived class(car)");
    }
}
