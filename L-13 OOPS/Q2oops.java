/* which variable(s) can the Person class access */
class Person {
    String name;
    int weight;
}

class Student extends Person {
    int rollNumber;
    String schoolName;
}

public class Q2oops {
    
}

/* ANSWER is name & weight variable because Person class can access its own variable if question for Student class then name, weight, rollNumber, schoolName all the variable can be accessed because Student class inherits the properties of parent class so it can access all the variables */

/* -> Q3 
Which of following modifiers are not allowed in front of class? private, protected, public, default
 * ANSWER :- PRIVATE, PROCTECTED
 because public can exits & default also exits(if wont specify means bydefault it will be default) private and protected becomes unusable class by which we cant even create the object instance from those class so in java this two are not allowed
 */

 /* -> Q4
  Which of the following is a correct statement? (Both classes in same package)
  class Vehicle {}
  class Car extends Vehicle {}
  (a) Car c = new Car() [correct]
  (b) Vehicle v = new Vehicle() [correct]
  (c) Vehicle v = new Car(); [correct]
  (d) Car c = new Vehicle(); [leads to run time error (check notes)]
  */