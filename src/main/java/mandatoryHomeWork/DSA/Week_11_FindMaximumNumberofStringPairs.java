package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_FindMaximumNumberofStringPairs {
	
	/*
	 * https://leetcode.com/problems/find-maximum-number-of-string-pairs/
	 * 
	 * Pseudocode:
	 * Get the input String array
	 * Iterate through each string and do reverse of the current string
	 * If the reversed string matches with any of the other strings in array,increase the count by 1
	 * Repeat the above step for all the strings in the given array and return the final count
	 * 
	 * Time Complexity : O(n^2)
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, maximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, maximumNumberOfStringPairs(new String[] {"ab","ba","cc"}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, maximumNumberOfStringPairs(new String[] {"aa","ab"}));
	}
	
	
	public int maximumNumberOfStringPairs(String[] words) {
		// TODO Auto-generated method stub

		int count = 0;

		for (int i = 0; i < words.length - 1; i++) { //O(n)

			String s1 = reverse(words[i]);

			for (int j = i + 1; j < words.length; j++) //O(n)

			{
				if (s1.equals(words[j])) {
					count++;
				}
			}
		}
		return count;

	}

	public static String reverse(String s2) {
		String rev = "";

		for (int i = s2.length() - 1; i >= 0; i--) {
			rev = rev + s2.charAt(i);
		}

		return rev;

	}

}
