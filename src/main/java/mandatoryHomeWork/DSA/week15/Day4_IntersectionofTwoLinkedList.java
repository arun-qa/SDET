package mandatoryHomeWork.DSA.week15;

import java.util.HashSet;
import java.util.Set;

public class Day4_IntersectionofTwoLinkedList {
	
	/*  https://leetcode.com/problems/intersection-of-two-linked-lists/ 
	 * 
	 * Pseudocode
	 *  1. Create the hashSet 
	 *  2. Iterate each node with while loop & store each node1 (headA) address 
	 *  3. Iterate with headB and get the address of the each and check whether the address contains in set
	 *  4. If yes return the head	else return null
	 */

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		Set<ListNode> set = new HashSet();

		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		while (headB != null) {
			if (set.contains(headB)) {
				return headB;

			}

			headB = headB.next;

		}

		return null;

	}

}
