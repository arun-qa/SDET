package week3.day2;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestNumber {
	
	@Test
	
	public void test1()
	{
	String input = "dfa12321afd";
	int output = 2;
	Assert.assertEquals(output, secondLargest(input));
	}
	
	public void test2()
	{
	String input = "abc1111";
	int output = -1;
	Assert.assertEquals(output, secondLargest(input));
	}
	
	
	public int secondLargest(String s)
	{
		s=s.replaceAll("[a-zA-Z]", "");//1,2,3,2,1 //1,1,1,1,
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)-'0'>=max){
                max=s.charAt(i)-'0';
            }
        }
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)-'0'>sMax)&&(s.charAt(i)-'0'!=max)){
                sMax=s.charAt(i)-'0';
            }
        }
        if(sMax == Integer.MIN_VALUE)
        {
            return -1;
        }
        return sMax;
			
		
	}

}
