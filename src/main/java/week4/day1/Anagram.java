package week4.day1;


import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class Anagram {
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true,isAnagram("anagram", "nagaram"));
	}

	public boolean isAnagram(String s, String t)
	{
		
		char[] schar = s.toCharArray();
		 
		 char[] tchar = t.toCharArray();
		 
		 Arrays.sort(schar);
		 Arrays.sort(tchar);
		 
		 return Arrays.equals(schar, tchar);	
		
		/*if(s.length()!=t.length())return false;
        int[] n=new int[26];
        for(int i=0;i<s.length();i++)
        {
            n[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            n[t.charAt(i)-'a']--;
        }
        for(int i=0;i<n.length;i++)
        {
            if(n[i]!=0)
            	
            return false;
        }
        return true;	*/	
	}
	

}
