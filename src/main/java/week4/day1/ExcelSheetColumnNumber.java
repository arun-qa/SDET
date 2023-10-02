package week4.day1;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelSheetColumnNumber {
	
	@Test
	public void test1()
	{
		String columnTitle = "AA";
		int output = 27;
		int actual = titletonumber(columnTitle);
		Assert.assertEquals(output, actual);
	}
	
	
	public int titletonumber(String columnTitle)
	{
		int colNumber = 0;
		
		for(int i=0; i<columnTitle.length(); i++)
		{
			
			colNumber = colNumber*26 +(columnTitle.charAt(i)-'A')+1;
		}
		
		
		return colNumber;
		
	}

}
