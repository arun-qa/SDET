package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class CheckIfTwoStringArraysareEquivalent {
	/*
	 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

	A string is represented by an array if the array elements concatenated in order forms the string.

	 

	Example 1:

	Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
	Output: true
	Explanation:
	word1 represents string "ab" + "c" -> "abc"
	word2 represents string "a" + "bc" -> "abc"
	The strings are the same, so return true.

	Psuedocode : 
	1. Get the input String arrays(String1 and String2)
	2. Concatenate all the string values of String1 and store it in a String variable called str1
	3. Concatenate all the string values of String2 and store it in a String variable called str2
	4. Compare str1 and str2 and return true if both are same.
	 */
	
	@Test
	public void test1() {
		
		String[] strArray1 = {"ab","c"};
		String[] strArray2 = {"a","bc"};
		boolean expOutput = true;
		boolean actOutput = arrayStringsAreEqual(strArray1, strArray2);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	@Test
	public void test2() {
		
		String[] strArray1 = {"a","cb"};
		String[] strArray2 = {"ab","c"};
		boolean expOutput = false;
		boolean actOutput = arrayStringsAreEqual(strArray1, strArray2);
		Assert.assertEquals(expOutput, actOutput);
	}
	
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

	      

		        String s1="";
		        String s2="";
		        for(int i=0;i<word1.length;i++)
		        {
		            s1=s1+word1[i];
		        }
		        for(int j=0;j<word2.length;j++)
		        {
		            s2=s2+word2[j];
		        }
		        return s1.equals(s2);        

		        
		    }

}
