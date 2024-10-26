/* what will be output for the following code */
public class Q12ElectricCar extends Car {
   
    //final keyword within method means cant be overriden
    @Override
    public final String drive() {
        return "Driving electric car";
    }
    /*  This class extends Car and overrides the drive() method, declaring it as final. This means that this method cannot be overridden in any subclass of Q12ElectricCar. */

    public static void main(String[] args) {
        final Car car = new Q12ElectricCar();
        System.out.println(car.drive());
    } 
}

class Automobile {

    private String drive() {
        return "Driving vehicle";
    }
    /* This class has a private method drive(), which means it cannot be accessed by subclasses or any other classes. */
}

class Car extends Automobile {

    protected String drive() {
        return "Driving car";
    }
    /*This class extends Automobile and has a protected method drive(). The protected access modifier allows it to be accessed by subclasses and classes in the same package. */
}


/* Important Points
Dynamic Method Dispatch: Java uses dynamic method dispatch to decide at runtime which method to invoke. In this case, the drive() method of Q12ElectricCar is called, even though car is declared as type Car.

Private Methods: The private drive() method in Automobile is not accessible outside of Automobile, including in Car or Q12ElectricCar, so it does not interfere with the method calls in the derived classes.

Final Method: The drive() method in Q12ElectricCar is marked as final, which means it cannot be overridden in any further subclasses of Q12ElectricCar, ensuring its implementation remains unchanged. However, this does not affect the current call since we are dealing with a subclass. */