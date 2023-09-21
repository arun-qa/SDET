package mandatoryHomeWork.DSA.week12;

public class Day4_FindtheArrayConcatenationValue {

	/*
	 * https://leetcode.com/problems/find-the-array-concatenation-value/
	 * 
	 * Pseudocode
	 * 
	 * Initialize a variable output as 0 to store the concatenation value. Set two
	 * pointers startindex and endindex and iterate till startindex is less than
	 * endindex Retrieve the values at indices startindex and endindex in variables
	 * num1 and num2 respectively. Initialize a variable inc as 10 to represent the
	 * increment factor for concatenation. Calculate the concatenation value by
	 * multiplying num1 with inc and adding num2. Add this value to output.
	 * Increment startindex and decrement endindex to move the pointers inward.
	 * Return the final concatenation value output
	 * 
	 * Time Complexity --> O(n)
	 * Space Complexity --> O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 5, 14, 13, 8, 12 };
		long output = 0;
		int startindex = 0;
		int endindex = nums.length - 1;

		while (startindex < endindex) {
			int increment = 10;
			int num1 = nums[startindex];
			int num2 = nums[endindex];
			while (num2 >= increment)
				increment = increment * 10;
			output = output + (num1 * increment + num2);
			startindex++;
			endindex--;

		}

		if (startindex == endindex)
			output = output + nums[startindex];

		System.out.println(output);
	}

}
