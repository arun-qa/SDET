package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class W8_Q3_ArrayPartition {
	
	/*
	 * Pseudo code
	 * 
	 * Get the input as int[]
	 * declare counter variable as 0
	 * Use Arrays.sort to sort the input values
	 * Iterate for loop and get the i+2 values
	 * Sum the i+2 values with counter variable for each loop
	 * finally return the counter
	 * 
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(4, arrayPairsum(new int[] {1,4,3,2}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(4, arrayPairsum(new int[] {6,2,6,5,1,2}));
	}
	
	
	public int arrayPairsum(int[] nums)
	{
		int count =0;
		
		Arrays.sort(nums);  //O(n log n)
		
		for(int i=0; i<nums.length; i=i+2) //O(n)
		{
			count = count + nums[i]; //O(1)
		}
		
		return count;
		
	}

}
