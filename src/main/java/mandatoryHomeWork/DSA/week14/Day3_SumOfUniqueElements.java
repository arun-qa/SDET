package mandatoryHomeWork.DSA.week14;

import java.util.Arrays;
import java.util.HashSet;

public class Day3_SumOfUniqueElements {

	/*
	 * https://leetcode.com/problems/sum-of-unique-elements/description/
	 * 
	 * Pseudocode Get input as int[] and output as int Sort the Array Compare it the
	 * very next element If the element is equal then add it to the Set Else check
	 * if it doesn't contains in the Set Count it Since we are missing the Last
	 * element verify if it not there in Set then add it for Count
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[] { 1, 2, 3, 3 };

		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));

		HashSet<Integer> set = new HashSet<Integer>();

		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				set.add(nums[i]);
			} else {
				if (!set.contains(nums[i])) {
					count = count + nums[i];
				}

			}

		}
		if (!set.contains(nums[nums.length - 1])) {
			count = count + nums[nums.length - 1];
		}

		System.out.println(count);

	}

}
