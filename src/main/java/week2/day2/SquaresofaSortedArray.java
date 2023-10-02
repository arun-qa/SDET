package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class SquaresofaSortedArray {

	 @Test
	    public void test1(){
	        int[] nums = {-4,-1,0,3,10};
	        int[] output = {0,1,9,16,100};
	        int[] actual = sortedArray(nums);
	        Assert.assertEquals(actual, output);
	    }
	    @Test
	    public void test2(){
	        int[] nums = {-7,-3,2,3,11};
	        int[] output = {4,9,9,49,121};
	        int[] actual = sortedArray(nums);
	        Assert.assertEquals(actual, output);
	    }

	    public int[] sortedArray(int[] nums){

	        for(int i=0;i<nums.length;i++)  //O(n)
	        {
	            int temp = nums[i]*nums[i];
	            nums[i] = temp;
	            temp =0;
	        }

	        //to sort the array
	        for(int i=0;i< nums.length;i++)   //O(n)
	        {
	            for(int j=i+1;j<nums.length;j++)  //O(n)
	            {
	                int temp =0;
	                if(nums[i] > nums[j]){
	                    temp = nums[j];
	                    nums[j] = nums[i];
	                    nums[i] = temp;
	                    temp = 0;

	                }
	            }
	            }
	        return nums;
	    }
}
