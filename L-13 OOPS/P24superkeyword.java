public class P24superkeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;
    Animal() {
        System.out.println("animal constructor called");
    }
}
  
class Horse extends Animal {
    Horse() {
        super.color = "brown";
        //super(); //calls parent first even if we wont define this it calls becaz java add super() bydefault
        System.out.println("horse constructor called");
    }
}