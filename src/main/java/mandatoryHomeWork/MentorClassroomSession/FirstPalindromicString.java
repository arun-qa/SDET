package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

/*
 * Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.

Psuedocode : 
1. Get the input words String array
2. Iterate through each word of the given String array
3. Declare a string variable called s1 and assign the each word to s1 
4. if the reverse string value of the word matches with the original word, assign that word to s1 variable
5. return the s1 value

Time complexity  - O[N * M]
 */


public class FirstPalindromicString {
	
	@Test
	public void test1() {
		String[] words = {"abc","car","ada","racecar","cool"};
		String expOutput = "ada";
		String actOutput = firstPalindrome(words);
		Assert.assertEquals(expOutput, actOutput);
		
	}
	
	 public String firstPalindrome(String[] words) {

	        for(int i=0; i<words.length;i++)  //O(n)
	        {
	            String s1 = words[i];

	             StringBuilder s2 = new StringBuilder(s1);

	            s2.reverse(); //O(m)

	           if(s1.equals(s2.toString())) 

	           return s1;
	        }

	        return "";
	    }

}
