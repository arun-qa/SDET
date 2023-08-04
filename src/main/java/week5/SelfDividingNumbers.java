package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;


public class SelfDividingNumbers {
	
	@Test
	public void test1() {
		Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), selfDividingNumbers(1,22));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(Arrays.asList(48,55,66,77), selfDividingNumbers(47,85));
	}
	
	 public List<Integer> selfDividingNumbers(int left, int right) {
	       
		 List<Integer> list = new ArrayList<Integer>();
	        
		 for(int i = left;i<=right;i++){
	           
			 if(isDividing(i))
			 {
	                list.add(i);
	            }
	        }
	        return list;
	    }
		
	public  boolean isDividing(int num){		
	
	int temp = num;
	
	int count = 0;
		
		while(num>0)
		{
			int remainder = num%10;
		
			if(remainder==0)
			{
					return false;			
			}
			if(temp%remainder!=0)
				
			{
			return false;
			}
			
			num=num/10;
		}
		
			return true;
		
	}

}
