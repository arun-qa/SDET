package week1.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber {
	
	@Test
	
	public void test1()
	{
		Assert.assertEquals(2,missingnum(new int[] {3,0,1}));
	}
	
	@Test
	
	public void test2()
	{
		Assert.assertEquals(2,missingnum(new int[] {0,1}));
	}
	
	@Test
	
	public void test3()
	{
		Assert.assertEquals(4,missingnum(new int[] {3,0,1,2,5}));
	}
	
	public int missingnum(int[] input)
	{
		
		Arrays.sort(input);  //O(n log(n)) 
		for(int i=0; i<input.length; i++) //O(n)
		{
			if(input[i]!=i)  //O(1)
			{
				return i;
			}
		}
		return input.length;
		
	}

}
