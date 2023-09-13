package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_ReverseWordInaString {
	
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
			
			for (String s2 : s1) {
				
				StringBuilder sb = new StringBuilder(s2);
				
				sb.reverse();
							
				newString.append(sb.append(" "));
				
				}
			
			return newString.toString().trim();
	    
	    }
	
	}


