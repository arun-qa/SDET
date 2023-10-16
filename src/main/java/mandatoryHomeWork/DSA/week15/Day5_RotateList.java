package mandatoryHomeWork.DSA.week15;

import org.junit.Test;

import junit.framework.Assert;

public class Day5_RotateList {
	

    @Test
    public void test(){
        SinglyLinkedList list =  new SinglyLinkedList();
        list.add(new int[]{1,2,3,4,5});
        ListNode a = rotateRight(list.head , 3);
        System.out.println(list.print(a));
        Assert.assertEquals(list.print(a), "[3,4,5,1,2,]");

    }

    public ListNode rotateRight(ListNode head, int k) {
        //head as null, so returning null
        if(head==null) return null;
        //init
        ListNode tail =head;
        int size  = 1, counter = 0;
        //finding the size of the list and also finding the tail
        while(tail.next != null) {
            tail = tail.next;
            size++;
        }
        //find the optimum rotation required
        k %= size;

        //if no rotation required retuning head
        if(k==0) return head;

        ListNode temp =head;

        //iterating till the end-1 of list1
        while(counter < size-k-1){
            temp = temp.next;
            counter++;
        }
        ListNode newHead = temp.next;
        temp.next = null;
        tail.next = head;

        return newHead;
    }

}
