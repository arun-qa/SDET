package classRoomWeekDays;

import org.junit.Test;

import junit.framework.Assert;

public class ContainsDuplicates {

	/*
	 * Question : Given an integer array nums, return true if any value appears at
	 * least twice in the array, and return false if every element is distinct.
	 * 
	 * 10 step approach:
	 * 
	 * 1.) Did I undersatnd the problem - Yes
	 * 
	 * 2.) TestData Set
	 * 
	 * Input: nums = [1,2,3,1] Output: true
	 *
	 * Input: nums = [1,2,3,4] Output: false
	 *
	 * 3.) Psuedo code
	 * 
	 * - Get an input as int nums[] - Iterate for loop from i=0 to j<nums.length -
	 * Iterate one more for loop j=i+1 to j<nums.length - check if
	 * (nums[i]==nums[j]) - return true - else return false
	 * 
	 * 
	 * 
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, containsDuplicate(new int[] { 1, 2, 3, 1 }));
	}

	public boolean containsDuplicate(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])

					return true;
			}
		}
		return false;
	}

}
