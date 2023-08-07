package classRoomWeekDays;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestNumber {
	
	/* PsuedoCode
	 * 
	 * Input = int[] input
	 * output = int
	 * Create two int variables(firstlarge & secondlarge) and assign the value as 0
	 * Iterate the for loop from 0 to till the input length
	 *    check if input[i] > firstlarge --> then assign the firstlarge value as input[i]
	 * 	  check if input[i] > secondlarge && input[i] < firstlarge --> then assign the secondlarge value as input[i]
	 * Return secondlarge
	 */

	@Test
	public void test1() {
		Assert.assertEquals(94, secondlargest(new int[] { 100, 14, 50, 94, 100 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1000, secondlargest(new int[] { 100,134, 436, 1000, 94, 984, 10000, 856, 356,1000,984 }));
	}


	public int secondlargest(int[] input) {

		int firstlarge = 0;
		int secondlarge = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > firstlarge) {
				firstlarge = input[i];
			}
			if (input[i] > secondlarge && input[i] < firstlarge) {
				secondlarge = input[i];
			}
		}
		return secondlarge;

	}
}
