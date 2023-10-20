package mandatoryHomeWork.DSA.week16;

import java.util.HashSet;

import org.junit.Test;

import junit.framework.Assert;

public class Assessment_FirstUnique_Character {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(3, getUniqueCharacter("madam"));
		
		System.out.println();
	}
	
	
	public static int getUniqueCharacter(String s)
	{
		HashSet<Character>  set1 = new HashSet<>();
		HashSet<Character> set2 = new HashSet<>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(set1.contains(ch))
			{
				set2.add(ch);
			}
			else
			{
				set1.add(ch);
			}
		}
		
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			
			if(!set2.contains(ch))
			{
				return i+1;
			}
		}
		return 0;
		
		
	}

}
