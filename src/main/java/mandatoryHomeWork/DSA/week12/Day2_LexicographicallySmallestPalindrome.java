package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

import junit.framework.Assert;

public class Day2_LexicographicallySmallestPalindrome {

	/*
	 * https://leetcode.com/problems/lexicographically-smallest-palindrome/
	 * description/
	 * 
	 * Pseudocode
	 * 
	 * Get an input as String and Output should be string Initiate two pointers left
	 * & right Convert String to charArray Iterate left & right character if
	 * (charArray[left] < charArray[right]), assign left character to right char
	 * else assign rightchar to left char convert chararry to String and return it
	 * 
	 * 
	 * Time Complexity --> O(n)
	 */

	@Test
	public void test1() {
		Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
	}

	@Test
	public void test2() {
		Assert.assertEquals("a", makeSmallestPalindrome("a"));
	}

	public String makeSmallestPalindrome(String s) {

		int left = 0;
		int right = s.length() - 1;

		char[] charArray = s.toCharArray();

		if (s.length() == 1)
			return s;

		while (left < right) {
			if (charArray[left] != charArray[right]) {
				if (charArray[left] < charArray[right]) {
					charArray[right] = charArray[left];
				}

				else {
					charArray[left] = charArray[right];
				}
			}

			left++;
			right--;

		}

		return new String(charArray);

	}
}
