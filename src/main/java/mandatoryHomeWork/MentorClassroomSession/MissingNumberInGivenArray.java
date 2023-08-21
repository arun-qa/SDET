package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumberInGivenArray {
	
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
	 * Yes
	 * 
	 * 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Positive - 3,0,1
	 * Negative - 0,1
	 * Edge - 1
	 * 
	 * 3. Do you know the Solution? - Yes
	 * 
	 * 
	 * 4.Do you have any alternate approaches? - No
	 * 
	 *5. Derive Pseudo code in paper (for the best chosen approach)
	 * Use Arrays.sort method to sort the input
	 * Iterate the for loop and check whether i & nums[i] are not equal
	 * then return the i value
	 */
	@Test
	public void test1()
	{
		Assert.assertEquals(2,missingnumber(new int[] {3,0,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(2,missingnumber(new int[] {0,1}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0,missingnumber(new int[] {1}));
	}
	
	
	
	public int missingnumber(int[] nums)
	{
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length; i++)
		{
			if(i!=nums[i])
				return i;
		}
		return nums.length;
		
			
	}

}
