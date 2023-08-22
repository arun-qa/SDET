package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class LastStoneWeight {
	
	/* Pseudocode
	 * Get an input as int[] 
	 * Create an Array list, iterate the int[] values and add it in array list
	 * check the size of arraylist, if it is greater than 1 follow the below steps
	 * Sort the elements available in Arraylist
	 * Store the largest & second largest stone in temp variable
	 * remove the largest & second largest value from arraylist
	 * if largest & second largest are not same then subract the values
	 * Add the subracted value to Array list
	 * Check if arraylist becomes empty then return 0
	 * else return the 0th index value of array list
	 * 
	 * 
	 * Time Complexity = O(n) * O(n log n) = O(n^2 log n)
	 */
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(1, lastStoneWeight(new int[] {2,7,4,1,8,1}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, lastStoneWeight(new int[] {1}));
	}
	
	@Test
	public void test3()
	{
		Assert.assertEquals(10, lastStoneWeight(new int[] {10,10,10}));
	}
	
	
	
	 public int lastStoneWeight(int[] stones) {
		 
		 List<Integer> obj=new ArrayList<Integer>();
	        
		 for(int i=0;i<stones.length;i++)
		 {
	           obj.add(stones[i]);
		 }
		 
		 while(obj.size()>1) //O(n)
		 {
		 Collections.sort(obj); //O(n log n)
		 
		 int biggeststone = obj.get(obj.size()-1);
		 int secondbiggeststone = obj.get(obj.size()-2);
		 
		 obj.remove(obj.size()-1);
		 obj.remove(obj.size()-1);
		 
		 if(biggeststone!=secondbiggeststone)
		 {
			 obj.add(biggeststone-secondbiggeststone);
		 }
		 
		if(obj.isEmpty())
			return 0;		
	        
	    }
		 return obj.get(0);
		 }

}
