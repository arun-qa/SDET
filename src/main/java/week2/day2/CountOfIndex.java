package week2.day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfIndex {
/*
 *  Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately.
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input

 * 
 * 
 * 
 * 
 * Pseudo code
 * int count=0;
Sort the array
for(int i=0;i<=array.length-2;i++)
{
for (int j=i+1;j<=array.length-1;i++)
{
if(array[j]==array[i]+1)
{ 
count++
}
}
}
 */
	@Test
	public void test1() {
		Assert.assertEquals(2,countofindex(new int[] {1, 2, 3}));
	}
	@Test
	public void test2() {
		Assert.assertEquals(0,countofindex(new int[] {1, 1, 3, 3, 5, 5, 7, 7}));
	}
	@Test
	public void test3() {
		Assert.assertEquals(2,countofindex(new int[] {1, 1, 2}));
	}
	
	public int countofindex(int[] input)
	{
		int count=0;  //O(1)
		
		Arrays.sort(input);   //O(n*log n)
		
		for(int i=0; i<=input.length-2; i++)  //O(n)
		{
			for(int j=i+1; j<=input.length-1; j++)  //O(n)
			{
				if(input[i]==input[j]+1)  //O(1)
				{
					count++;
				}
			}
		}	
		return count;
		
	}

}
