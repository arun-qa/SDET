package mandatoryHomeWork.DSA.week17;

import java.util.Arrays;

public class Sort_AscendingOrder_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5,2,9,3,6};
		
		for(int i=1; i<arr.length; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
            arr[j] = temp;

		}
		
		System.out.println(Arrays.toString(arr));


	}

}
