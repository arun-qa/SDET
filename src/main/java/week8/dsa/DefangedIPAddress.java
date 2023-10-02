package week8.dsa;

import java.util.Arrays;

public class DefangedIPAddress {
	
	public static void main(String args[])
	{
   
	String input = "1.1.1.1";
	String[] inputarr = input.split("");
	String output ="";
	
	for(int i=0; i<inputarr.length;i++)
	{
		if(inputarr[i].equals("."))
		{
			inputarr[i]	= "[.]";
					
		}
	}
	for(int j=0; j<inputarr.length;j++)
	{
		output = output+inputarr[j];
		
		System.out.println(Arrays.toString(inputarr));
		System.out.println(output);
	}
}
}





