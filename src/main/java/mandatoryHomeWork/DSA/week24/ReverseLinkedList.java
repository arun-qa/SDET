package mandatoryHomeWork.DSA.week24;

import org.junit.Test;

public class ReverseLinkedList {
	
	public class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node addNode(int data)
	{
		Node node = new Node(data);
		return node;
	}
	
	public void printAllNodes(Node node)
	{
		while(node !=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
	}
	@Test
	public void testReverseNodes()
	{
		Node head = addNode(8);
		
		Node second = addNode(11);
		head.next = second;
		
		Node last = addNode(4);
		second.next = last;
		
		printAllNodes(head);
		printAllNodes(reverseNodes(head));
	}
	
	public Node reverseNodes(Node node)
	{
		Node head = node, prev = null, next = null;
		
		while(head!=null) {
			//next
			next = head.next;
			//prev
			head.next = prev;
			//swap
			prev = head;
			head = next;
			
		}
		
		return prev;
	}

}
