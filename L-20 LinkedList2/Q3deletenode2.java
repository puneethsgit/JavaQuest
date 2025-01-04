/* previous code was styled c, c++ used format specfier, \n here's the modern styled code */
public class Q3deletenode2 {
    // Node class representing an element in the linked list
static class Node {
    int data; // Stores the data of the node
    Node next; // Points to the next node in the list
}

// Function to push a new node with given data at the beginning of the list
static Node push(Node head_ref, int new_data) {
    Node new_node = new Node(); // Create a new node
    new_node.data = new_data; // Set the data of the new node
    new_node.next = head_ref; // Make the new node point to the current head
    head_ref = new_node; // Move the head pointer to the new node
    return head_ref; // Return the new head of the list
}

// Function to print the linked list
static void printList(Node head) {
    Node temp = head; // Temporary node to traverse the list
    while (temp != null) { // Loop through the list until the end
        System.out.print(temp.data + " "); // Print the data of the current node
        temp = temp.next; // Move to the next node
    }
    System.out.println(); // Print a newline after printing the list
}

// Function to delete N nodes after skipping M nodes in the linked list
static void skipMdeleteN(Node head, int M, int N) {
    Node curr = head, t; // curr will traverse the list, t will be used to skip and delete nodes
    int count; // Counter to keep track of nodes processed

    while (curr != null) { // Loop until the end of the list
        // Retain M nodes
        for (count = 1; count < M && curr != null; count++) {
            curr = curr.next; // Move to the next node
        }

        if (curr == null) { // If the list ends, exit the function
            return;
        }

        // Delete N nodes
        t = curr.next; // The node to start deletion from
        for (count = 1; count <= N && t != null; count++) {
            t = t.next; // Skip N nodes
        }

        curr.next = t; // Link the retained part to the rest of the list
        curr = t; // Move the current pointer to the next retained node
    }
}

// Main function to test the above functions
public static void main(String[] args) {
    Node head = null; // Initialize the head of the list as null
    int M = 2, N = 3; // Set the values for M and N

    // Creating the linked list by pushing nodes at the beginning
    head = push(head, 10);
    head = push(head, 9);
    head = push(head, 8);
    head = push(head, 7);
    head = push(head, 6);
    head = push(head, 5);
    head = push(head, 4);
    head = push(head, 3);
    head = push(head, 2);
    head = push(head, 1);

    System.out.println("M = " + M + ", N = " + N); // Print the values of M and N
    System.out.println("Linked list we have is:"); // Print the original list
    printList(head);

    // Perform the operation of skipping M nodes and deleting N nodes
    skipMdeleteN(head, M, N);

    System.out.println("\nLinked list on deletion is:"); // Print the modified list after deletion
    printList(head);
}

}
