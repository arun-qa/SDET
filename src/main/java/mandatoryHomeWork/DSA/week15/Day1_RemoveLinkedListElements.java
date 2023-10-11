package mandatoryHomeWork.DSA.week15;

public class Day1_RemoveLinkedListElements {
	
	/** https://leetcode.com/problems/remove-linked-list-elements/
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */

	 /** Pseudo code
	 * Create dummy Node and assign value as 0
	 * Assign dummy.next as head;
	 * Assign current node as head and previous as dummy
	 * Iterate while loop till current !=null
	 * If current == value then assign previous. next as current.next
	 * else previous = current;
	 * current = current .next;
	 * return dummy.next
	 *
	 */
	class Solution {
	    public ListNode removeElements(ListNode head, int val) {

	        ListNode dummy = new ListNode(0);

	        dummy.next=head;

	        ListNode current = head, previous = dummy;

	        while(current!=null)
	        {
	            if(current.val == val)
	            previous.next = current.next;
	            else
	            previous = current;
	            current = current.next;
	        }

	       return  dummy.next;
	        
	    }
	}

}
