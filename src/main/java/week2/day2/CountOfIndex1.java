package week2.day2;

import java.util.Arrays;

public class CountOfIndex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		int[] input = {1, 2, 3, 4, 4, 6};
		
		System.out.println(input.length);
		
		Arrays.sort(input);
		
		for(int i=0; i<=input.length-2; i++)
		{
			for(int j=i+1; j<=input.length-1; j++)
			{
				if(input[j]==input[i]+1)
				{
					count++;
				}
			}
		}	
		System.out.println(count);
	}

}
