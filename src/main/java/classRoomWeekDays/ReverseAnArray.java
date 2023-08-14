package classRoomWeekDays;

import static org.junit.Assert.assertArrayEquals;import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseAnArray {
	
/*  1. create and empty char arr[]
	2. Iterate with loop from the lenght of the char minus one
	3. store the values in the arr[]
	4. return the arr[]			
 */
	
	@Test
	public void test1()
	{
		reversearray(new char[] {'a', 'b', 'c', 'd', 'e'});
		
	}
	
	@Test
	public void test2()
	{
		reversearray(new char[] {});
	}
	
	
	
	public char[] reversearray(char a[])
	
	{
		char[] b = new char[a.length];

		for(int i=0; i<a.length; i++)
		{
			b[i] = a[a.length-1-i];
		}
		System.out.println(b);
		return(b);	
		
	}

}
