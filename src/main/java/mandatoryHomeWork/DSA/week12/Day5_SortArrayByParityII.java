package mandatoryHomeWork.DSA.week12;

import java.util.Arrays;

public class Day5_SortArrayByParityII {
	
	/*https://leetcode.com/problems/sort-array-by-parity-ii/description/
	 * 
	 * Pseudocode
	 * Initiate 3 variable even=0; odd=1; & n = nums.length;
	 * Iterate while loop till even & odd should be less than n
	 * Iterate one more while loop & check whether nums[even]%2==0;
	 * Iterate one more while loop & check whether nums[odd]%2!=0;
	 * if the above conditions fails do swap
	 * return nums
	 * 
	 * Time Complexity --> o[n]
	 * space complexity --> o[1]
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4,5,2,7};
		
		int even=0,odd=1;
		int n=nums.length;
		
		while(even<n && odd<n)
		{
			while(even<n && nums[even]%2==0)
			{
				even = even + 2;
			}
			while(odd<n && nums[odd]%2!=0)
			{
				odd = odd + 2;
			}
			if(even<n && odd<n)
			{
				int temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
				even = even + 2;
				odd = odd+2;
				
			}
		}
		
		System.out.println(Arrays.toString(nums));
	
	}

}
