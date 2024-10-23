/* Hierarchical Inheritance: Multiple classes extend the same superclass. here superclass means parent class and sub class means child class */
public class P13hirearchiacl {
    public static void main(String[] args) {
        Bird eagle = new Bird();
        eagle.eat();
        eagle.color = "brown";
        System.out.println(eagle.color);
        Fish shark = new Fish();
        shark.eat();
        shark.color = "silver";
        System.out.println(shark.color);
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("flys");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}
