/* CLASS - IT IS A BULE PRINT FOR OBJECT
   OBJECT - IT IS AN INSTANCE OF CLASS
   OOPS - STYLE OF WRITING CODE USING CLASS AND OBJECTS
 */

public class P1classobject {
    public static void main(String[] args) {
       Pen p1 = new Pen(); //created a pen object called p1 & Pen() is consructor
       System.out.println(p1.color); //prints null
       p1.setColor("Red"); //dot operator is used to access the property (attribute)
       System.out.println(p1.color);
       p1.setTip(5);
       System.out.println(p1.tip);
       //p1.setColor("yellow")
       p1.color = "yellow";
       System.out.println(p1.color);
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

class Student {
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}