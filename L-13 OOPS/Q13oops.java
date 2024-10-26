/*Look at the following code and chose the right option for the word */
/* 
 (a)Only Protected can be Used
 (b)Public and Protected both can be Used
 (c)Public, Protected & Private can be Used
 (d)Only Public can be Used 
 */

//Shape.java file
public class Shape {
    protected void display() {
        System.out.println("Display-Base");
    }
}

//Circle.java file
public class Circle extends Shape {
   <acces - modifier to define > void display() {
        System.out.println("Display-Derived");
    }
}

/* ANS : public and protected both can be used, You Can provide only a less restricitive or same-access modifiers when overriding a method */