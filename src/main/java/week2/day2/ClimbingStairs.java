package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class ClimbingStairs {
	
	@Test
	
	public void test1()
	{
		int n=2;
		int output = 2;
		int actual = getWays(n);
		Assert.assertEquals(output, actual);
	}
	
	
	public int getWays(int n)
	{
		int ways[] = new int[n+1];
		ways[0] = 1;
		ways[1] = 1;
		
		for(int i=2; i<=n; i++) //O(n)
		{
			ways[i] = ways[i-1]+ways[i-2];
		}
		
		return n;
	}

}
