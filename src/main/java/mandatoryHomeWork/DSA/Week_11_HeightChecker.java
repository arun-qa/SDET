package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Week_11_HeightChecker {
	
	/*
	 * https://leetcode.com/problems/height-checker/description/
	 * 
	 * Time Complexity : O(n log n)
	 * 
	 * Pseudo code :
	 * Get an input as int[] & output should be int
	 * Copy the input int[] to another one int[]
	 * Use Arrays.sort to sort the newly created int[]
	 * iterate forloop & compare indices value from both the int[]
	 * if both are not equal, increment the counter
	 * return counter
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, heightChecker(new int[] {1,1,4,2,1,3}));
	}
	

	@Test
	public void test2()
	{
		Assert.assertEquals(5, heightChecker(new int[] {5,1,2,3,4}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(0, heightChecker(new int[] {1,2,3,4,5}));
	}
	
	

	 public int heightChecker(int[] heights) {

	        int count=0;

	       int n = heights.length;

	        int[] heightswithorder = Arrays.copyOf(heights, n); //O(n)

	        Arrays.sort(heightswithorder); //O(n log n)

	        for(int i=0; i<=n-1; i++) //O(n)
	        {
	            if(heights[i]!=heightswithorder[i])
	            count++;
	            
	        }
	        return count;
	        
	    }
}
