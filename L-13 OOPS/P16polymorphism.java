/* Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and
morphism means ‘forms’.
TYPES - compile time (static) - METHOD OVERLOADING & runtime (dynamic) - METHOD OVERRIDING
 */

/* COMPILE TIME POLYMORPHISM METHOD OVERLOADING
 METHOD OVERLOADING MEANS MULTIPLE FUNCTION WITH SAME NAME BUT DIFFERENT PARAMETERS 
1. The type of the parameters passed to the function.
2. The number of parameters passed to the function.
NOTE : RETURN TYPE DOESN'T MATTERS

*/

public class P16polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.2, (float) 1.3));
        // error: no suitable method found for sum(double,double)
        System.out.println(calc.sum(1, 2, 2));

    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}
