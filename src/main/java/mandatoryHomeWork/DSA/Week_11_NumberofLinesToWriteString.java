package mandatoryHomeWork.DSA;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Week_11_NumberofLinesToWriteString {
	/*
	 * https://leetcode.com/problems/number-of-lines-to-write-string/submissions/
	 * 
	 * input is int[] and string  output should be int[] 
	 * Initialize int[] of size 2 
	 * Run a for each loop for s.toCharArray() Take the given width value for the char by using width[ch-'a'];
	 * If the width+sum>100, reset the sum & increment the  row counter 
	 * add the value of char width in sum in all other cases 
	 * assign op[0] = row and op[2] = sum
	 * return output
	 */
	
	@Test
	public void test1()
	{
		int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s="abcdefghijklmnopqrstuvwxyz";
		int[] output =  {3,60};
		Assert.assertEquals(output, numberOfLines(width, s));
	}
	
	@Test
	public void test2() {
		int[] width = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String s="bbbcccdddaaa";
		int[] output =  {2,4};
		Assert.assertEquals(output, numberOfLines(width, s));
	}
	
	@Test
	public void test3() {
		int[] width = {2,4,6,8,2,4,6,10,2,4,6,8,2,4,6,8,10,10,10,10,10,10,10,10,10,10};
		String s="l";
		int[] output =  {1,8};
		Assert.assertEquals(output, numberOfLines(width, s));
	}
		
			
			
	public int[] numberOfLines(int[] widths, String s) {

		int sum = 0;

		int row = 1;

		int[] output = new int[2];

		for (char ch : s.toCharArray()) {

			int charW = widths[ch - 'a'];

			if (charW + sum > 100) {
				row++;
				sum = 0;
			}
			sum = sum + charW;

		}

		output[0] = row;
		output[1] = sum;

		return output;

	}

}
