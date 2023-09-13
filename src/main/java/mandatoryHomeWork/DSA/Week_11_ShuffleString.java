package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_ShuffleString {
	
	// https://leetcode.com/problems/shuffle-string/description/
	// Pseudocode
	// Initaialize a String variable;
	// Initialize new charArray[] and pass the parameter as given indices.length
	// Initialize for loop & iterate till the indices.length
	// Assign the Given inputs ith position character to charArrays indices of i
	// convert the charArray value to String
	// return the String value
	
	// Time Complexity O(n)
	
	@Test
	public void test1()
	{
		Assert.assertEquals("leetcode", restoreString("codeleet",new int[] {4,5,6,7,0,2,1,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("abc", restoreString("abc",new int[] {0,1,2}));
	}

	public String restoreString(String s, int[] indices) {

		String str = "";
		char[] charArray = new char[indices.length];
		for (int i = 0; i < indices.length; i++) {  //O(n)
			charArray[indices[i]] = s.charAt(i);
		}

		str = String.valueOf(charArray);
		return str;

	}
}
