package week4.day1;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, adddigits(38));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, adddigits(0));
	}
	
	
	
	public int adddigits(int num)
	{
		
		while(num>9)
		{
			num=(num/10)+num%10;
				
		if(num<9)
		{
			break;
		}
		}
		
		return num;
		
	}

}
