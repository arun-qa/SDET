package week2.day1;

import org.junit.Test;

import junit.framework.Assert;

public class DuplicateElement {
	
	@Test
	public void test1()
	{	
		
	
		Assert.assertEquals(true, isduplicate(new int[] {1,2,3,1}));
	}
	
	@Test
	public void test2()
	{	
		
	
		Assert.assertEquals(false, isduplicate(new int[] {1,2,3,4}));
	}
	@Test
	public void test3()
	{	
		
	
		Assert.assertEquals(true, isduplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
	}	
	public boolean isduplicate(int[] input)
	{
		for(int i=0; i<input.length; i++)    //O(n)
		{
			for(int j=i+1; j<input.length; j++)   //O(n)
			{
				if(input[i]==input[j]) //O(1)
					
					return true;
			}
		}
		return false;	
	}

}
