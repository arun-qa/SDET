package mandatoryHomeWork.DSA;

import java.util.Arrays;

public class SortedArrayOfIntegers {
	
	/* PseudoCode 
	 * Get an input as array of integers & output should be array of integers
	 * create int[] output = new int[2] to store the output
	 * Initiate left index as 0 & right index as nums.length-1;
	 * While leftindex<rightindex
	 * initiate sum and add the values of nums of left index & nums of right Index
	 * if sum == target assign both the values to ouput array
	 * else if (sum<target) left index++;
	 * else right index--;
	 * return the values stored in output array
	 * 
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] nums = {2,3,5,7};
	int[] output = new int[2];
	int  target = 8;
	int leftindex = 0;
	int rightindex = nums.length-1;
	
	while (leftindex<rightindex)
	{
		int sum = nums[leftindex] + nums[rightindex];
		if(sum == target)
		{
			output[0] = leftindex;
			output[1] = rightindex;
			break;
		}
		else if(sum<target)
		{
			leftindex++;
		
	}
		else
		{
			rightindex--;
		}
	}
	System.out.println(Arrays.toString(output));

}
}
