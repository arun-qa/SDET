package mandatoryHomeWork.DSA;

import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_FaultyKeyboard {
	
	/*
	 * https://leetcode.com/problems/faulty-keyboard/description/
	 * 
	 * Pseudocode:
	 * Get an Input as String and Output Should be String
	 * Create a String Builder
	 * Convert the Input String to Char[]
	 * Iterate for loop till char.length
	 * Inside for loop check if ch[i] != 'i', append with stringbuilder
	 * else reverse the appended string
	 * return sb.toString();
	 */
	
	//Time Complexity : O(n)
	
	@Test
	public void test1()
	{
		Assert.assertEquals("rtsng", finalString("string"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("", finalString("iiii"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals("test", finalString("test"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals("dcab", finalString("abicdi"));
	}

	public String finalString(String s) {

		StringBuilder sb = new StringBuilder();

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) { //O(n)

			if (ch[i] != 'i') {
				sb.append(ch[i]);
			} else {
				sb.reverse();
			}

		}
		return (sb.toString());

	}

}
