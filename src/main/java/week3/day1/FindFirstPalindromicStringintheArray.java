package week3.day1;

import org.junit.Test;

import junit.framework.Assert;

public class FindFirstPalindromicStringintheArray {
	
	/* Given an array of strings words, 
	 * return the first palindromic string in the array. 
	 * If there is no such string, return an empty string "".
	 * A string is palindromic if it reads the same forward and backward. 
	 * 
	 */
	
	@Test
	public void test1()
	{
		String[] words = {"abc","car","ada","racecar","cool"};
		String ouput = "ada";
		String actual = checkFirstPalindrome(words);
		Assert.assertEquals(ouput, actual);
		
	}
	@Test
	public void test2()
	{
		String[] words = {"notapalindrome","racecar"};
		String ouput = "racecar";
		String actual = checkFirstPalindrome(words);
		Assert.assertEquals(ouput, actual);
		
	}
	@Test
	public void test3()
	{
		String[] words = {"def","ghi"};
		String ouput = "";
		String actual = checkFirstPalindrome(words);
		Assert.assertEquals(ouput, actual);
		
	}
	
	public String checkFirstPalindrome(String[] words){

        String str = "";

        for(int i=0;i< words.length;i++) //O(n)
        {
            str = words[i];
            String rev = "";

            for(int j=str.length()-1;j>=0;j--)  //O(n)
            {
                rev = rev+str.charAt(j);
            }
            if(str.equals(rev)) 
            	return str;
        }
        return "";
    }
		
	}


