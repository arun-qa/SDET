package week2.day2;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SingleNumber {
	
	//[2,2,1]
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, singlenumber(new int[] {1,2,2}));
	}

	
	
	public int singlenumber(int[] input)
	{
		Arrays.sort(input);//[1,2,2]   //O(n*log n)
		
		for(int i=0; i<input.length; i++)    //O(n)
		{
			for(int j=i+1; j<input.length; j++)    //O(n)
			{
				if(input[i]!=input[j])  //O(1)
				{
					
					return input[j];
			}
		}
		
		
	}
		return 0;

}
}
