package week3.day1;

import org.junit.Test;

import junit.framework.Assert;

public class DetermineifStringHalvesAreAlike {
	
	@Test
	public void test1() {
		String s = "book";
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		boolean output = findStringAlike(s,vowels);
		Assert.assertEquals(true, output);
	}
	
	public void test2() {
		String s = "test";
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
		boolean output = findStringAlike(s,vowels);
		Assert.assertEquals(false, output);
	}
	
public boolean findStringAlike(String s,char[] vowels) {
	
	int strLen = s.length()/2;
	char[] a = s.substring(0,strLen).toCharArray();
	char[] b = s.substring(strLen).toCharArray();
	//String vowels1=vowels.replaceAll("[^a-zA-Z0-9]", ""); //aeiouAEIOU
	int count = 0,count1 = 0;
	
	
	for(int i=0;i<a.length;i++) //O(n)
	{
		//count=0;
		for(int j=0;j<vowels.length;j++) //O(n)
		{
		if(a[i]==vowels[j])
			count++;
		}
	}
	
	for(int i=0;i<b.length;i++) //O(n)
	{
		//count1=0;
		for(int j=0;j<vowels.length;j++)  //O(n)
		{
		if(b[i]==vowels[j])
			count1++;
		}
	}
	return (count==count1);
	}
	
}


