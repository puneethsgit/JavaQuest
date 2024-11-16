/* what would be output for the following code */
public class Q10oops {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a+Test.b);
        Test t1 = new Test();
        t1.changeB();
        System.out.println(Test.a+Test.b);
    }
}

class Test {
    static int a = 10;
    static int b; //initalizes to zero
    static void changeB() {
        b = a * 3;
    }
}

//40