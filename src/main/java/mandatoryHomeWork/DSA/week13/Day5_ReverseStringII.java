package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

import junit.framework.Assert;

public class Day5_ReverseStringII {

	/*
	 * https://leetcode.com/problems/reverse-string-ii/description/
	 * 
	 * 
	 * Pseudocode Get the input string and integer k value declare two variables
	 * start and end and assign 0 for both start a for loop and iterate till the end
	 * of the string, for each iteration a. set start as the current index position
	 * and end as the minimum of (start+k-1) and s'length b. get the substring
	 * within the start and end range and do reverse c. Increment the index by 2*K
	 * to move to the next substring return the final output string Time complexity
	 * - O[N] Space complexity - O[1]
	 */

	@Test
	public void test1() {
		
		Assert.assertEquals("bacdfeg", findReverseString("abcdefg",2));
	}
	
	@Test
	public void test2() {
		
		Assert.assertEquals("bacd", findReverseString("abcd",2));
	}

	private String findReverseString(String s, int k) {
		int start = 0;
		int end = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i += 2 * k) { // O[N]
			start = i;
			end = Math.min(i + k - 1, s.length() - 1);
			while (start < end) {

				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;

				start++;
				end--;
			}

		}
		return new String(ch);
	}

}
