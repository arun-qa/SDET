package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfThree {
	
	/*
	 * Given an integer n, return true if it is a power of three. Otherwise, return false.
	 *  An integer n is a power of three, if there exists an integer x such that n == 3x.
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, powerofthree(81));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, powerofthree(9));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, powerofthree(28));
	}
	
	
	public boolean powerofthree(int n)
	{
		while(n%3==0)  //O(n)
		{
			n=n/3;   //O(log n)
		}
		
		return n==1;
		
	}

}
