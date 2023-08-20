package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

public class CountofCapitalLetters {
	
	/*
	 * Understood the Problem - Yes
	 * 
	 * TestData
	 * 1. Input - ILoveIndia
	 * 	  Output - 3
	 * 2. Input - smallcase
	 * 	  Output - 0
	 * 3. Input - Test@123
	 * 	  Output - 1
	 * 
	 * 
	 * Pseudo code
	 * Get the input as String 
	 * Initialize count variable as 0
	 * Iterate the for loop and store the each character of a string
	 * now convert the char to int
	 * Use if condition and check the ascii value of each character 
	 * ASCII value should be in the range of >=65 & <=90 then increment the counter vaiable
	 * return count
	 */

	
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
