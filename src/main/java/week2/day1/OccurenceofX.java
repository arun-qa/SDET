package week2.day1;

import org.junit.Test;

import junit.framework.Assert;

public class OccurenceofX {
	
	/*
	 * Given a sorted array arr[] and a number x, write a function that 
     counts the occurrences of x in arr[].
     arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
     output = 4
     
     Psuedo code:
     - Get an input as int arr[] and integer
     - We need to compare an int arr[] with the Integer value(X)
     	- Initialize count = 0;
     	- Using for loop to iterate through the int arr[] 
     	- Using If condition to check the int value(x) with the value in int arr[]
     	- If the value matches we need to increase the count by 1;
     	- Finally return the count
     - 
	 */
	@Test
	public void test1() 
	{
		int actual = occurenceofX(new int[] {1,2,2,3,3,4,5,5}, 5);
		Assert.assertEquals(2, actual);
		
	}
	
	@Test
	public void test2() 
	{
		int actual = occurenceofX(new int[] {-1,2,2,3,3,4,5}, -1);
		Assert.assertEquals(1, actual);
		
	}
	
	@Test
	public void test3() 
	{
		int actual = occurenceofX(new int[] {-1,2,2,3,3,4,5}, 6);
		Assert.assertEquals(0, actual);
		
	}
	
	
	
 public int occurenceofX(int[] arr, int x)
 {
	 int count = 0;
	 
	 for(int i=0; i<arr.length; i++) //O(n)
	 {
		if(arr[i] == x)   //O(1)
		{
			count = count+1;  //O(1)
		}
	 }
	 
	return count;
	 
 }
	
	

}
