package mandatoryHomeWork.DSA.week15;

public class Day2_MiddleOfLinkedLists {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	class Solution {
	    //initialize Temp1 Listode from head
	    //Initialize counter variable
	    // We need the length of linked list so that we can find the middle position, for that we need to count how many nodes are present.
	    // For finding number of nodes, iterate the while loop with temp till it becomes != null and increment count for each iteration
	    // when the count completes , we can find the mid value by count/2 + 1
	    // create another Linknode as Temp2 for print the range nodes
	    // It starts from 1 to count and temp2 goes to next of present node
	    // return temp2 as result linklist
	    public ListNode middleNode(ListNode head) {

	        ListNode temp1 = head;
	        int count = 0;
	        while(temp1 != null){
	            count++;
	            temp1 = temp1.next;
	        }
	        count = count / 2 + 1;
	        ListNode temp2 = head;
	        for(int i=1;i<count;i++){
	            temp2 = temp2.next;
	        }
	        return temp2;
	        
	    }
	}

}
