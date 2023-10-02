package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class DigitsReplaceCharacters {
	
	@Test
	public void test1()
	{
		String s= "a1c1e1";
		Assert.assertEquals("abcdef", replaceDigits(s));
	}
	
	@Test
	public void test2()
	{
		String s= "a1b2c3d4e";
		Assert.assertEquals("abbdcfdhe", replaceDigits(s));
	}
	
	public String replaceDigits(String s)
	{
		char[] a=new char[s.length()];
		for(int i=0;i<a.length;i++)  //O(n)
		{
			a[i]=s.charAt(i);
		}
		for(int i=0;i<a.length;i++) //O(n)
		{
			int n=0;
			if((a[i]>='0')&&(a[i]<='9'))
			{
				n=a[i-1]+(a[i]-'0');
				a[i]=(char)n;
			}
		}
		s=String.valueOf(a);
		return s;
	}

}
