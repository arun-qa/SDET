package mandatoryHomeWork.DSA.week15;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Add elements from an array to the end of the linked list
    public void addAll(int[] arr) {
        for (int data : arr) {
            append(data);
        }
    }

    // Insert an element at a specific position in the linked list
    public void insert(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            int currentPosition = 0;
            while (current != null && currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }
            if (current == null) {
                System.out.println("Invalid position");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Remove all occurrences of a value from the linked list
    public void removeAll(int data) {
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (current.data == data) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }

    // Clone the linked list
    public LinkedList clone() {
        LinkedList newList = new LinkedList();
        Node current = head;
        while (current != null) {
            newList.append(current.data);
            current = current.next;
        }
        return newList;
    }

    // Append an element to the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class LinkedList_Methods {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int[] elementsToAdd = {1, 2, 3, 4, 3, 5, 6, 7, 3};
        list.addAll(elementsToAdd);

        System.out.println("Original Linked List:");
        list.display();

        list.insert(8, 2);
        System.out.println("Linked List after inserting 8 at position 2:");
        list.display();

        list.removeAll(3);
        System.out.println("Linked List after removing all occurrences of 3:");
        list.display();

        LinkedList clonedList = list.clone();
        System.out.println("Cloned Linked List:");
        clonedList.display();
    }
}
