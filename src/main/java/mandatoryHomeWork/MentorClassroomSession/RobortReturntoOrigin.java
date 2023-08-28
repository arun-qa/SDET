package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class RobortReturntoOrigin {
	
	/* Pseudocode
	 * 
	 * Get an input as String, Output should be boolean
	 * initailize the variables up,down,left,right=0;
	 * Iterate the foreach loop to check the each char from given string
	 * if ch is U then increament up++, follow the same steps for other characters too
	 * if the values up==down && right==left return true
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, robortreturns("UD"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, robortreturns("LL"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(true, robortreturns("UURRDDLL"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(true, robortreturns("URDLDLUR"));
	}
	
	@Test
	public void test5()
	{
		Assert.assertEquals(false, robortreturns("DRDLL"));
	}
	
	
	public boolean robortreturns(String moves)
	{
		int up=0, down=0, left=0, right=0;
		
		for(char ch:moves.toCharArray())
		{
			if (ch=='U')
                up++;
            else if (ch=='D')
                down++;
            else if (ch=='L')
                left++;
            else
                right++;	
		}
		
		   if (up==down && right==left)
	            return true;

	       return false;
	}

}
