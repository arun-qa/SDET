package mandatoryHomeWork.DSA.week12;

public class Day3_NumberofArithmeticTriplets {
	
	/* https://leetcode.com/problems/number-of-arithmetic-triplets/
	 * 
	 * Pseudocode
	 * 
	 * Get the input int[] and the diff value and output should be int
     * set a leftindex pointer at the index 0 and a rightindex pointer at the leftindex + 1
     * set one boolean flag and set it to true
     * check the difference between the rightindex pointer value and leftindex pointer value
	 *  - if it equals with the given diff value, 
		 1.set the flag to false and increment the rightindex pointer till it gets the value 2*diff
		 2.once the rightindex pointer reaches the value 2*diff,
		 	a. increment the count by 1
		 	b. reset the flag to true
		 	c. increment the leftindex pointer by 1 and assign rightindex pointer as left pointer+1
	*  - if it not equals the given diff value, increment the leftindex pointer by 1 and assign rightindex pointer as leftindex pointer+1
	
	* Time complexity - O[n]
	* Space complexity - O[1]
	* 
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 4,5,6,7,8,9 };
		int diff = 2;

		int leftindex = 0;
		int rightindex = 1;
		int count = 0;
		boolean flag = true;

		while (rightindex < nums.length - 1) {
			if ((nums[rightindex] - nums[leftindex]) < diff) {
				rightindex++;
			}

			if (nums[rightindex] - nums[leftindex] > diff) {
				leftindex++;
				rightindex = leftindex + 1;
			}
			if (nums[rightindex] - nums[leftindex] == diff) {
				flag = false;
				while (flag!=true) {
					rightindex++;
					if (rightindex == nums.length)
						break;
					if (nums[rightindex] - nums[leftindex] == 2 * diff) {
						flag = true;
						count++;
						leftindex++;
						rightindex = leftindex + 1;
					}
					if (nums[rightindex] - nums[leftindex] > 2 * diff) {
						flag = true;
						leftindex++;
						rightindex = leftindex + 1;
					}
				}
			}
		}

		System.out.println(count);

	}

}
