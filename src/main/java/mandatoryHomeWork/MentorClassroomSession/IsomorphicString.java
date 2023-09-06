package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

//Pseudocode
/* https://leetcode.com/problems/isomorphic-strings/description/
 * 1. create 2 array with length 256
 * 2. iterate with each character then store i+1 in the 2 arrays(arr1,arr2)
 * 3. check for the condition whether 2 arrays(arr1,arr2) are not equal 
 * 4. if yes false else true
*/


public class IsomorphicString {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isIsomorphic("paper","title"));
	}
	

	@Test
	public void test2()
	{
		Assert.assertEquals(false, isIsomorphic("foo","bar"));
	}
	
	 public boolean isIsomorphic(String s, String t) {
	       int[] arr1 = new int[256];
	       int[] arr2 = new int[256];

	       for(int i =0;i<s.length();i++){
	           if(arr1[s.charAt(i)] != arr2[t.charAt(i)]){
	               return false;
	           }
	           arr1[s.charAt(i)] = i+1;
	           arr2[t.charAt(i)] = i+1;
	       }

	       return true;
	    }
}
