package week5;

import org.junit.Assert;
import org.junit.Test;

public class SignoftheProductofanArray {

	@Test
	public void test1() {
		Assert.assertEquals(-1, arraySign(new int[] { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4,
				41, 13, 32, 42, 43, 83, 78, 82, 70, 15, -41 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(-1, arraySign(new int[] { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 }));
	}

	@Test
	public void test3() {
		Assert.assertEquals(1, arraySign(new int[] { -1, -2, -3, -4, 3, 2, 1 }));

	}

	@Test
	public void test4() {
		Assert.assertEquals(0, arraySign(new int[] { 1, 5, 0, 2, -3 }));

	}

	@Test
	public void test5() {
		Assert.assertEquals(-1, arraySign(new int[] { -1, 1, -1, 1, -1 }));

	}

	public int arraySign(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < 0) {
				count++;
			}

			if (nums[i] == 0) {
				return 0;
			}
		}
		if (count % 2 == 0) {

			return 1;
		}
		return -1;

	}

}
