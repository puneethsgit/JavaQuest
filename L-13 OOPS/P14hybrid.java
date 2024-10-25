/* In Java, hybrid inheritance refers to a combination of multiple inheritance models,Hybrid Inheritance Using Classes: Not allowed in Java because a class can only extend one class. Fully supported; a class can implement multiple interfaces, allowing for a combination of behaviors from different sources*/
public class P14hybrid {
    public static void main(String[] args) {
        // Create an instance of Duck
        Duck duck = new Duck();

        // Calling methods from Duck and its parent class
        duck.eat(); // Inherited from Animal class
        duck.swim(); // Implemented from Swimmer interface
        duck.fly(); // Implemented from Flyer interface
        duck.display(); // Duck's specific method
    }

}

interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Duck extends Animal implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Duck swims in water.");
    }

    public void fly() {
        System.out.println("Duck flies in the sky.");
    }

    public void display() {
        System.out.println("Duck is both a swimmer and a flyer.");
    }
}
