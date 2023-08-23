package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class W8_Q2_SetMisMatch {
	
	@Test
	public void test1()
	{
		int[] nums = {1,2,2,4};
		int[] output = {2,3};
		int[] actOutput = findErrorNums(nums);
		Assert.assertEquals(actOutput, output);
	}

	public int[] findErrorNums(int[] nums) {
		

		//int[] nums = { 9, 6, 4, 2, 3, 6, 7, 8, 1 };
		
		//int[] nums = {1,2,2,4};
		
		

		int[] output = new int[2];

		int count1=0;

		int count2=0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {

					count1 = nums[j];

					nums[j] = 0;
					
					break;

					//System.out.println(k = nums[i]);
				}
			}

		}
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//1,2,2,4
		//0,1,2,4

		for (int k = 0; k < nums.length; k++) {
			if (nums[k] != k)
			{
				
				count2=k;

				break;
			}
		}
		
		if(count2==0)
		{
			count2=nums.length;
			
			System.out.println("I am in count 2==0");
		}
	output[0] = count1;
	output[1] = count2;
	return output;
			
	}

}
