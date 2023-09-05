package mandatoryHomeWork.DSA;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Week_10_CheckAcronymofWords {
	
	/*https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/*/

	
	//Pseudocode
	//first check word.size is equal to s.length, if not equal return false
	//Iterate for loop and check the all elements first letter of words & each character from S
	//if not equal, return false
	//return true
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isAcronym(Arrays.asList("alice","bob","charlie"), "abc"));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(false, isAcronym(Arrays.asList("alice","bob","charlie"), "ab"));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(false, isAcronym(Arrays.asList("alice","bob"), "abc"));
	}
	
	@Test
	public void test4()
	{
		Assert.assertEquals(false, isAcronym(Arrays.asList("alice","bob","charlie"), "cba"));
	}
	
	public boolean isAcronym(List<String> words, String s) {
		
		if(words.size() != s.length())
		{
			return false;
		}
		
		for(int i=0; i<words.size(); i++)
		{
			if(words.get(i).charAt(0) != s.charAt(i))
			{
				return false;
			}
		}	
		
		return true;
			
	}

}
