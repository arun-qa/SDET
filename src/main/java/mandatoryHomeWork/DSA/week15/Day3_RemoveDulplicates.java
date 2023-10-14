package mandatoryHomeWork.DSA.week15;

public class Day3_RemoveDulplicates {
	
	//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
	//Pseudocode
	// Take the copy of head as temp
	// Iterate temp if temp & temp.next!=null
	// check the temp.val == temp.next.val
	// return head

	public ListNode deleteDuplicates(ListNode head) {

		ListNode temp = head;

		while (temp != null && temp.next != null) {
			if (temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}

			else {
				temp = temp.next;
			}

		}

		return head;

	}

}
