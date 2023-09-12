package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Assessment_LongestEvenLengthWord {
	
	/*
	 * Question 2
	Consider a string, sentence, of words separated by spaces where each word is a substring consisting of English alphabetic letters only. 
	Find the first word in the sentence that has a length which is both an even number and greater than or equal to the length of any other word of even length in the sentence. 
	If there are multiple words meeting the criteria, return the one which occurs first in the sentence.
	Example
	sentence = "Time to write great code"

	The lengths of the words are 4, 2, 5, 5, 4, in order. 
	The longest even length words are Time and code. The one that occurs first is Time, the answer to return
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Nation", findMaxLengthWord("I love my Nation India"));
	}

	public String findMaxLengthWord(String sentence) {
		// TODO Auto-generated method stub
		
		
		String[] s = sentence.split(" "); 
		
		String max = "";
			
			
			for(int i=0; i<=s.length-1; i++)
			{
				if(s[i].length()%2 == 0 && max.length()<s[i].length())
				{				
						max = s[i];	
				}
			}
			
			//System.out.println(max);
			return max;
	}

}
