package mandatoryHomeWork.DSA.week13;

import org.junit.Test;
import org.testng.Assert;

public class MaxConsecutiveOnes {
	
	/*https://leetcode.com/problems/max-consecutive-ones/description/
	 * 
	 * Pseudocode
	 * Get an input as int[] and output as int
	 * initiate variables start, end and ans
	 * Initiate while loop till start < nums.length and check whether the value is equal to 1, if so then do start++
	 * Initiate another while loop till start < nums.length and check whether the value is equal to 0, if so then do start++
	 * assign end = start
	 * return output
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, findMaxConsecutiveOnes(new int[] {1,1,0,0,1,1,1,0}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, findMaxConsecutiveOnes(new int[] {0,0,0,0,0}));
	}

	public int findMaxConsecutiveOnes(int[] nums) {

		int start = 0;
		int end = 0;
		int output = 0;

		while (start < nums.length) {
			while (start < nums.length && nums[start] == 1)
				start++;

			output = Math.max(start - end, output);

			while (start < nums.length && nums[start] == 0)
				start++;

			end = start;
		}

		return output;

	}
}
