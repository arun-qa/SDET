package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

public class CheckArmstrongNumber {

	@Test
	public void test1() {
		Assert.assertEquals(true, isArmstrong(153));
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, isArmstrong(1634));
	}

	@Test
	public void test3() {
		Assert.assertEquals(false, isArmstrong(163));
	}

	public static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;

			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

}
