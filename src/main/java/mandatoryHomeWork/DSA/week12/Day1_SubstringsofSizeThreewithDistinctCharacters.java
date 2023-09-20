package mandatoryHomeWork.DSA.week12;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Day1_SubstringsofSizeThreewithDistinctCharacters {

	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-
	 * characters/
	 * 
	 * Pseudocode
	 * 
	 * Get an input as String and output should be integer initiate one int variable
	 * as 0 iterate for loop till s.length()
	 * 
	 * 
	 * 
	 * Time Complexity --> O(n)
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, countGoodSubstrings("xyzzaz"));
	}
	
	
	@Test
	public void test2()
	{
		Assert.assertEquals(4, countGoodSubstrings("aababcabc"));
	}

	public int countGoodSubstrings(String s) {

		int startindex = 0;
		int count = 0;

		if (s.length() < 3)
			return 0;

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {

			while (!set.add(s.charAt(i)))
				set.remove(s.charAt(startindex++));
			if (set.size() == 3) {
				count++;
				set.remove(s.charAt(startindex++));
			}

		}

		return count;

	}

}
