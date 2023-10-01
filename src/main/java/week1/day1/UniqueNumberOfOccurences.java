package week1.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class UniqueNumberOfOccurences {
	
	/*
	 * Question - Given an array of integers arr, 
	 * return true if the number of occurrences of each value in the array is unique 
	 * or false otherwise.
	 * 
	 * Psuedo code
	 * - Get an input as array of Integers
	 * - 
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, eachvalueoccurrence(new int[] { 1, 2, 3, 1, 2, 1 }));
	}

	@Test
	public void test2() {
		Assert.assertEquals(false, eachvalueoccurrence(new int[] { 2, 3, 1, 2, 1 }));
	}


	
	public boolean eachvalueoccurrence(int[] input)
	{
		Map<Integer, Integer> arr = new HashMap<Integer, Integer>();
		
		for(int i=0; i<input.length; i++)
		{
			if(arr.containsKey(input[i]))
			{
				arr.put(input[i], arr.get(input[i])+1);
			}
			else
			{
				arr.put(input[i], 1);
			}
		}
		
		Set<Integer> unique = new HashSet<Integer>(arr.values());
		
		return arr.size() == unique.size();
		
		
		
				
	}

}
