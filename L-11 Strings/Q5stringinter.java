/* The intern() method is used to return a canonical representation of the string object. When you call intern() on a string, it checks if the string already exists in the pool of strings. If it does, it returns the reference from the pool; otherwise, it adds the string to the pool and then returns its reference. 
 */
public class Q5stringinter {
        public static void main(String[] args) {
            String str1 = new String("Hello");
            String str2 = new String("Hello");
    
            // str1 and str2 reference different objects
            System.out.println(str1 == str2); // Output: false
    
            // Interning both strings
            String internedStr1 = str1.intern();
            String internedStr2 = str2.intern();
            
            System.out.println(internedStr1);
            System.out.println(internedStr2);

            // Both internedStr1 and internedStr2 reference the same object in the string pool
            System.out.println(internedStr1 == internedStr2); // Output: true
    
            // String literal directly created is already in the pool
            String str3 = "Hello";
            System.out.println(str1.intern() == str3); // Output: true
        }
    }

/* 1. Understanding Strings in Java
Strings are Immutable: In Java, strings are immutable, which means once you create a string, you cannot change its value. If you try to modify a string (like adding characters), Java actually creates a new string object instead of changing the original. This can lead to increased memory usage if you are constantly creating new strings.

2. String Pool and intern()
The intern() method is beneficial for managing memory by ensuring that only one copy of each unique string exists. However, since strings are immutable, if you need to change the string (like appending, modifying, or concatenating), you will end up creating a new string

.
3. Using StringBuilder
Mutable Strings: When you need to perform a lot of modifications to a string (like appending, deleting, or changing characters), it’s better to use StringBuilder or StringBuffer. These classes allow you to create a string that can be changed (mutated) without creating new objects each time.

Performance: Using StringBuilder for string manipulations is more efficient because it reduces the overhead of creating multiple string objects, which is what happens when you use regular strings. */