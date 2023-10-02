package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class LengthofLastWord {
	
	/*Given a string s consisting of words and spaces, return the length of the last word in the string.
	 * A word is a maximal substring consisting of non-space characters only.
	 * 
	 * Example 1:
	 * Input: s = "Hello World"
     * Output: 5
     * Explanation: The last word is "World" with length 5.
     * 
     * Psuedo code:
     * Apply trim() for the given input - to remove the extra space in beginning & end
     * find length of the string //11
	 * While string.charat ! = " "
	 * count++
	 */
	@Test
	public void test1()
	{
		int actual = lengthoflastword("Hello World");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test2()
	{
		int actual = lengthoflastword("   fly me   to   the moon  ");
		Assert.assertEquals(4, actual);
	}
	
	public int lengthoflastword(String input)
	{
		input = input.trim();
		
		int length = input.length();
		
		int count = 0;
		//while(input.charAt(length-1)!=' ')
		
		for(int i=length-1; i>0; i--)
		{
			if(input.charAt(i) != ' ')
			{
			count++;
		}
			else 
				break;
			}
		return count;

	}
}
