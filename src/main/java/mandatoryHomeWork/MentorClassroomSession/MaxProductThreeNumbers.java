package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

public class MaxProductThreeNumbers {
	
	public static void main(String[] args) {
		
		int input[] = { 3, 5, 8, 1, 2, 0, 6, 4 };

		int output[] = findMaxProductNumbers(input);
		
        System.out.println(Arrays.toString(output));

	}

	public static int[] findMaxProductNumbers(int[] nums) {

		Arrays.sort(nums);

		int n = nums.length;

		// Calculate the product of the three largest positive numbers
		int productWithPositives = nums[n - 1] * nums[n - 2] * nums[n - 3];

		// Calculate the product of the two smallest and the largest (for handling
		// negative numbers)
		int productWithNegatives = nums[0] * nums[1] * nums[n - 1];

		if (productWithPositives > productWithNegatives) {
			return new int[] { nums[n - 3], nums[n - 2], nums[n - 1] };
		} else {
			return new int[] { nums[0], nums[1], nums[n - 1] };
		}
	}
}
