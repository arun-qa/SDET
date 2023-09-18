package mandatoryHomeWork.DSA;

import java.util.Arrays;

public class MoveZeroes {
	
	//PseudoCode
	// Initiate both start & end index value as 0
	//If nums[leftindex] & nums [right index] are equal, increment right index
	//else if nums[rightindex]!=0
	//swap the value & leftindex++;rightindex++;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0, 1, 0, 3, 12 };
		// output {1,3,12,0,0}

		int leftindex = 0;
		int rightindex = 0;

		while (leftindex < nums.length && rightindex < nums.length) {
			if (nums[leftindex] == 0 && nums[rightindex] == 0) {
				rightindex++;
			} 
			else if(nums[rightindex]!=0)
			{
				int temp = nums[leftindex];
				nums[leftindex] = nums[rightindex];
				nums[rightindex] = temp;
				leftindex++;
				rightindex++;
			}

		}
		System.out.println(Arrays.toString(nums));

	}
}
