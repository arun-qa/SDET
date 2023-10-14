package mandatoryHomeWork.DSA.week15;

public class Day4_BinarytoInteger {
	
	 /* https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
	  * Pseudocode
	  * 
	  * Create empty String
	  * Iterate while loop & get the value of each node
	  * Append each node value in String
	  * Using Integer.parseInt get the decimal value & return it
	  */

	public int getDecimalValue(ListNode head) {

		String empty = "";

		while (head != null) {
			int value = head.val;

			empty = empty + "" + value;

			head = head.next;

		}

		int decimal = Integer.parseInt(empty, 2);
		return decimal;

	}

}
