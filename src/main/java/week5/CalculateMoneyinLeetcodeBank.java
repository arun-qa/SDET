package week5;

import org.junit.Test;

import junit.framework.Assert;

public class CalculateMoneyinLeetcodeBank {

	@Test
	public void test1() {
		Assert.assertEquals(10, numberofdays(4));
	}

	@Test
	public void test2() {
		Assert.assertEquals(37, numberofdays(10));
	}

	@Test
	public void test3() {
		Assert.assertEquals(96, numberofdays(20));
	}

	public int numberofdays(int n) {

		int totalmoney = 0;
		int dailymoney = 1;
		for (int i = 1; i <= n; i++) {
			totalmoney = totalmoney + dailymoney++;

			if (i % 7 == 0) {

				dailymoney = dailymoney - 6;
			}

		}
		return totalmoney;
	}

}
