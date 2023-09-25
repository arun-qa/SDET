package mandatoryHomeWork.DSA.week13;

import org.junit.Test;
import org.testng.Assert;

public class isPalindrome_expandfromcenter {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(true, isPalindrome("RADAR"));
		System.out.println("true");
	}

	private boolean isPalindrome(String input) {
		
		int left = input.length()/2-1;
		int right;
		
		if(input.length()%2==0)
			right = input.length()/2;
		else 
			right = input.length()/2+1;
		
		while(right<input.length())
		{
			if(input.charAt(left)!=input.charAt(right))
				return false;
			
			left--;
			right++;
		}
			
		return true;

	}

}
