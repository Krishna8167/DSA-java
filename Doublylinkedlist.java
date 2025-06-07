/*
Doubly Linked List in Java
---------------------------
Each node contains:
  - data: value of the node
  - next: pointer to the next node
  - prev: pointer to the previous node

Advantages:
- Bi-directional traversal
- Easier to delete a node when you have its reference
- Backward traversal is possible

Disadvantages:
- Uses more memory (extra 'prev' pointer)
- More complex than singly linked list
*/
/*
public class DoublyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head; // start of the list

    // Insert at the beginning: O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
    }

    // Insert at the end: O(n)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null)
            current = current.next;

        current.next = newNode;
        newNode.prev = current;
    }

    // Insert at specific index: O(n)
    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; current != null && i < index - 1; i++)
            current = current.next;

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if (current.next != null)
            current.next.prev = newNode;

        current.next = newNode;
    }

    // Delete from beginning: O(1)
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
        if (head != null)
            head.prev = null;
    }

    // Delete from end: O(n)
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next != null)
            current = current.next;

        current.prev.next = null;
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
        for (int i = 0; current != null && i < index; i++)
            current = current.next;

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        if (current.next != null)
            current.next.prev = current.prev;

        if (current.prev != null)
            current.prev.next = current.next;
    }

    // Display forward: O(n)
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    // Display backward: O(n)
    public void displayBackward() {
        if (head == null) {
            System.out.println("Backward: List is empty.");
            return;
        }

        // Go to last node
        Node current = head;
        while (current.next != null)
            current = current.next;

        // Traverse backward
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("NULL");
    }

    // Main method to test
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insertions
        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.displayForward();   // 10 <-> 20 <-> 30 <-> 40 <-> 50
        list.displayBackward();  // 50 <-> 40 <-> 30 <-> 20 <-> 10

        // Insert at index
        list.insertAtIndex(25, 2);
        list.displayForward();   // 10 <-> 20 <-> 25 <-> 30 <-> 40 <-> 50

        // Deletions
        list.deleteFromBeginning();
        list.displayForward();   // 20 <-> 25 <-> 30 <-> 40 <-> 50

        list.deleteFromEnd();
        list.displayForward();   // 20 <-> 25 <-> 30 <-> 40

        list.deleteFromIndex(2);
        list.displayForward();   // 20 <-> 25 <-> 40
        list.displayBackward();  // 40 <-> 25 <-> 20
    }
}

*/