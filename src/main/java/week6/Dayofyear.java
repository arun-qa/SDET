package week6;

public class Dayofyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numberOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		String GivenDate = "2019-02-10";
		
		int year = Integer.parseInt(GivenDate.substring(0, 4));
		int month = Integer.parseInt(GivenDate.substring(5, 7));
		int date = Integer.parseInt(GivenDate.substring(8, 10));
		
		int days=0;
		
		for(int n=0; n<month-1; n++)
		{
			days = days+numberOfDays[n];
		}
		
		if((month>2) && (year%4==0) && (year % 100 != 0 || year%400==0))
		{
			System.out.println(days+date+1);
		}
		
		else
			System.out.println(days+date);

	}

}
