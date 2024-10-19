public class P6constructorexam {
    public static void main(String[] args) {
        // Even though no constructor is defined, this works because Java provides a
        // default constructor
        Car myCar = new Car(); // Java calls the default constructor here
        System.out.println(myCar.brand); // Output: null (default for String)
        System.out.println(myCar.year); // Output: 0 (default for int)

        // Calling the user-defined constructor with parameters
        Car2 myCar2 = new Car2("Tesla", 2021);
        System.out.println(myCar2.brand); // Output: Tesla
        System.out.println(myCar2.year); // Output: 2021
    }
}

class Car {
    String brand;
    int year;
}

class Car2 {
    String brand;
    int year;

    // Constructor defined to initialize fields
    Car2(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}
