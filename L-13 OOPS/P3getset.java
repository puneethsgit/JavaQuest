/* GETTER & SETTER 
  this - this keyword is used to refer to the current object 
  getter and setter -  are methods used to access and modify the private fields (variable) of a class 
  also this approach adheres to the principle of encapsulation in OOPs where you restrict direct access to an
  object fields and provide controlled access through methods
*/
public class P3getset {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color){
        this.color = color;
    }  //here this is more useful when the variable name and method name are same

    void setTip(int newTip){
        tip = newTip;
    }

}