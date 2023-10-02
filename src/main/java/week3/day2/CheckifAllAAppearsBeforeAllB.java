package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class CheckifAllAAppearsBeforeAllB {
	
	/*Given a string s consisting of only the characters 'a' and 'b', 
	return true if every 'a' appears before every 'b' in the string. 
			Otherwise, return false
	Example 1:
	Input: s = "aaabbb"
	Output: true
	Explanation:The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
	Hence, every 'a' appears before every 'b' and we return true.
	
	Pseudocode:
	
			*/
	@Test
	public void test1()
	{
		String s = "aaabbb";
		boolean output = checkappearance(s);
		Assert.assertEquals(true,output);
	}
	
	@Test
	public void test2()
	{
		String s = "abab";
		boolean output = checkappearance(s);
		Assert.assertEquals(false,output);
	}
	
	@Test
	public void test3()
	{
		String s = "bbb";
		boolean output = checkappearance(s);
		Assert.assertEquals(true,output);
	}
	
	
	public boolean checkappearance(String s)
	{
		/*if (s.length()!=1 && s.indexOf('b')!= -1 ) {
			return s.lastIndexOf('a')  == (s.indexOf('b')-1);
		}else{
            return true;
        }*/
		
		if(s.contains("ba")) //O(1)
		{
			return false;
		}
		return true;
		
	}

}
