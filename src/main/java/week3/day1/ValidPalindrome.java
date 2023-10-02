package week3.day1;

import org.junit.Test;

import junit.framework.Assert;

public class ValidPalindrome {
	
	@Test
	public void test1()
	{
		String input = "A man, a plan, a canal: Panama";
		boolean output = validpalindrome(input);
		Assert.assertEquals(true, output);
	}
	
	@Test
	public void test2()
	{
		String input = "Race$%^**&*^Car";
		boolean output = validpalindrome(input);
		Assert.assertEquals(true, output);
	}
	
	@Test
	public void test3()
	{
		String input = "SDET";
		boolean output = validpalindrome(input);
		Assert.assertEquals(false, output);
	}
	
	public boolean validpalindrome(String input)
	{
		String rev="";
		String lowerCase = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		//String removeSpace = lowerCase.replaceAll("[^a-zA-Z0-9\\s+]", "");
		String original=lowerCase;
		for(int i=lowerCase.length()-1; i>=0; i--)   //O(n)
		{
			rev=rev+ lowerCase.charAt(i);
		}
		
		return original.equals(rev);
			
		
	}

}
