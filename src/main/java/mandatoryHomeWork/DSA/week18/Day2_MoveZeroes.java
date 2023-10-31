package mandatoryHomeWork.DSA.week18;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import junit.framework.Assert;

public class Day2_MoveZeroes {
	
	// https://leetcode.com/problems/move-zeroes/description/
	// Pseudocode
	// Get an input as int[]
	// Set two pointers left & right with 0
	// Iterate till right is less than nums.length
	// If nums[right]!=0;
	// Do swap, increment left & right
	
	
	@Test
	public void test1()
	{
        Day2_MoveZeroes solution = new Day2_MoveZeroes();

		int[] nums = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums);

        int[] expected = {1, 3, 12, 0, 0};
        assertArrayEquals(expected, nums);
	}
	
	 public void moveZeroes(int[] nums) {

	        int left = 0;
	        int right = 0;

	        while(right<nums.length)
	        {
	            if(nums[right]!=0)
	            {
	                int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;

	                left++;
	            }

	        right++;

	        }
	        
	    }

}
