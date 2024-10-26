/* what is the output for the following */
abstract class Car {
    static {
        System.out.print("1");
    }
    
    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.print("3");
    }
}

public class BlueCar extends Car {
    {
        System.out.print("4");
    }

    public BlueCar(){
        super("blue"); //car class with parameter
        System.out.print("5");
    }
}

public class Q14oops {
    public static void main(String[] args) {
        new BlueCar();
    }
}
/* 13245 -> The class is loaded first, with the static initialization block called and 1 is outputted first. When the BlueCar is created in the main() method, the superclass initialization happens first. The instance initialization blocks are executed before the constructor, so 32 is outputted next. Finally, the class is loaded with the instance initialization blocks again being called before the constructor, outputting 45. The result is that 13245 is printed, making Option C the correct answer." */

/* Execution Process
Static Initialization of Car Class:

When the program starts, the JVM loads the Car class.
The static block in Car executes first:
java
Copy code
static {
    System.out.print("1"); // Output: 1
}
Creating an Instance of BlueCar:

When new BlueCar() is called, the following happens:
The constructor of the superclass (Car) is invoked before executing the constructor of BlueCar.
Instance Initialization of Car:

The instance initializer block of Car is executed next:
java
Copy code
{
    System.out.print("3"); // Output: 3
}
Constructor of Car:

The constructor of Car is executed:
java
Copy code
public Car(String name) {
    super();
    System.out.print("2"); // Output: 2
}
In this case, it is called with the argument "blue", so the output is 2.
Instance Initialization of BlueCar:

After the Car constructor finishes, control returns to the BlueCar constructor.
The instance initializer block of BlueCar is executed:
java
Copy code
{
    System.out.print("4"); // Output: 4
}
Constructor of BlueCar:

Finally, the constructor of BlueCar is executed:
java
Copy code
public BlueCar(){
    super("blue");
    System.out.print("5"); // Output: 5
}
Final Output
Putting it all together, the output is produced in the following sequence:

From the static block of Car: 1
From the instance initializer block of Car: 3
From the constructor of Car: 2
From the instance initializer block of BlueCar: 4
From the constructor of BlueCar: 5
Combined Output
So, the final output will be: 13245 */