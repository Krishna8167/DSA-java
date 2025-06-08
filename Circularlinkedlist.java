/*
Circular Singly Linked List in Java
------------------------------------
Each node contains:
  - data: value of the node
  - next: pointer to the next node

But here, the last node points back to the head -> makes it circular!

Advantages:
- Useful in scenarios that need looping behavior
- More efficient circular queues / round robin

Care needed to avoid infinite loops.
*/
/*
public class CircularLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert at beginning: O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    // Insert at end: O(1)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Insert at specific index: O(n)
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; current != tail && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || (current == tail && index != 1)) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current == tail) {
            tail = newNode;
        }
    }

    // Delete from beginning: O(1)
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    // Delete from end: O(n)
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next = head;
            tail = current;
        }
    }

    // Delete from index: O(n)
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
        for (int i = 0; current.next != head && i < index - 1; i++) {
            current = current.next;
        }

        if (current.next == head || current.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        if (current.next == tail) {
            tail = current;
        }

        current.next = current.next.next;
    }

    // Display list: O(n)
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }

    // Main method to test
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);
        cll.display(); // Expected: 5 -> 10 -> 20 -> 30 -> (head)

        cll.insertAtIndex(15, 2);
        cll.display(); // Expected: 5 -> 10 -> 15 -> 20 -> 30 -> (head)

        cll.deleteFromBeginning();
        cll.display(); // Expected: 10 -> 15 -> 20 -> 30 -> (head)

        cll.deleteFromEnd();
        cll.display(); // Expected: 10 -> 15 -> 20 -> (head)

        cll.deleteFromIndex(1);
        cll.display(); // Expected: 10 -> 20 -> (head)
    }
}
*/