package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class NumberOfOnes1 {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, countof1(new int[] {1,2,3,4}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(4, countof1(new int[] {1,1,1,1}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, countof1(new int[] {0,0,0,0}));
	}
	
	public int countof1(int[] nums)
	{
		
		int count = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i]!=1)
			{
				count++;
			}
		}
		int ones = ((nums.length)-count);
		
		return ones;
		
		
	}

}
