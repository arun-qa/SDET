package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo {
	
	/*
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.
	   An integer n is a power of two, if there exists an integer x such that n == 2x.

 Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, poweroftwo(65536));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, poweroftwo(1));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, poweroftwo(3));
	}
	
	
	public static boolean poweroftwo(int num)
	{
		while(num%2==0)  //O(1)
		{
			num = num/2;   //O(log n)
		}
		
		return num==1;
		
	}

}
