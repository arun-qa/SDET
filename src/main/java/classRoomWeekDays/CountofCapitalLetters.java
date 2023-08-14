package classRoomWeekDays;

import org.junit.Test;

import junit.framework.Assert;

public class CountofCapitalLetters {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, countofcapital("ILoveIndia"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(0, countofcapital("smallcase"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(1, countofcapital("Test@123"));
	}
	
	
	
	
	public int countofcapital(String input)
	{
		int count =0;
		for(int i=0; i<input.length(); i++)
		{
			char s = input.charAt(i);
			
			int ascii = s;
			
			if(ascii>=65 && ascii<=90)
			{
				count++;
			}
			
		}
			
		return count;
		
	}

}
