package mandatoryHomeWork.DSA.week12;

import org.junit.Test;
import org.testng.Assert;


public class Day1_SortArrayByParity1 {
	
	/* 
	 * https://leetcode.com/problems/sort-array-by-parity/description
	 * 
	 * Pseudocode
	 *  1. Declare the starting variable as leftindex and length as rightindex
	 *  2. iterate with nums
	 *  	a. check for the condition left is odd and right is even
	 *  	the swap the element increment the left and decrement right
	 *  	b. check for the condition left is even and right is odd
	 *  		then increment increment left and decrement right
	 *  	c. check for the condition if left and right are odd
	 *  		if yes decrement the right and check again
	 *  	d. check for the condition if left and right are even
	 *  		if yes increment the left and check again
	 *  3. return  nums
	 * 
	 * Time Complexity --> o(n)
	 */

	@Test
	public void test1() {
		Assert.assertEquals(new int[] { 4, 2, 1, 3 }, sortArrayByParity(new int[] { 3, 1, 2, 4 }));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(new int[] { 4,-2,1,-3 }, sortArrayByParity(new int[] { -3,1,-2,4 }));
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(new int[] {}, sortArrayByParity(new int[] {}));
	}


	public int[] sortArrayByParity(int[] nums) {

		int leftindex = 0;
		int rightindex = nums.length - 1;

		while (leftindex < rightindex) {

			if (nums[rightindex] % 2 == 0) {

				int temp = nums[leftindex];
				nums[leftindex] = nums[rightindex];
				nums[rightindex] = temp;
				leftindex++;
			}

			else if (nums[leftindex] % 2 == 0 && nums[rightindex] % 2 == 0) {
				leftindex++;
			}

			else if (nums[leftindex] % 2 != 0 && nums[rightindex] % 2 != 0) {
				rightindex--;
			}

			else if (nums[leftindex] % 2 == 0 && nums[rightindex] % 2 != 0) {
				leftindex++;
				rightindex--;
			}

		}
		return nums;

	}

}
