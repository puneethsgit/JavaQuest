/* MULTIPLE INHERITANCE MEANS CLASS A & CLASS B BUT CLASS C INHERIT BOTH CLASS A & B
 Java does not support multiple inheritance with classes */
/* class A {
   void display() {
       System.out.println("Class A");
   }
}

class B {
   void show() {
       System.out.println("Class B");
   }
}

// This will cause a compile-time error
class C extends A, B { // Not allowed
}
---------------------------------------------------*/
/* 
interface A {
   void display();
}

interface B {
   void show();
}

class C implements A, B {
   public void display() {
       System.out.println("Display from Class C");
   }
   
   public void show() {
       System.out.println("Show from Class C");
   }
}

 */
public class P15multiple {
    public static void main(String[] args) {
        Deer deer = new Deer();
        Lion lion = new Lion();
        Bear bear = new Bear();

        deer.eatPlants();
        //deer.eatMeat(); - error cant find symbol
        lion.eatMeat();
        bear.eatMeat();
        bear.eatPlants();
    }
}

interface Herbivore {
    void eatPlants();
}

interface Carnivore {
    void eatMeat();
}

class Deer implements Herbivore {
    public void eatPlants() {
        System.out.println("Deer eats plants.");
    }
}

class Lion implements Carnivore {
    public void eatMeat() {
        System.out.println("Lion eats meat.");
    }
}

class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eat plants.");
    }

    public void eatMeat() {
        System.out.println("Bear eat meat.");
    }
}
