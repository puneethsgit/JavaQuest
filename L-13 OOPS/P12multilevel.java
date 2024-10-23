/* Multilevel Inheritance: A chain of classes where one class extends another class */
public class P12multilevel {
    
    public static void main(String[] args) {
        Dog rio = new Dog();
        rio.legs = 4;
        rio.color = "brown";
        rio.eat();
        System.out.println(rio.color);
        System.out.println(rio.legs);
    }
}

class Animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}