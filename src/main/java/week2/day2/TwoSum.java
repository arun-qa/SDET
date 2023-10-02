package week2.day2;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	
	/*
	 * Given an array of integers nums and an integer target, 
	 * return indices of the two numbers such that they add up to target.
	 * You may assume that each input would have exactly one solution, 
	 * and you may not use the same element twice.
	 * You can return the answer in any order. 
	 * Psuedo code:
	 */
	
	@Test
	public void test1()
	{
		int[] actual = twosum(new int[] {2,7,11,15},9);
		Assert.assertArrayEquals(new int[] {0,1}, actual);
		
	}
	
	
	
	public int[] twosum(int[] nums, int target)
	{
		
		for(int i=0 ; i<nums.length; i++)  //O(n)
		{
			for(int j=i+1; j<nums.length; j++)   //O(n)
			{
				if(nums[i]+nums[j]==target)   //O(1)
						{
							int[] arr = new int[2];
							arr[0]=i;
							arr[1]=j;
							return new int[] {i,j};
						}
			}
		}
		return new int[] {-1,-1};
		
	}

}
