package mandatoryHomeWork.DSA.week15;

/* https://leetcode.com/problems/merge-two-sorted-lists/
* 
* 1. Create dummy ListNode to store the result 
* 2. Assign the list1 to linkedList1 and list2 to linkedList2
* 3. Check for the condition linkedList1 and currentNode2 != null
* 4. Use two pointer one at list1 and another at list2
* 5. Check for the condition linkedList1.value<=linkedList2.value
* 		if yes add the linkedList1 in the dummy listNode and move the to linkedList1.next
* 		else add the linkedList2 in the dummy listNode and move the to linkedList2.next
* 		then move the pointer
* 6. Then check for the condition linkedList1!=null to check Attach the remaining nodes from either list
* 		add the remaining nodes
* 7. Return the dummy nodes. 
* 
*/

public class Day2_MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);

        ListNode newNode = dummy;

        ListNode linkedList1 = list1;
        ListNode linkedList2 = list2;

        while(linkedList1 != null && linkedList2 !=null)
        {
            if(linkedList1.val<=linkedList2.val)
            {
                newNode.next = linkedList1;
                linkedList1 = linkedList1.next;
            }
            else 
            {
                newNode.next = linkedList2;
                linkedList2 = linkedList2.next;
            }

            newNode = newNode.next;
        }

        if(linkedList1 != null)
        {
        newNode.next = linkedList1;
  
        }
        else
        {
            newNode.next = linkedList2;
        }

            return dummy.next;
        
    }

}
