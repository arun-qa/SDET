package mandatoryHomeWork.DSA.week18;

import org.junit.Test;

import junit.framework.Assert;

public class Day4_ReverseStringII {
	
	/* https://leetcode.com/problems/reverse-string-ii/
	 * 
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals("bacdfeg", reverseStr("abcdefg",2));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("cbadefg", reverseStr("abcdefg",3));
	}

	public String reverseStr(String s, int k) {

		int start = 0;
		int end = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i += 2 * k) { // O[N]
			start = i;
			end = Math.min(i + k - 1, s.length() - 1);
			while (start < end) {

				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;

				start++;
				end--;
			}

		}
		return new String(ch);

	}

}
