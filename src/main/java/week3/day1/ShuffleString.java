package week3.day1;

import org.junit.Test;

import junit.framework.Assert;

public class ShuffleString {
	
	@Test
	public void test1()
	{
		String s = "codeleet";
		String output = "leetcode";
		int[] indices = {4,5,6,7,0,2,1,3};
		String actual = checkShuffle(s, indices);
		Assert.assertEquals(output, actual);
	}
	
	
	public String checkShuffle(String s, int[] indices)
	{
		String str="";
		char[] charArray = new char[indices.length];
		for(int i=0; i<indices.length; i++) //O(n)
		{
			charArray[indices[i]] = s.charAt(i);
		}
		
		str=String.valueOf(charArray);
		System.out.println(str);
		return str;
		
	}

}
