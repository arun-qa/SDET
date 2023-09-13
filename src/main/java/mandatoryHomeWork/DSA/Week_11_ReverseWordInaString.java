package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_ReverseWordInaString {
	
	//https://leetcode.com/problems/reverse-words-in-a-string-iii/
	
	/* Pseudocode
	 * Get an input as String an Output as an String
	 * Split the String and store it in String[]
	 * Iterate each string from String[] using for each loop
	 * Reverse the string and store in sb
	 * append the string with new sb
	 * return the new sb after changing it as string
	 * 
	 * 
	 * Time Complexity O(n)
	 */
	
	@Test
	public void test1()
	{
		
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", reverseWords("Let's take LeetCode contest"));
	}
	
	@Test
	public void test2()
	{
		
		Assert.assertEquals("doG gniD", reverseWords("God Ding"));
	}

	 public String reverseWords(String s) {

	        StringBuilder newString = new StringBuilder();

			String[] s1 = s.split(" ");
			
			for (String s2 : s1) { //O(n)
				
				StringBuilder sb = new StringBuilder(s2);
				
				sb.reverse();
							
				newString.append(sb.append(" "));
				
				}
			
			return newString.toString().trim();
	    
	    }
	
	}


