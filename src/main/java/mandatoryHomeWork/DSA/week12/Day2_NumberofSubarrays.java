package mandatoryHomeWork.DSA.week12;

import org.junit.Test;

import junit.framework.Assert;

public class Day2_NumberofSubarrays {
	
	/* https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 * 
	 * Pseudocode
	 * Get an input as int[], int, int Output should be integer value
	 * set one pointer variable and assign it to 0
	 * iterate array with the length of k 
	 * first take sum of k length 
	 *  - calculate the current sum by adding all the elements of an array starting with current index pointer till k length
	 *  - check the average value is greater than or equal to threshold , if so increase the counter variable by 1
	 * check for the condition pointer is less than the arr length
	 *  - if yes add the current index value and remove the first index value
	 *  - check the average value is greater than or equal to threshold , if so increase the counter variable by 1
	 *return count
	 */
	
	@Test
	public void test1()
	{
	Assert.assertEquals(3, numOfSubarrays(new int[] {2,2,2,2,5,5,5,8}, 3, 4));	
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(6, numOfSubarrays(new int[] {11,13,17,23,29,31,7,5,2,3}, 3, 5));
	}
	
	
	 public int numOfSubarrays(int[] arr, int k, int threshold) {
		 
		 int count=0,pointer=0,currentsum=0;
			
			while(pointer < k)
				currentsum=currentsum+arr[pointer++];
	             
			
			if(currentsum/k>=threshold) {
				count++;
			}
			while(pointer<arr.length) { 
				
				currentsum=currentsum+(arr[pointer]-arr[pointer-k]);
	            pointer++;
				if(currentsum/k>=threshold) {
					count++;
				}
			}
			
			return count;
	        	 
		 
	 }

}
