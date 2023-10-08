package mandatoryHomeWork.DSA.week15;

public class LinkedList_NodeCreation {

	public class Node {
		int data;
		Node next;

		Node(int key) {
			this.data = key;
			this.next = null;
		}
	}

	Node head;
	Node tail;

	public Node add(int data) {
		Node node = new Node(data);

		if (head == null) {
			// If the list is empty, set both head and tail to the new node
			head = node;
			tail = node;
		} else {
			// If the list is not empty, append the new node to the tail and update the tail
			// reference
			tail.next = node;
			tail = node;
		}
		return node;
	}

	public static void main(String[] args) {
		LinkedList_NodeCreation list = new LinkedList_NodeCreation();

		// Adding values to the linked list
		list.add(11);
		list.add(12);
		list.add(13);

		
	}
}