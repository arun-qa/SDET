package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsandStones {
	
	/*
	 * You're given strings jewels representing the types of stones that are jewels, 
	 * and stones representing the stones you have. 
	 * Each character in stones is a type of stone you have. 
	 * You want to know how many of the stones you have are also jewels.
	 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
	 * 
	 * Example 1:
	 * Input: jewels = "aA", stones = "aAAbbbb"
	 * Output: 3
	 * 
	 * int count=0;
		char[] stonesArr = new char[stones.length()];
		for(int i=0;i<stones.length();i++) {
			stonesArr[i]=stones.charAt(i);
		}
		
		for(int i=0;i<stonesArr.length;i++) {
			for(int j=0;j<jewels.length();j++) {
				if(stonesArr[i]==jewels.charAt(j)) {
					count ++;
				}
			}
	
		}
		return count;
}
	 * 
	 */
	
	@Test
	public void test1()
	{
		String jewels = "aA";
		String stones = "aAAbbbb";
		int actuals = jewelsandstones(jewels, stones);
		Assert.assertEquals(3, actuals);
	}
	
	@Test
	public void test2()
	{
		String jewels = "z";
		String stones = "ZZ";
		int actuals = jewelsandstones(jewels, stones);
		Assert.assertEquals(0, actuals);
	}
	
	@Test
	public void test3()
	{
		String jewels = "aAbB";
		String stones = "aAAbbbb";
		int actuals = jewelsandstones(jewels, stones);
		Assert.assertEquals(7, actuals);
	}
	
	public int jewelsandstones(String jewels, String stones)
	{
		
		int count = 0;
		
		for(int i=0; i<stones.length();i++)
		{
			char c = stones.charAt(i);
			
			if(jewels.contains(String.valueOf(c)))
				count++;
		}
		
		
		
		return count;
		
	}

}
