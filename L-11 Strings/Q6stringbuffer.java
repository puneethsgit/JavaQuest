/*Mutable: Unlike String, which is immutable, StringBuffer allows you to modify the contents of a string without creating a new object each time you make a change.
StringBuffer is particularly useful in scenarios where you need to modify strings frequently and where thread safety is a concern. */
public class Q6stringbuffer {
    public static void main(String[] args) {
        // Create a new StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Append a string
        sb.append(" World"); // Now sb contains "Hello World"
        System.out.println(sb); // Output: Hello World

        // Insert a string at a specific index
        sb.insert(5, ","); // Now sb contains "Hello, World"
        System.out.println(sb); // Output: Hello, World

        // Delete a substring
        sb.delete(5, 6); // Removes the comma; now sb contains "Hello World"
        System.out.println(sb); // Output: Hello World

        // Reverse the string
        sb.reverse(); // Now sb contains "dlroW olleH"
        System.out.println(sb); // Output: dlroW olleH

        // Convert StringBuffer to String
        String result = sb.toString();
        System.out.println(result); // Output: dlroW olleH
    }
}
/* StringBuilder and StringBuffer in Java are both mutable classes that allow you to create and modify strings without creating new objects for every modification. However, there are key differences between them. Here’s a detailed comparison: 
Choose StringBuffer when you need thread safety and are working in a multi-threaded environment. Opt for StringBuilder when performance is critical, and you are working in a single-threaded environment.

Summary
StringBuffer ->> Synchronized (thread-safe), Slower due to synchronization, Multi-threaded applications, Higher memory consumption

StringBuilder ->> Not synchronized (not thread-safe), Faster in single-threaded contexts, Single-threaded applications, 
More memory-efficient

 */

 /* Thread Safe  means When a method or class is synchronized, it means that access to it is controlled, allowing only one thread to execute that code at a time. This prevents multiple threads from interfering with each other, which is crucial in a multi-threaded environment. StringBuffer is designed to be used safely in a multi-threaded environment.*/