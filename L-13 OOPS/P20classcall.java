public class P20classcall {
    public static void main(String[] args) {
        Mustang m = new Mustang();
    }
}

abstract class Animal {
    Animal() {
        System.out.println("animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor called");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}