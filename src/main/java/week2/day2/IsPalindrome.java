package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class IsPalindrome {
	
	
	//num = 121;
	
	
	@Test
	public void test1()
	{
		
		Assert.assertEquals(true, ispalindrome(121));
	}
	
	@Test
	public void test2()
	{
		
		Assert.assertEquals(false, ispalindrome(-121));
	}
	
	
	
	
	public static boolean ispalindrome(int num)
	{
		int temp = num;
		int sum=0;
		
		while(num>0)   //O(n)
		{
		
		int remainder = num%10; //getting remainder
		
		sum = (sum*10)+remainder;
		
		num = num/10;
			
	}
		return temp==sum;
		
		
	}

}
