package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class Day1_FirstUniqueCharacter {
	
	/* https://leetcode.com/problems/first-unique-character-in-a-string/description/
	 * 
	 * Pseudocode
	 * Get input as String and output as int
	 * create char[] with value of 26
	 * iterate for loop & add the each character frequency in char[]
	 * iterate another for loop and check any char frequency == 1
	 * then return i
	 * else return -1
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(0, firstUniqChar("leetcode"));
	}
	
	public int firstUniqChar(String s) {
	
	char ch[] = new char[26];

    for(int i=0; i<s.length(); i++)
    {
        ch[s.charAt(i) - 'a']++;
    }

    for(int i=0; i<s.length();i++)
    {
        if(ch[s.charAt(i) - 'a']==1)
        {
            return i;
        }
    }

   return -1;
	}

	
}
