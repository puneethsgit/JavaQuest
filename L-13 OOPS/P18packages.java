/*
 * In Java, packages help organize code, making it easier to manage, reuse, and avoid conflicts.
 * There are two main types:
 */

/* 
 * Built-in Packages: Provided by Java and include common libraries for I/O, networking, utilities, etc.
 * Examples:
 * - java.lang: Contains core classes like String, Math, System.
 * - java.util: Provides utility classes like ArrayList, HashMap.
 * - java.io: For input and output operations.
 */

/*
 * User-defined Packages: Custom packages created by programmers for organizing project-specific classes, 
 * avoiding naming conflicts, and making code reusable.
 */

/*
 * Creating a User-defined Package
 * Step 1: Define the Package
 * - Use the 'package' keyword at the top of the Java file to specify the package name.
 * - Example: Create a package named 'myPackage'.
 */

// File: MyClass.java
/* 
--------------------
 package myPackage;

public class MyClass {
    public void display() {
        System.out.println("Hello from MyClass in myPackage!");
    }
}
---------------------
 */


/*
 * Step 2: Compile the Class
 * - Compile the Java file from the command line, specifying the path for
 * package creation.
 * - Command: javac -d . MyClass.java
 * - This creates a folder structure matching the package name (myPackage) with
 * .class files inside.
 */

/*
 * Step 3: Using the User-defined Package in Another Class
 * - To use the 'myPackage', import it with the 'import' statement in a
 * different class file.
 */

// File: MainClass.java
/*--------------------------- 
import myPackage.MyClass;

public class MainClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
-------------------------------*/


/*
 * Step 4: Compile and Run the Main Class
 * - Compile with: javac MainClass.java
 * - Run with: java MainClass
 * - Output: Hello from MyClass in myPackage!
 */

/*
 * Why the -d Option is Necessary
 * - The '-d' option in 'javac -d . MyClass.java' tells the compiler where to
 * place the .class file
 * in the correct package directory.
 *
 * 1. Directory Creation
 * - '-d' creates the package structure if it doesn’t exist, placing .class
 * files in the right folder.
 * - Without '-d', .class files would be in the current directory, breaking
 * package rules.
 *
 * 2. Java Package Consistency
 * - Classes in packages must be in directories matching the package name.
 * - '-d' enforces this, ensuring 'MyClass.class' is stored as
 * './myPackage/MyClass.class'.
 *
 * 3. Specifying the Root Directory
 * - '-d .' sets the current directory as the root for package folders.
 * - Replace '.' with another path (e.g., '-d src/') to change the root
 * directory.
 */

/*
 * Importing Classes
 * - 'import myPackage.MyClass;' imports only MyClass from myPackage.
 * - 'import myPackage.*;' imports all classes from myPackage.
 */

public class P18packages {

}
