package week5;

import org.junit.Test;

import junit.framework.Assert;

public class AverageValueofEvenNumbersThatAreDivisiblebyThree {

	@Test
	public void test1()
	{
		Assert.assertEquals(9, averageValue(new int[] {1,3,6,10,12,15}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, averageValue(new int[] {1,2,4,7,10}));
	}
	
	
	public int averageValue(int[] nums)
	{
		int count = 0; int sum = 0;
		for(int i=0; i<nums.length; i++)
		{
			
			if(nums[i]%2==0 && nums[i]%3==0)
			{
				sum = sum + nums[i];
				count++;
			}
		}
	
		if(count!=0)
		{
			return sum/count;
		}
		
		return 0;
	}

}
