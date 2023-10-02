package week2.day2;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigits {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int num=1;
		
		while(num>9) {
			
			int total=0;

		while(num>0)
		{
		 int remainder = num%10;
			
			total=total+remainder;
			
			num=num/10;
			
			}
				num=total;	
				
		}
		System.out.println(num);	*/
	
	@Test
	
	public void test1()
	{
		int actual = adddigits(3857);
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void test2()
	{	
		int actual = adddigits(1);
		Assert.assertEquals(1, actual);
	}
		
		public int adddigits(int num)
		{
			
			int n =num;  //O(1)
			
			if(n==0)     //O(1)
			{
				return num;

			}
			while(n>0)   //O(1)
			{
				n=n/10+(n%10);   // O(1)
				
				if(n<10) //O(1)
				{
					break;
				}
			}
			return n;
			
		}
		

		}

		
	


