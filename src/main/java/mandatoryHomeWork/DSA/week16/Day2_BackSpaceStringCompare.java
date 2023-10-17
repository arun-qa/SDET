package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

public class Day2_BackSpaceStringCompare {
	
	/* https://leetcode.com/problems/backspace-string-compare/description/
	 * 
	 * Pseudocode
	 * Get an input as String, String and output as boolean
	 * Create two stacks since we have two input Strings
	 * Iterate for loop for first String input & store the each character in stack
	 * Iterate another for loop for second String input & store the each character in stack
	 * Compare both the stack, if both are equal, reurn true
	 * else return false
	 *  
	 */

	public boolean backspaceCompare(String s, String t) {

		Stack<String> s1 = new Stack<String>();

		Stack<String> t1 = new Stack<String>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != '#') {
				s1.push(s);
			} else {
				s1.pop();
			}

		}
		for (int i = 0; i < t.length(); i++) {
			char ch = s.charAt(i);

			if (ch != '#') {
				t1.push(s);
			} else {
				t1.pop();
			}

		}
		
		if(s1.equals(t1))

		return true;
		
		else
			
			return false;

	}

}
