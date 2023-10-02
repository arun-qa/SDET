package week1.day1;

import org.junit.Test;

import junit.framework.Assert;

public class Isogram {
	
	/*
	 *  Question - Find if a string is an isogram
	 *  Example - Isogram
	 *  
	 *  convert the string to char array
	 *  Traverse through the char array
	 *  compare each character with next character
	 *  if both characters are same --> Print false
	 *  else if doesn't match --> continue
	 *  finally print true
	 */
	
	@Test
	public void test1() {
		boolean actual = isIsogram("isogram");
		Assert.assertEquals(true, actual);
		
	}
	
	@Test
		
		public void test2() {
			boolean actual = isIsogram("isogrami");
			Assert.assertEquals(false, actual);
		
	}
	@Test
	
	public void test3() {
		boolean actual = isIsogram("AAAA");
		Assert.assertEquals(false, actual);
	
}
	
	
	public boolean isIsogram(String input) {
		
		char[] charArray = input.toCharArray();   // O[1]
		
		for(int i=0; i<charArray.length-1; i++)   // O[N]
		{
			for(int j=i+1; j<charArray.length; j++)  // O[N]
			{
				if(charArray[i]==charArray[j])    
				{
					return false;
				}
			}
		}
		
		return true;
		
	}

}
