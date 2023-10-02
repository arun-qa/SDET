package week3.day2;

import org.junit.Assert;
import org.junit.Test;

public class FindtheDifference {
	
	
	@Test
	public void test1()
	{
		String s = "abcd";
		String t = "abcde";
		char actuals = finddifference(s,t);
		Assert.assertEquals('e', actuals);
	}
	
	
	public char finddifference(String s, String t)
	{
		int ssum=0;
		int tsum=0;
		
		
		for(int i=0; i<s.length(); i++)		
		{
			ssum=ssum+s.charAt(i);//iterate s string & add the ASCII value of each character in s
			tsum=tsum+t.charAt(i);//iterate t string & add the ASCII value of each character in t
		}
		
		tsum=tsum+t.charAt(t.length()-1);
		char ch = (char)(tsum-ssum);
	
		return ch;
		
	}

}
