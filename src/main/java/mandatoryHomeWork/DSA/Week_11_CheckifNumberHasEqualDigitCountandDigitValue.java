package mandatoryHomeWork.DSA;

import org.junit.Test;

import junit.framework.Assert;


//https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/
/*Psuedocode: 
1. get the input number string
2. if the input length is 1 , return false
3. if the input length is greater than 1, get the frequency of each digit
4. compare each digit frequency with the current iterator 'i'
5. if both are same, return true
6.else return false

Time complexity - O[N^2]
 * 
 * 
 * 
 */

public class Week_11_CheckifNumberHasEqualDigitCountandDigitValue {

	@Test
	public void test1() {
		String num = "1210";
		boolean output = true;
		boolean actOutput = digitCount(num);
		Assert.assertEquals(output, actOutput);
	}

	private boolean digitCount(String num) {
		
		boolean flag = true;
		if(num.length()<=1) return false;
		int count;
		for(int i=0;i<num.length();i++) { //O[N]
			count = 0;
			for(int j=0;j<num.length();j++) { //O[N^2]
				int x = (int)num.charAt(j)-'0';
				if(i==x) count++;
			}
			if(count!=(int)num.charAt(i) -'0') {
				flag = false;
			}
		}
		return flag;
	}

}
