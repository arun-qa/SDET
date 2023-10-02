package week2.day2;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes {

	public int[] moveZeroes(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) //O(n)
		{
			for (int j = i + 1; j < nums.length; j++) //O(n)
			{
				if (nums[i] == 0) //O(1)
				{
					int temp = 0;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;

				}
			}

		}

		return nums;
	}

	@Test
	public void test1() {
		int[] n = { 0, 1, 0, 3, 12 };
		int[] output = { 1, 3, 12, 0, 0 };
		Assert.assertArrayEquals(output, moveZeroes(n));

	}

}
