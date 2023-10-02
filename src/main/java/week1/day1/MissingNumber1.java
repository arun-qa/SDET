package week1.day1;

import java.util.Arrays;

public class MissingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {0,1,3,4};
		
		Arrays.sort(input);
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i]!=i)
			{
				System.out.println(i);
			}
			
		}
		

	}

}
