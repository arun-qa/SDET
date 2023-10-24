package mandatoryHomeWork.DSA.week17;

import org.junit.Test;

import junit.framework.Assert;

public class Day2_MajorityElement {
	
	/* Pseudocode
	 * 
	 * https://leetcode.com/problems/majority-element/description
	 * 
	 * Get an input as int[] and output as int
	 * Iterate for loops one should maintain the iteration and another loop is to count the occurrence of that particular element.
	 * Initialize a temp variable inside the first for loop, so that this temp is used to count the occurrence of the element in the second for loop.
	 * Initialize counter variable as 0, so that every iteration count will start from 0
	 * In second for loop check the element matches with temp variable, if so increase the sount
	 * once second for loop completes first iteration, check whether the length of count is greater that nums.length/2
	 * if so return the temp,else it will go to first loop and continue the iteration 
	 * 
	 * 
	 */

	@Test
	public void test1() {
		Assert.assertEquals(2, majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 }));
	}

	public int majorityElement(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int temp = nums[i];

			int count = 0;

			for (int j = 0; j < nums.length; j++) {
				if (temp == nums[j])
					count++;
			}

			if (count > nums.length / 2)

				return temp;

		}

		return 0;

	}

}
