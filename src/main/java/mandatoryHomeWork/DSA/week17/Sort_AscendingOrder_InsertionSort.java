package mandatoryHomeWork.DSA.week17;

import java.util.Arrays;

public class Sort_AscendingOrder_InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Pseudocode
		1. outer loop will be 0 to array len-1
		2. Inner loop will be i+1 to array length
		3. find the minimum value index
		4. swap with the minimum index with current index


		Time Complexity - O[N^2]
		Space Complexity - O[C] ~ O[1]
		 */
		
		int[] arr = new int[] {5,2,9,3,6};
		
		 for (int i = 1; i < arr.length; i++) {
             if(arr[i] < arr[i-1]){
                 int pivot = i;
                 while(pivot > 0){
                     if(arr[pivot] < arr[pivot-1]){
                         int temp = arr[pivot];
                         arr[pivot] = arr[pivot-1];
                         arr[pivot-1] = temp;
                         pivot--;
                     }else
                         break;
                 }
             }
        }
		
		
		System.out.println(Arrays.toString(arr));


	}

}
