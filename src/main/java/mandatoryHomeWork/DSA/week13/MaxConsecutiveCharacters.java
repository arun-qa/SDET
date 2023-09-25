package mandatoryHomeWork.DSA.week13;

import org.junit.Test;

import junit.framework.Assert;

public class MaxConsecutiveCharacters {
	
	/*https://leetcode.com/problems/consecutive-characters/description/
	 * 
	 * Pseudocode
	 * Input should be String and output as int
	 * Initiate variables start, end, length
	 * Iterate while loop till end is less than the s.length
	 * Check each character at end and increment the end
	 * Check another condition using while loop end should be less than s.length and s.charAt(end)==ch
	 * find the length by comparing the length value and end - start
	 * Assign start = end 
	 * return length
	 * 
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(5, maxPower("abbcccdddcbaeeeee"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, maxPower("a"));
	}

	public int maxPower(String s) {

		int start = 0;
		int end = 0;
		int maxlength = 0;

		while (end < s.length()) {
			char ch = s.charAt(end);
			end++;
			while (end < s.length() && s.charAt(end) == ch) {
				end++;
			}
			maxlength = Math.max(maxlength, end - start);
			start = end;

		}

		return maxlength;

	}

}
