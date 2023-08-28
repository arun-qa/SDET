package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

public class SeniorCitizen {
	
	/* Pseudocode
	 * 
	 * Get an input as String[]
	 * Initiate the variables count=0,age=0 and String variable str as ""
	 * Iterate the for loop till length of the input String
	 * In str variable store the substring of 11,13 from each input
	 * In age variable store the Integer.parseInt(str) value
	 * If age is greater than 60, increase the count value as count++
	 * return count
	 */
	
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
		
		Assert.assertEquals(0, getseniorage(new String[] {"1313579440F2036","2921522980M5644"}));
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
