package week6;

import org.junit.Test;

import junit.framework.Assert;

/*
 * pseudocode
 * initialize count variable=0
 * find the leap years count from 1971 to previous of given year
 * count the whole days from 1971 to previous of given year and multiply with 365 and add count
 * check this year will be leap or not, if leap then change the feb into 29 and add the daysInMonth then add the days
 * finally count %7 and return the value 
 */

public class DayOfTheWeek {

	@Test
	public void test1() {
		String test1 = yearOfWeek(03, 03, 1980);
		Assert.assertEquals("Monday", test1);
	}

	@Test
	public void test4() {
		String test4 = yearOfWeek(31, 8, 2019);
		Assert.assertEquals("Saturday", test4);
	}

	@Test
	public void test2() {
		String test2 = yearOfWeek(18, 7, 1999);
		Assert.assertEquals("Sunday", test2);
	}

	@Test
	public void test3() {
		String test3 = yearOfWeek(15, 8, 1993);
		Assert.assertEquals("Sunday", test3);
	}

	public String yearOfWeek(int day, int month, int year) //10
	{
		int count=0;
		for (int i =1971 ; i < year; i++) 
		{
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
                count++;
            }
		}
		count=(year-1971)*365+count;
		
		int[] daysInMonth={31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
			daysInMonth[1]=29;
		}
		for(int i=1;i<month; i++){
			count+=daysInMonth[i];
		}
		count=count+day;
		count=count-3;
		return days[count%7];
	}

}
