package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class LeapYear {
	
	@Test
	public void test1()
	{
		boolean actual = leapyear(1999);
		Assert.assertEquals(false, actual);
	}
	
	@Test
	public void test2()
	{
		boolean actual = leapyear(2000);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void test3()
	{
		boolean actual = leapyear(2002);
		Assert.assertEquals(false, actual);
	}
	
	
	
	
	public static boolean leapyear(int year)
	{
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))  //O(1)
		{
			
			return true;
		
	}
		return false;
	
}
}
