package mandatoryHomeWork.DSA.week17;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class Day3_SortColors {
	
	//https://leetcode.com/problems/sort-colors/description/
	
	@Test
	public void test1()
	{
		sortColors(new int[] {2,0,2,1,1,0});

	}
	
	public void sortColors(int[] nums) {

        for(int i=0; i<nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {

                if(nums[i]>nums[j])
                {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                }
                
                
            }
        }
        
    }

}
