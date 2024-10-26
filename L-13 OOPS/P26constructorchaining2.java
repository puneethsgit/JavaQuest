/* CONSTRUCTOR CHAINING WITH SUPERCLASS AND SUBCLASS */
public class P26constructorchaining2 {
    public static void main(String[] args) {
        Car myCar = new Car("SUV", "Toyota");
    }
}

class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    String brand;

    public Car(String type, String brand) {
        super(type); // Calls Vehicle's constructor
        this.brand = brand;
        System.out.println("Car brand: " + brand);
    }
}
