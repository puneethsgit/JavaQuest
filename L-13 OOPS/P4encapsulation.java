/* ENCAPSULATION IS DEFINED AS THE WRAPPING UP OF DATA AND METHOD UNDER A SINGLE UNIT (CLASS). IT IS ALSO IMPLEMENTS DATA HIDING AND THIS IS KNOWN AS ENCAPSULATION */

// Person class with encapsulated fields
class Person {
    // Private fields (data)
    private String name;
    private int age;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // Adding validation in setter to control data access
        if (age > 0) { // Only set if age is positive
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be positive.");
        }
    }
}

public class P4encapsulation {
    public static void main(String[] args) {
        // Creating an instance of the Person class (an object)
        Person person = new Person();

        // Setting the values using setter methods
        person.setName("John Doe");
        person.setAge(25);

        // Accessing the values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Trying to set an invalid age
        person.setAge(-5); // This will trigger the validation and print an error message
    }
}
