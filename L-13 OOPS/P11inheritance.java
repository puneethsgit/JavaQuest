/* INHERITANCE IS WHEN PROPERTIES AND METHODS OF BASE CLASS ARE PASSED ON TO A DERIVED CLASS 
 TYPES : SINGLE LEVEL, MULTI LEVEL, HIERARCHICAL, HYBRID 
*/
public class P11inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eats();
        System.out.println(shark.fins); //OUTPUT ZERO
        System.out.println(shark.color); //OUTPUT NULL
        shark.color = "white";
        System.out.println(shark.color); //OUTPUT WHITE
    }
}

/* SINGLE LEVEL INHERITANCE - SI */   

//BASE CLASS
class Animal {
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

//DERIVED CLASS
class Fish extends Animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
 }
