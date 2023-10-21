package mandatoryHomeWork.DSA.week17;

import java.util.Arrays;

public class Sort_AscendingOrder_SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {3,2,4,1,-5};
		
		for(int i=0; i<arr.length-1; i++)
		{
			int min = i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));


	}

}
