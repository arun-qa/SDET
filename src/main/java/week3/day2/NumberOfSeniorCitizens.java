package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class NumberOfSeniorCitizens {
	
	
	@Test
	public void test1()
	{
		String[] input = {"7868190130M7522","5303914400F9211","9273338290F4010"};
		int actuals = getseniorage(input);
		Assert.assertEquals(2, actuals);
	}
	
	@Test
	public void test2()
	{
		String[] input = {"1313579440F2036","2921522980M5644"};
		int actuals = getseniorage(input);
		Assert.assertEquals(0, actuals);
	}
	
	
	
	public int getseniorage(String[] input)
	{
		int count = 0;
		int age = 0;
		String str = "";
		for(int i=0;i<input.length;i++)
		{
		str = input[i].substring(11, 13);
		age = Integer.parseInt(str);
		
		if(age>60)
			count++;
		}	
		
		return count;
	}

}
