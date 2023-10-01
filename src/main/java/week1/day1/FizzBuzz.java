package week1.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz {
	
	@Test
	public void test1()
	{
		List<String> expected = Arrays.asList(new String[] {"1", "2", "Fizz"});
		Assert.assertEquals(expected, fizzBuzz(3));
	}
	

	public List<String> fizzBuzz(int n) {
		
		List<String> output = new ArrayList<String>();
		
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 && i%5==0)
			{
				output.add("FizzBuzz");
			}
			else if(i%3==0)
			{
				output.add("Fizz");
			}
			else if(i%3==0)
			{
				output.add("Buzz");	
			}
			else
			{
				output.add(Integer.toString(i));
			}
		}
		return output;
		
		
		
	}

}
