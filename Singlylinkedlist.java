/*
Singly Linked List in Java
---------------------------
A Linked List is a linear data structure where each element is a separate object (called a node).
Each node contains:
  - data: stores the value
  - next: a reference to the next node

Singly Linked List connects nodes in one direction (forward). It is dynamic, meaning we can grow or shrink it easily.

Key Advantages:
- No fixed size (like arrays)
- Efficient insertion and deletion at the beginning
- Easy to implement stacks, queues, graphs

Drawbacks:
- No direct access to middle elements (unlike arrays)
- More memory (because of the next pointer)

Operations covered in this program:
- Insert at beginning, end, and specific index
- Delete from beginning, end, and specific index
- Display the list
*/
/* 
public class SinglyLinkedList {

    // Node class: represents each element in the list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list (first node)
    private Node head;

    // Insert at the beginning: O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // create new node
        newNode.next = head;           // point newNode to current head
        head = newNode;                // update head to newNode
    }

    // Insert at the end: O(n)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next; // move to the last node
        }
        current.next = newNode;
    }

    // Insert at specific index: O(n)
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // Delete from beginning: O(1)
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next; // move head to the next node
    }

    // Delete from end: O(n)
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null; // list has only one element
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next; // move to second last node
        }
        current.next = null;
    }

    // Delete from specific index: O(n)
    public void deleteFromIndex(int index) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (index == 0) {
            deleteFromBeginning();
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        current.next = current.next.next;
    }

    // Display the list: O(n)
    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Main method to test all operations
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display(); // Expected: 10 -> 20 -> 30 -> 40 -> 50 -> NULL

        // Insert at index
        list.insertAtIndex(25, 2);
        list.display(); // Expected: 10 -> 20 -> 25 -> 30 -> 40 -> 50 -> NULL

        // Deletion
        list.deleteFromBeginning();
        list.display(); // Expected: 20 -> 25 -> 30 -> 40 -> 50 -> NULL

        list.deleteFromEnd();
        list.display(); // Expected: 20 -> 25 -> 30 -> 40 -> NULL

        list.deleteFromIndex(2);
        list.display(); // Expected: 20 -> 25 -> 40 -> NULL
    }
}

*/