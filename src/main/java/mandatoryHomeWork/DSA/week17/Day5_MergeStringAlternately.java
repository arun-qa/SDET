package mandatoryHomeWork.DSA.week17;

import org.junit.Test;

import junit.framework.Assert;

public class Day5_MergeStringAlternately {
	
	/* https://leetcode.com/problems/merge-strings-alternately/description/
	- Get an input as String & Output as String
	- declare variable i,j
	- Iterate while loop till length of words
	- Append the characters from word 1 & word 2 in String builder
	- Iterate other while loops if any extra characters found in word 1 or word 2
	- Convert the str to toString and reurn it*/
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals("apbqrs", mergeAlternately("ab","pqrs"));
	}
	
	
	public String mergeAlternately(String word1, String word2) {
	    
	  /*  int i=0; int j=0;

	    StringBuilder str = new StringBuilder();

	    while(i<word1.length() && j<word2.length())
	    {
	        str.append(word1.charAt(i++));
	        str.append(word2.charAt(j++));
	      
	    }
	    while(i<word1.length()){
	            str.append(word1.charAt(i++));
	        }
	        while(j<word2.length()){
	            str.append(word2.charAt(j++));

	        }

	    return str.toString();*/
		
		int p1=0;
	     String result="";

	     while(p1 < word1.length() && p1< word2.length() ){
	         result=result + word1.charAt(p1) + word2.charAt(p1);
	         p1++;
	     }
	     
	     result= result + word1.substring(p1, word1.length());
	     
	     System.out.println(result);
	     
	     
	     result= result +  word2.substring(p1, word2.length());
	     
	     System.out.println(result);

	     return result;
	        
	    }

}
