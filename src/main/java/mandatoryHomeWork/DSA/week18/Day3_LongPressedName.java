package mandatoryHomeWork.DSA.week18;

import org.junit.Test;

import junit.framework.Assert;

public class Day3_LongPressedName {
	
	//https://leetcode.com/problems/long-pressed-name/
	
	@Test
	public void test1()
	{
	Assert.assertEquals(true, isLongPressedName("alex","aaleex"));	
	}
	

	@Test
	public void test2()
	{
	Assert.assertEquals(true, isLongPressedName("z","z"));	
	}

	public boolean isLongPressedName(String name, String typed) {

		int left = 0;
		int right = 0;

		while (right < typed.length()) {
			if (left < name.length() && name.charAt(left) == typed.charAt(right)) {
				left++;
				right++;
			} else if (right != 0 && name.charAt(left - 1) == typed.charAt(right)) {
				right++;
			} else {
				return false;
			}

		}
		return left == name.length();

	}

}
