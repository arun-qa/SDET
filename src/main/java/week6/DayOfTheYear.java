package week6;

import org.junit.Test;

import junit.framework.Assert;

public class DayOfTheYear {
	@Test
	public void test1()
	{
		Assert.assertEquals(9, dayoftheyear("2019-01-09"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(41, dayoftheyear("2019-02-10"));
	}
	public int dayoftheyear(String GivenDate)
	{
		int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int year = Integer.parseInt(GivenDate.substring(0, 4));
		int month = Integer.parseInt(GivenDate.substring(5, 7));
		int date = Integer.parseInt(GivenDate.substring(8, 10));
		
		int days=0;
		
		for(int n=0; n<month-1; n++)
		{
			days = days+numberOfDays[n];
		}
		
		if((month>2) && (year%4==0) && (year % 100 != 0 || year%400==0))
		{
			return days+date+1;
		}
		
		else
			return days+date;
		
	}

}
